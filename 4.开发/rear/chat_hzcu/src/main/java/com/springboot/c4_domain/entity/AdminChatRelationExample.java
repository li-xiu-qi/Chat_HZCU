package com.springboot.c4_domain.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminChatRelationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public AdminChatRelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
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
     * This method corresponds to the database table admin_chat_relation
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
     * This method corresponds to the database table admin_chat_relation
     *
     * @mbggenerated Fri Mar 08 11:49:11 CST 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_chat_relation
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
     * This class corresponds to the database table admin_chat_relation
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

        public Criteria andAdminChatRelationIdIsNull() {
            addCriterion("admin_chat_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdIsNotNull() {
            addCriterion("admin_chat_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdEqualTo(Integer value) {
            addCriterion("admin_chat_relation_id =", value, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdNotEqualTo(Integer value) {
            addCriterion("admin_chat_relation_id <>", value, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdGreaterThan(Integer value) {
            addCriterion("admin_chat_relation_id >", value, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_chat_relation_id >=", value, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdLessThan(Integer value) {
            addCriterion("admin_chat_relation_id <", value, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_chat_relation_id <=", value, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdIn(List<Integer> values) {
            addCriterion("admin_chat_relation_id in", values, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdNotIn(List<Integer> values) {
            addCriterion("admin_chat_relation_id not in", values, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_chat_relation_id between", value1, value2, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminChatRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_chat_relation_id not between", value1, value2, "adminChatRelationId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdIsNull() {
            addCriterion("admin_chat_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdIsNotNull() {
            addCriterion("admin_chat_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdEqualTo(Integer value) {
            addCriterion("admin_chat_id =", value, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdNotEqualTo(Integer value) {
            addCriterion("admin_chat_id <>", value, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdGreaterThan(Integer value) {
            addCriterion("admin_chat_id >", value, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_chat_id >=", value, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdLessThan(Integer value) {
            addCriterion("admin_chat_id <", value, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_chat_id <=", value, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdIn(List<Integer> values) {
            addCriterion("admin_chat_id in", values, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdNotIn(List<Integer> values) {
            addCriterion("admin_chat_id not in", values, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_chat_id between", value1, value2, "adminChatId");
            return (Criteria) this;
        }

        public Criteria andAdminChatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_chat_id not between", value1, value2, "adminChatId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table admin_chat_relation
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
     * This class corresponds to the database table admin_chat_relation
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