package com.springboot.c3_dao;

import com.springboot.c4_domain.entity.UserWishComment;
import com.springboot.c4_domain.entity.UserWishCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserWishCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int countByExample(UserWishCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int deleteByExample(UserWishCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int deleteByPrimaryKey(Integer userWishCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int insert(UserWishComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int insertSelective(UserWishComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    List<UserWishComment> selectByExample(UserWishCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    UserWishComment selectByPrimaryKey(Integer userWishCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByExampleSelective(@Param("record") UserWishComment record, @Param("example") UserWishCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByExample(@Param("record") UserWishComment record, @Param("example") UserWishCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByPrimaryKeySelective(UserWishComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByPrimaryKey(UserWishComment record);
}