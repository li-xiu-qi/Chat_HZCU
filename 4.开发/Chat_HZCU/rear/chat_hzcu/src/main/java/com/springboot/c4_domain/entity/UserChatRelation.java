package com.springboot.c4_domain.entity;

public class UserChatRelation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_chat_relation.user_chat_relation_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    //@TableId(value = "user_chat_relation_id", type = IdType.AUTO)
    private Integer userChatRelationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_chat_relation.user_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_chat_relation.user_chat_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    private Integer userChatId;

    public UserChatRelation() {
    }

    public UserChatRelation(Integer userId, Integer userChatId) {
        this.userId = userId;
        this.userChatId = userChatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_chat_relation.user_chat_relation_id
     *
     * @return the value of user_chat_relation.user_chat_relation_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public Integer getUserChatRelationId() {
        return userChatRelationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_chat_relation.user_chat_relation_id
     *
     * @param userChatRelationId the value for user_chat_relation.user_chat_relation_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void setUserChatRelationId(Integer userChatRelationId) {
        this.userChatRelationId = userChatRelationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_chat_relation.user_id
     *
     * @return the value of user_chat_relation.user_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_chat_relation.user_id
     *
     * @param userId the value for user_chat_relation.user_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_chat_relation.user_chat_id
     *
     * @return the value of user_chat_relation.user_chat_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public Integer getUserChatId() {
        return userChatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_chat_relation.user_chat_id
     *
     * @param userChatId the value for user_chat_relation.user_chat_id
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void setUserChatId(Integer userChatId) {
        this.userChatId = userChatId;
    }

    @Override
    public String toString() {
        return "UserChatRelation{" +
                "userChatRelationId=" + userChatRelationId +
                ", userId=" + userId +
                ", userChatId=" + userChatId +
                '}';
    }
}