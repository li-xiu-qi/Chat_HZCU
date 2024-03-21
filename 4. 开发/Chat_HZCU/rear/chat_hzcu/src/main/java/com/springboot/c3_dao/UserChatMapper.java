package com.springboot.c3_dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.c4_domain.entity.UserChat;
import com.springboot.c4_domain.entity.UserChatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserChatMapper extends BaseMapper<UserChat> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int countByExample(UserChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int deleteByExample(UserChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int deleteByPrimaryKey(Integer userChatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int insert(UserChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int insertSelective(UserChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    List<UserChat> selectByExampleWithBLOBs(UserChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    List<UserChat> selectByExample(UserChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    UserChat selectByPrimaryKey(Integer userChatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByExampleSelective(@Param("record") UserChat record, @Param("example") UserChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("record") UserChat record, @Param("example") UserChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByExample(@Param("record") UserChat record, @Param("example") UserChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByPrimaryKeySelective(UserChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(UserChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_chat
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByPrimaryKey(UserChat record);
}