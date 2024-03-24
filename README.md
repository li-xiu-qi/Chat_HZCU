# Chat_HZCU
## 1. 现阶段情况：

- 前后端系统已经完成，可以点击下方链接访问，可以直接点击**游客登录**(免注册登录)：
  - 用户：http://106.12.19.123:8501/

  - 管理员：http://106.12.19.123:8502/

- 整体效果如下：
  - 用户：

  ![用户](https://github.com/19157681683/Chat_HZCU/blob/main/resource/%E7%94%A8%E6%88%B7.png)

  - 管理员：

  ![管理员](https://github.com/19157681683/Chat_HZCU/blob/main/resource/%E7%AE%A1%E7%90%86%E5%91%98.png)



## 2. 系统功能：

- 用户端：**用户对话**，用户吐槽，登录/注册/忘记密码
- 管理员端：**智能对话**（NL2图表），首页报表，用户管理，吐槽管理



## 3. 核心功能：

#### 用户对话API：

- 学业：帮助新生家长/同学了解学校基本情况，老师了解报销/激励情况（信息来源：学校官网）

- 生活：帮助同学完成生活相关问题（信息来源：学生生活论坛）

- 其他：使用Agent帮助学生点餐，回答互联网信息，以及周边景点/餐厅推荐等

#### 管理员对话API:

- 管理员通过对话，系统可以生成对应SQL，执行SQL，展示对应的Echarts图表



## 4. 基本技术栈：

- 系统：前端Streamlit（后期换Vue/React），后端SSM+SpringBoot
- 模型：LangChain/Llama Index/ElasticSearch，增量预训练/指令微调，Agent，模型部署



## 5. 后续工作：

- 主体就是围绕用户和管理员的对话API，利用大模型应用和微调技术处理，大致方向如下，大家选自己喜欢的一个就ok，放大看更清晰：

![选择方向](https://github.com/19157681683/Chat_HZCU/blob/main/resource/%E4%B9%A6%E7%94%9F%E6%B5%A6%E8%AF%AD-%E9%A1%B9%E7%9B%AE%E5%88%86%E5%B7%A5.png)



## 6. 进度：

- 第1周：2024-03-24：系统整体任务和各小组长技术分析【8人】
  
  ![第一次小组会议](https://github.com/19157681683/Chat_HZCU/blob/main/resource/%E7%AC%AC%E4%B8%80%E6%AC%A1%E5%B0%8F%E7%BB%84%E4%BC%9A%E8%AE%AE.png)