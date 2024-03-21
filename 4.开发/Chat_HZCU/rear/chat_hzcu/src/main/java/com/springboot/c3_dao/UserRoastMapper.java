package com.springboot.c3_dao;

import com.springboot.c4_domain.entity.UserRoast;
import com.springboot.c4_domain.entity.UserRoastExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRoastMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int countByExample(UserRoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int deleteByExample(UserRoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int deleteByPrimaryKey(Integer userRoastId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int insert(UserRoast record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int insertSelective(UserRoast record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    List<UserRoast> selectByExample(UserRoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    UserRoast selectByPrimaryKey(Integer userRoastId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByExampleSelective(@Param("record") UserRoast record, @Param("example") UserRoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByExample(@Param("record") UserRoast record, @Param("example") UserRoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByPrimaryKeySelective(UserRoast record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roast
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    int updateByPrimaryKey(UserRoast record);
}