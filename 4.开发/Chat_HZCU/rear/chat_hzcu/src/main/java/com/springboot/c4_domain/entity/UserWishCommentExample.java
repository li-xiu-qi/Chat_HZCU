package com.springboot.c4_domain.entity;

import java.util.ArrayList;
import java.util.List;

public class UserWishCommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public UserWishCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserWishCommentIdIsNull() {
            addCriterion("user_wish_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdIsNotNull() {
            addCriterion("user_wish_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdEqualTo(Integer value) {
            addCriterion("user_wish_comment_id =", value, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdNotEqualTo(Integer value) {
            addCriterion("user_wish_comment_id <>", value, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdGreaterThan(Integer value) {
            addCriterion("user_wish_comment_id >", value, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_wish_comment_id >=", value, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdLessThan(Integer value) {
            addCriterion("user_wish_comment_id <", value, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_wish_comment_id <=", value, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdIn(List<Integer> values) {
            addCriterion("user_wish_comment_id in", values, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdNotIn(List<Integer> values) {
            addCriterion("user_wish_comment_id not in", values, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("user_wish_comment_id between", value1, value2, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserWishCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_wish_comment_id not between", value1, value2, "userWishCommentId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andWishIdIsNull() {
            addCriterion("wish_id is null");
            return (Criteria) this;
        }

        public Criteria andWishIdIsNotNull() {
            addCriterion("wish_id is not null");
            return (Criteria) this;
        }

        public Criteria andWishIdEqualTo(Integer value) {
            addCriterion("wish_id =", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotEqualTo(Integer value) {
            addCriterion("wish_id <>", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdGreaterThan(Integer value) {
            addCriterion("wish_id >", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wish_id >=", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdLessThan(Integer value) {
            addCriterion("wish_id <", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdLessThanOrEqualTo(Integer value) {
            addCriterion("wish_id <=", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdIn(List<Integer> values) {
            addCriterion("wish_id in", values, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotIn(List<Integer> values) {
            addCriterion("wish_id not in", values, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdBetween(Integer value1, Integer value2) {
            addCriterion("wish_id between", value1, value2, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wish_id not between", value1, value2, "wishId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_wish_comment
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 08 11:49:11 CST 2024
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_wish_comment
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}