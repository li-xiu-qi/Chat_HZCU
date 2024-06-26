# encoding: UTF-8
"""

@author = 李林名
@email = lishuai1199@qq.com
@create_time = 2024-03-26 21:06

"""
import json
import re
import requests
import html2text
from openai import OpenAI
from c1_model import chat_model_response
from c1_model import *


# 1. 根据url返回对应的html
def html_from_url(url):
    try:
        response = requests.get(url)
        response.raise_for_status()  # 检查请求是否成功
        return response.text  # 返回HTML内容
    except requests.RequestException as e:
        print(f"Error occurred while fetching the HTML from URL: {e}")
        return None

# 2. 将html转为文本
def text_from_html(html_content, ignore_links=False, ignore_images=False):
    # 初始化html2text处理器
    processor = html2text.HTML2Text()
    processor.ignore_links = ignore_links  # 忽略所有的链接
    processor.ignore_images = ignore_images  # 忽略所有的图片
    # # 将字节序列解码为字符串
    # html_content_str = html_content
    # 将HTML内容转换为文本
    text_content = processor.handle(html_content)
    return text_content

# 3. 提取文本信息，删除所有英文字符。不包括标点和换行符，数字
def remove_english_characters_preserve_punctuation(text):
    pattern = r'[a-zA-Z/\[\]|!*\-]'
    return re.sub(pattern, '', text)




# 4.1 让模型提取文本标题
def title_from_model(company_model_type, text_content):
    # 获得url提示词
    user_input = f"""
    角色：你是一位专业的中文阅读大师
    目标：你当前的任务是通过阅读下列文本，使用不超过10个汉字描述文章的主题
    输入数据：
    {text_content}
    """
    # 整体message
    messages = [
        {"role": "system",
         "content": "你是人工智能助手，你更擅长中文和英文的对话。你会为用户提供有帮助，准确的回答。"},
        {"role": "user", "content": user_input}
    ]
    # 调用模型
    vendor, model, api_key = get_vender_info(company_model_type)
    model_response = chat_model_response(vendor, api_key, model, messages)
    return model_response


# 4.2 模型提取网站链接
def url_from_model(company_model_type, text_content):
    # 获得url提示词
    user_input = f"""
    角色：你是一位专业的数据处理工程师
    目标：你当前的任务是从下面文本中捕获对应的需要超链接url对应的名词，并附带上对应的url
    注意：url首位统一添加 http://www.hzcu.edu.cn，结尾必须按照.html结尾
    输出格式：其中，下面的数据格式为字典/json格式，其中key为需要捕获的名词，value为对应的url
    ```
    "教学科研机构":"http://www.hzcu.edu.cn/col/col129/index.html"
    "... : ..."
    ```
    输入数据：
    {text_content}
    """
    # 整体message
    messages = [
        {"role": "system",
         "content": "你是人工智能助手，你更擅长中文和英文的对话。你会为用户提供有帮助，准确的回答。"},
        {"role": "user", "content": user_input}
    ]
    # 调用模型
    vendor, model, api_key = get_vender_info(company_model_type)
    model_response = chat_model_response(vendor, api_key, model, messages)
    return model_response


# 4.3 模型提取图片链接
def image_from_model(company_model_type, text_content):
    # 获得url提示词
    user_input = f"""
    角色：你是一位专业的数据处理工程师
    目标：你当前的任务是从下面文本中捕获对应的图片url对应的名词，并附带上对应的url，一般结尾是png,jpg等图片格式
    注意：url首位统一添加 http://www.hzcu.edu.cn，不需要.html结尾的，不要.gif结尾的文件
    输出格式：其中，下面的数据格式为字典/json格式，其中key为需要捕获的名词，value为对应的url。请确保输出为JSON格式
    ```
    "浙大城市学院":"http://www.hzcu.edu.cn/picture/0/1803201327374572255.png"
    "... : ..."
    ```
    输入数据：
    {text_content}
    """
    # 整体message
    messages = [
        {"role": "system",
         "content": "你是人工智能助手，你更擅长中文和英文的对话。你会为用户提供有帮助，准确的回答。"},
        {"role": "user", "content": user_input}
    ]
    # 调用模型
    vendor, model, api_key = get_vender_info(company_model_type)
    model_response = chat_model_response(vendor, api_key, model, messages)
    return model_response


# 模型提取文件链接


# 模型提取其他链接


# 模型提取文本的问答对
def qa_from_model(company_model_type, text_content):
    # 获得url提示词
    user_input = f"""
    角色：你是一位专业的数据处理工程师
    目标：你当前的任务是从下面文本中捕获对应的问答对,即是Json格式
    注意：不要超过10个问答对。在确定输出之前，请检查当前输入是否符合原文。对于问题，必须给出确定的数字作为答案，不要使用大概，余等词。
    输出格式：其中，下面的数据格式为字典/json格式，其中key为需要捕获的问题，value为对应的答案。请确保输出为JSON格式，只需要1级json就可，不需要多级。
    ```
    "浙大城市学院是什么时候创建的?": "1999年"
    "浙大城市学院的校园面积是多少?": "校舍面积51万余平方米",
    ```
    输入数据：
    {text_content}
    """
    # 整体message
    messages = [
        {"role": "system",
         "content": "你是人工智能助手，你更擅长中文和英文的对话。你会为听从用户的指令，用户提供有帮助，准确的回答。"},
        {"role": "user", "content": user_input}
    ]
    # 调用模型
    vendor, model, api_key = get_vender_info(company_model_type)
    model_response = chat_model_response(vendor, api_key, model, messages)
    return model_response



# 5. 从模型的响应中提取Json数据： 去掉```json
def json_from_model_response(model_response):
    # 如果模型响应为空，则返回空字典
    if model_response is None:
        return {}
    # 去除字符串开头和结尾的特定字符
    cleaned_json_str = "{" + model_response.split('{')[1].split("}")[0] + "}"
    json_data = json.loads(cleaned_json_str)
    return json_data