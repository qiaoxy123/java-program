package org.whr.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UuserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUlimitIsNull() {
            addCriterion("ulimit is null");
            return (Criteria) this;
        }

        public Criteria andUlimitIsNotNull() {
            addCriterion("ulimit is not null");
            return (Criteria) this;
        }

        public Criteria andUlimitEqualTo(Boolean value) {
            addCriterion("ulimit =", value, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitNotEqualTo(Boolean value) {
            addCriterion("ulimit <>", value, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitGreaterThan(Boolean value) {
            addCriterion("ulimit >", value, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ulimit >=", value, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitLessThan(Boolean value) {
            addCriterion("ulimit <", value, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitLessThanOrEqualTo(Boolean value) {
            addCriterion("ulimit <=", value, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitIn(List<Boolean> values) {
            addCriterion("ulimit in", values, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitNotIn(List<Boolean> values) {
            addCriterion("ulimit not in", values, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitBetween(Boolean value1, Boolean value2) {
            addCriterion("ulimit between", value1, value2, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUlimitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ulimit not between", value1, value2, "ulimit");
            return (Criteria) this;
        }

        public Criteria andUuptimeIsNull() {
            addCriterion("uuptime is null");
            return (Criteria) this;
        }

        public Criteria andUuptimeIsNotNull() {
            addCriterion("uuptime is not null");
            return (Criteria) this;
        }

        public Criteria andUuptimeEqualTo(Date value) {
            addCriterion("uuptime =", value, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeNotEqualTo(Date value) {
            addCriterion("uuptime <>", value, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeGreaterThan(Date value) {
            addCriterion("uuptime >", value, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uuptime >=", value, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeLessThan(Date value) {
            addCriterion("uuptime <", value, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeLessThanOrEqualTo(Date value) {
            addCriterion("uuptime <=", value, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeIn(List<Date> values) {
            addCriterion("uuptime in", values, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeNotIn(List<Date> values) {
            addCriterion("uuptime not in", values, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeBetween(Date value1, Date value2) {
            addCriterion("uuptime between", value1, value2, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUuptimeNotBetween(Date value1, Date value2) {
            addCriterion("uuptime not between", value1, value2, "uuptime");
            return (Criteria) this;
        }

        public Criteria andUdidIsNull() {
            addCriterion("udid is null");
            return (Criteria) this;
        }

        public Criteria andUdidIsNotNull() {
            addCriterion("udid is not null");
            return (Criteria) this;
        }

        public Criteria andUdidEqualTo(Integer value) {
            addCriterion("udid =", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotEqualTo(Integer value) {
            addCriterion("udid <>", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThan(Integer value) {
            addCriterion("udid >", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("udid >=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThan(Integer value) {
            addCriterion("udid <", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThanOrEqualTo(Integer value) {
            addCriterion("udid <=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidIn(List<Integer> values) {
            addCriterion("udid in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotIn(List<Integer> values) {
            addCriterion("udid not in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidBetween(Integer value1, Integer value2) {
            addCriterion("udid between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotBetween(Integer value1, Integer value2) {
            addCriterion("udid not between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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