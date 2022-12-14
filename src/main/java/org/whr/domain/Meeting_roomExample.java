package org.whr.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meeting_roomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Meeting_roomExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNull() {
            addCriterion("maddress is null");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNotNull() {
            addCriterion("maddress is not null");
            return (Criteria) this;
        }

        public Criteria andMaddressEqualTo(String value) {
            addCriterion("maddress =", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotEqualTo(String value) {
            addCriterion("maddress <>", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThan(String value) {
            addCriterion("maddress >", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThanOrEqualTo(String value) {
            addCriterion("maddress >=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThan(String value) {
            addCriterion("maddress <", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThanOrEqualTo(String value) {
            addCriterion("maddress <=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLike(String value) {
            addCriterion("maddress like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotLike(String value) {
            addCriterion("maddress not like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressIn(List<String> values) {
            addCriterion("maddress in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotIn(List<String> values) {
            addCriterion("maddress not in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressBetween(String value1, String value2) {
            addCriterion("maddress between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotBetween(String value1, String value2) {
            addCriterion("maddress not between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMstateIsNull() {
            addCriterion("mstate is null");
            return (Criteria) this;
        }

        public Criteria andMstateIsNotNull() {
            addCriterion("mstate is not null");
            return (Criteria) this;
        }

        public Criteria andMstateEqualTo(Boolean value) {
            addCriterion("mstate =", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotEqualTo(Boolean value) {
            addCriterion("mstate <>", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThan(Boolean value) {
            addCriterion("mstate >", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mstate >=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThan(Boolean value) {
            addCriterion("mstate <", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThanOrEqualTo(Boolean value) {
            addCriterion("mstate <=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateIn(List<Boolean> values) {
            addCriterion("mstate in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotIn(List<Boolean> values) {
            addCriterion("mstate not in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateBetween(Boolean value1, Boolean value2) {
            addCriterion("mstate between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mstate not between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMtime1IsNull() {
            addCriterion("mtime1 is null");
            return (Criteria) this;
        }

        public Criteria andMtime1IsNotNull() {
            addCriterion("mtime1 is not null");
            return (Criteria) this;
        }

        public Criteria andMtime1EqualTo(Boolean value) {
            addCriterion("mtime1 =", value, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1NotEqualTo(Boolean value) {
            addCriterion("mtime1 <>", value, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1GreaterThan(Boolean value) {
            addCriterion("mtime1 >", value, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("mtime1 >=", value, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1LessThan(Boolean value) {
            addCriterion("mtime1 <", value, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1LessThanOrEqualTo(Boolean value) {
            addCriterion("mtime1 <=", value, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1In(List<Boolean> values) {
            addCriterion("mtime1 in", values, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1NotIn(List<Boolean> values) {
            addCriterion("mtime1 not in", values, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1Between(Boolean value1, Boolean value2) {
            addCriterion("mtime1 between", value1, value2, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("mtime1 not between", value1, value2, "mtime1");
            return (Criteria) this;
        }

        public Criteria andMtime2IsNull() {
            addCriterion("mtime2 is null");
            return (Criteria) this;
        }

        public Criteria andMtime2IsNotNull() {
            addCriterion("mtime2 is not null");
            return (Criteria) this;
        }

        public Criteria andMtime2EqualTo(Boolean value) {
            addCriterion("mtime2 =", value, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2NotEqualTo(Boolean value) {
            addCriterion("mtime2 <>", value, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2GreaterThan(Boolean value) {
            addCriterion("mtime2 >", value, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("mtime2 >=", value, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2LessThan(Boolean value) {
            addCriterion("mtime2 <", value, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2LessThanOrEqualTo(Boolean value) {
            addCriterion("mtime2 <=", value, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2In(List<Boolean> values) {
            addCriterion("mtime2 in", values, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2NotIn(List<Boolean> values) {
            addCriterion("mtime2 not in", values, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2Between(Boolean value1, Boolean value2) {
            addCriterion("mtime2 between", value1, value2, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("mtime2 not between", value1, value2, "mtime2");
            return (Criteria) this;
        }

        public Criteria andMtime3IsNull() {
            addCriterion("mtime3 is null");
            return (Criteria) this;
        }

        public Criteria andMtime3IsNotNull() {
            addCriterion("mtime3 is not null");
            return (Criteria) this;
        }

        public Criteria andMtime3EqualTo(Boolean value) {
            addCriterion("mtime3 =", value, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3NotEqualTo(Boolean value) {
            addCriterion("mtime3 <>", value, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3GreaterThan(Boolean value) {
            addCriterion("mtime3 >", value, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("mtime3 >=", value, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3LessThan(Boolean value) {
            addCriterion("mtime3 <", value, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3LessThanOrEqualTo(Boolean value) {
            addCriterion("mtime3 <=", value, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3In(List<Boolean> values) {
            addCriterion("mtime3 in", values, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3NotIn(List<Boolean> values) {
            addCriterion("mtime3 not in", values, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3Between(Boolean value1, Boolean value2) {
            addCriterion("mtime3 between", value1, value2, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("mtime3 not between", value1, value2, "mtime3");
            return (Criteria) this;
        }

        public Criteria andMtime4IsNull() {
            addCriterion("mtime4 is null");
            return (Criteria) this;
        }

        public Criteria andMtime4IsNotNull() {
            addCriterion("mtime4 is not null");
            return (Criteria) this;
        }

        public Criteria andMtime4EqualTo(Boolean value) {
            addCriterion("mtime4 =", value, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4NotEqualTo(Boolean value) {
            addCriterion("mtime4 <>", value, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4GreaterThan(Boolean value) {
            addCriterion("mtime4 >", value, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4GreaterThanOrEqualTo(Boolean value) {
            addCriterion("mtime4 >=", value, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4LessThan(Boolean value) {
            addCriterion("mtime4 <", value, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4LessThanOrEqualTo(Boolean value) {
            addCriterion("mtime4 <=", value, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4In(List<Boolean> values) {
            addCriterion("mtime4 in", values, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4NotIn(List<Boolean> values) {
            addCriterion("mtime4 not in", values, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4Between(Boolean value1, Boolean value2) {
            addCriterion("mtime4 between", value1, value2, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMtime4NotBetween(Boolean value1, Boolean value2) {
            addCriterion("mtime4 not between", value1, value2, "mtime4");
            return (Criteria) this;
        }

        public Criteria andMuptimeIsNull() {
            addCriterion("muptime is null");
            return (Criteria) this;
        }

        public Criteria andMuptimeIsNotNull() {
            addCriterion("muptime is not null");
            return (Criteria) this;
        }

        public Criteria andMuptimeEqualTo(Date value) {
            addCriterion("muptime =", value, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeNotEqualTo(Date value) {
            addCriterion("muptime <>", value, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeGreaterThan(Date value) {
            addCriterion("muptime >", value, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("muptime >=", value, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeLessThan(Date value) {
            addCriterion("muptime <", value, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeLessThanOrEqualTo(Date value) {
            addCriterion("muptime <=", value, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeIn(List<Date> values) {
            addCriterion("muptime in", values, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeNotIn(List<Date> values) {
            addCriterion("muptime not in", values, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeBetween(Date value1, Date value2) {
            addCriterion("muptime between", value1, value2, "muptime");
            return (Criteria) this;
        }

        public Criteria andMuptimeNotBetween(Date value1, Date value2) {
            addCriterion("muptime not between", value1, value2, "muptime");
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