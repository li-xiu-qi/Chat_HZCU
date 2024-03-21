package com.springboot.c4_domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Data
@Repository
public class RoastComment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast_comment.roast_comment_id
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    private Integer roastCommentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast_comment.time
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    @JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast_comment.content
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    private String content;

    public RoastComment() {
    }

    public RoastComment(Date time, String content) {
        this.time = time;
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast_comment.roast_comment_id
     *
     * @return the value of roast_comment.roast_comment_id
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    public Integer getRoastCommentId() {
        return roastCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast_comment.roast_comment_id
     *
     * @param roastCommentId the value for roast_comment.roast_comment_id
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    public void setRoastCommentId(Integer roastCommentId) {
        this.roastCommentId = roastCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast_comment.time
     *
     * @return the value of roast_comment.time
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast_comment.time
     *
     * @param time the value for roast_comment.time
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast_comment.content
     *
     * @return the value of roast_comment.content
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast_comment.content
     *
     * @param content the value for roast_comment.content
     *
     * @mbggenerated Mon Mar 18 22:37:41 CST 2024
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}