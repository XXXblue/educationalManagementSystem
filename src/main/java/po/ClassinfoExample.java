package po;

import java.util.ArrayList;
import java.util.List;

public class ClassinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassinfoExample() {
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

        public Criteria andClassnumIsNull() {
            addCriterion("ClassNum is null");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNotNull() {
            addCriterion("ClassNum is not null");
            return (Criteria) this;
        }

        public Criteria andClassnumEqualTo(String value) {
            addCriterion("ClassNum =", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotEqualTo(String value) {
            addCriterion("ClassNum <>", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThan(String value) {
            addCriterion("ClassNum >", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThanOrEqualTo(String value) {
            addCriterion("ClassNum >=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThan(String value) {
            addCriterion("ClassNum <", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThanOrEqualTo(String value) {
            addCriterion("ClassNum <=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLike(String value) {
            addCriterion("ClassNum like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotLike(String value) {
            addCriterion("ClassNum not like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumIn(List<String> values) {
            addCriterion("ClassNum in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotIn(List<String> values) {
            addCriterion("ClassNum not in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumBetween(String value1, String value2) {
            addCriterion("ClassNum between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotBetween(String value1, String value2) {
            addCriterion("ClassNum not between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassmanIsNull() {
            addCriterion("ClassMan is null");
            return (Criteria) this;
        }

        public Criteria andClassmanIsNotNull() {
            addCriterion("ClassMan is not null");
            return (Criteria) this;
        }

        public Criteria andClassmanEqualTo(String value) {
            addCriterion("ClassMan =", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanNotEqualTo(String value) {
            addCriterion("ClassMan <>", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanGreaterThan(String value) {
            addCriterion("ClassMan >", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanGreaterThanOrEqualTo(String value) {
            addCriterion("ClassMan >=", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanLessThan(String value) {
            addCriterion("ClassMan <", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanLessThanOrEqualTo(String value) {
            addCriterion("ClassMan <=", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanLike(String value) {
            addCriterion("ClassMan like", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanNotLike(String value) {
            addCriterion("ClassMan not like", value, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanIn(List<String> values) {
            addCriterion("ClassMan in", values, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanNotIn(List<String> values) {
            addCriterion("ClassMan not in", values, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanBetween(String value1, String value2) {
            addCriterion("ClassMan between", value1, value2, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmanNotBetween(String value1, String value2) {
            addCriterion("ClassMan not between", value1, value2, "classman");
            return (Criteria) this;
        }

        public Criteria andClassmantelIsNull() {
            addCriterion("ClassManTel is null");
            return (Criteria) this;
        }

        public Criteria andClassmantelIsNotNull() {
            addCriterion("ClassManTel is not null");
            return (Criteria) this;
        }

        public Criteria andClassmantelEqualTo(String value) {
            addCriterion("ClassManTel =", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelNotEqualTo(String value) {
            addCriterion("ClassManTel <>", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelGreaterThan(String value) {
            addCriterion("ClassManTel >", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelGreaterThanOrEqualTo(String value) {
            addCriterion("ClassManTel >=", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelLessThan(String value) {
            addCriterion("ClassManTel <", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelLessThanOrEqualTo(String value) {
            addCriterion("ClassManTel <=", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelLike(String value) {
            addCriterion("ClassManTel like", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelNotLike(String value) {
            addCriterion("ClassManTel not like", value, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelIn(List<String> values) {
            addCriterion("ClassManTel in", values, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelNotIn(List<String> values) {
            addCriterion("ClassManTel not in", values, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelBetween(String value1, String value2) {
            addCriterion("ClassManTel between", value1, value2, "classmantel");
            return (Criteria) this;
        }

        public Criteria andClassmantelNotBetween(String value1, String value2) {
            addCriterion("ClassManTel not between", value1, value2, "classmantel");
            return (Criteria) this;
        }

        public Criteria andLimitnumIsNull() {
            addCriterion("LimitNum is null");
            return (Criteria) this;
        }

        public Criteria andLimitnumIsNotNull() {
            addCriterion("LimitNum is not null");
            return (Criteria) this;
        }

        public Criteria andLimitnumEqualTo(Integer value) {
            addCriterion("LimitNum =", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumNotEqualTo(Integer value) {
            addCriterion("LimitNum <>", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumGreaterThan(Integer value) {
            addCriterion("LimitNum >", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LimitNum >=", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumLessThan(Integer value) {
            addCriterion("LimitNum <", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumLessThanOrEqualTo(Integer value) {
            addCriterion("LimitNum <=", value, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumIn(List<Integer> values) {
            addCriterion("LimitNum in", values, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumNotIn(List<Integer> values) {
            addCriterion("LimitNum not in", values, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumBetween(Integer value1, Integer value2) {
            addCriterion("LimitNum between", value1, value2, "limitnum");
            return (Criteria) this;
        }

        public Criteria andLimitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("LimitNum not between", value1, value2, "limitnum");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNull() {
            addCriterion("ClassType is null");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNotNull() {
            addCriterion("ClassType is not null");
            return (Criteria) this;
        }

        public Criteria andClasstypeEqualTo(String value) {
            addCriterion("ClassType =", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotEqualTo(String value) {
            addCriterion("ClassType <>", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThan(String value) {
            addCriterion("ClassType >", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThanOrEqualTo(String value) {
            addCriterion("ClassType >=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThan(String value) {
            addCriterion("ClassType <", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThanOrEqualTo(String value) {
            addCriterion("ClassType <=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLike(String value) {
            addCriterion("ClassType like", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotLike(String value) {
            addCriterion("ClassType not like", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeIn(List<String> values) {
            addCriterion("ClassType in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotIn(List<String> values) {
            addCriterion("ClassType not in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeBetween(String value1, String value2) {
            addCriterion("ClassType between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotBetween(String value1, String value2) {
            addCriterion("ClassType not between", value1, value2, "classtype");
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