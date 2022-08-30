package vip.qiao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andTime1IsNull() {
            addCriterion("time1 is null");
            return (Criteria) this;
        }

        public Criteria andTime1IsNotNull() {
            addCriterion("time1 is not null");
            return (Criteria) this;
        }

        public Criteria andTime1EqualTo(Boolean value) {
            addCriterion("time1 =", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotEqualTo(Boolean value) {
            addCriterion("time1 <>", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThan(Boolean value) {
            addCriterion("time1 >", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time1 >=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThan(Boolean value) {
            addCriterion("time1 <", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThanOrEqualTo(Boolean value) {
            addCriterion("time1 <=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1In(List<Boolean> values) {
            addCriterion("time1 in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotIn(List<Boolean> values) {
            addCriterion("time1 not in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Between(Boolean value1, Boolean value2) {
            addCriterion("time1 between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time1 not between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime2IsNull() {
            addCriterion("time2 is null");
            return (Criteria) this;
        }

        public Criteria andTime2IsNotNull() {
            addCriterion("time2 is not null");
            return (Criteria) this;
        }

        public Criteria andTime2EqualTo(Boolean value) {
            addCriterion("time2 =", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotEqualTo(Boolean value) {
            addCriterion("time2 <>", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThan(Boolean value) {
            addCriterion("time2 >", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time2 >=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThan(Boolean value) {
            addCriterion("time2 <", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThanOrEqualTo(Boolean value) {
            addCriterion("time2 <=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2In(List<Boolean> values) {
            addCriterion("time2 in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotIn(List<Boolean> values) {
            addCriterion("time2 not in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2Between(Boolean value1, Boolean value2) {
            addCriterion("time2 between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time2 not between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andTime3IsNull() {
            addCriterion("time3 is null");
            return (Criteria) this;
        }

        public Criteria andTime3IsNotNull() {
            addCriterion("time3 is not null");
            return (Criteria) this;
        }

        public Criteria andTime3EqualTo(Boolean value) {
            addCriterion("time3 =", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotEqualTo(Boolean value) {
            addCriterion("time3 <>", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThan(Boolean value) {
            addCriterion("time3 >", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time3 >=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThan(Boolean value) {
            addCriterion("time3 <", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThanOrEqualTo(Boolean value) {
            addCriterion("time3 <=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3In(List<Boolean> values) {
            addCriterion("time3 in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotIn(List<Boolean> values) {
            addCriterion("time3 not in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3Between(Boolean value1, Boolean value2) {
            addCriterion("time3 between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time3 not between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andTime4IsNull() {
            addCriterion("time4 is null");
            return (Criteria) this;
        }

        public Criteria andTime4IsNotNull() {
            addCriterion("time4 is not null");
            return (Criteria) this;
        }

        public Criteria andTime4EqualTo(Boolean value) {
            addCriterion("time4 =", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotEqualTo(Boolean value) {
            addCriterion("time4 <>", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThan(Boolean value) {
            addCriterion("time4 >", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time4 >=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThan(Boolean value) {
            addCriterion("time4 <", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThanOrEqualTo(Boolean value) {
            addCriterion("time4 <=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4In(List<Boolean> values) {
            addCriterion("time4 in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotIn(List<Boolean> values) {
            addCriterion("time4 not in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4Between(Boolean value1, Boolean value2) {
            addCriterion("time4 between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time4 not between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andMuotimeIsNull() {
            addCriterion("muotime is null");
            return (Criteria) this;
        }

        public Criteria andMuotimeIsNotNull() {
            addCriterion("muotime is not null");
            return (Criteria) this;
        }

        public Criteria andMuotimeEqualTo(Date value) {
            addCriterion("muotime =", value, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeNotEqualTo(Date value) {
            addCriterion("muotime <>", value, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeGreaterThan(Date value) {
            addCriterion("muotime >", value, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("muotime >=", value, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeLessThan(Date value) {
            addCriterion("muotime <", value, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeLessThanOrEqualTo(Date value) {
            addCriterion("muotime <=", value, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeIn(List<Date> values) {
            addCriterion("muotime in", values, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeNotIn(List<Date> values) {
            addCriterion("muotime not in", values, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeBetween(Date value1, Date value2) {
            addCriterion("muotime between", value1, value2, "muotime");
            return (Criteria) this;
        }

        public Criteria andMuotimeNotBetween(Date value1, Date value2) {
            addCriterion("muotime not between", value1, value2, "muotime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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
    }
}