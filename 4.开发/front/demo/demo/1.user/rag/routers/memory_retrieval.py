from typing import Annotated

from fastapi import APIRouter, UploadFile, Depends, HTTPException, Cookie, Request
from langchain_community.vectorstores.milvus import Milvus
from starlette import status

from .memory_retrieval_module import get_milvus, save_and_split_pdf
from .chat_retrieval_module import get_ollama
from .serve_module import ChatWithRAG

memory_retrieval_router = APIRouter()


@memory_retrieval_router.post("/files_to_vector_store")
async def files_to_vector_store(pdf_file: UploadFile, milvus: Milvus = Depends(get_milvus)):
    try:
        documents = await save_and_split_pdf(pdf_file)
        milvus.from_documents(embedding=milvus.embedding_func, documents=documents)
        return {"filename": pdf_file.filename, "status": "success"}
    except Exception as e:
        raise HTTPException(status_code=status.HTTP_500_INTERNAL_SERVER_ERROR, detail=str(e))


@memory_retrieval_router.post("/chat_with_rag")
async def chat_with_rag(question: str, milvus: Milvus = Depends(get_milvus),
                        chat_model: str = Depends(get_ollama)):
    if not question:
        raise HTTPException(status_code=status.HTTP_400_BAD_REQUEST, detail="Question cannot be empty")

    try:
        chat = ChatWithRAG(chat_model=chat_model, vector_model=milvus)
        response = chat.process_conversational_rag(query=question, session_id="1")
    except Exception as e:
        raise HTTPException(status_code=status.HTTP_500_INTERNAL_SERVER_ERROR, detail=str(e))

    return {"response": response}


@memory_retrieval_router.get("/receive_request")
async def test(request: Request, acw_tc: Annotated[str | None, Cookie()] = None):
    print(acw_tc)
    host = request.headers.get("host")
    print(f"Domain: {host}")
    return {"status": "success"}
