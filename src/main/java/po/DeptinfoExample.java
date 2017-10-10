package po;

import java.util.ArrayList;
import java.util.List;

public class DeptinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptinfoExample() {
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

        public Criteria andDeptnumIsNull() {
            addCriterion("DeptNum is null");
            return (Criteria) this;
        }

        public Criteria andDeptnumIsNotNull() {
            addCriterion("DeptNum is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnumEqualTo(String value) {
            addCriterion("DeptNum =", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotEqualTo(String value) {
            addCriterion("DeptNum <>", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThan(String value) {
            addCriterion("DeptNum >", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThanOrEqualTo(String value) {
            addCriterion("DeptNum >=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThan(String value) {
            addCriterion("DeptNum <", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThanOrEqualTo(String value) {
            addCriterion("DeptNum <=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLike(String value) {
            addCriterion("DeptNum like", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotLike(String value) {
            addCriterion("DeptNum not like", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumIn(List<String> values) {
            addCriterion("DeptNum in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotIn(List<String> values) {
            addCriterion("DeptNum not in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumBetween(String value1, String value2) {
            addCriterion("DeptNum between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotBetween(String value1, String value2) {
            addCriterion("DeptNum not between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("DeptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DeptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DeptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DeptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DeptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DeptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DeptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DeptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DeptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DeptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DeptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DeptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DeptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DeptName not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanIsNull() {
            addCriterion("DeptChairman is null");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanIsNotNull() {
            addCriterion("DeptChairman is not null");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanEqualTo(String value) {
            addCriterion("DeptChairman =", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanNotEqualTo(String value) {
            addCriterion("DeptChairman <>", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanGreaterThan(String value) {
            addCriterion("DeptChairman >", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanGreaterThanOrEqualTo(String value) {
            addCriterion("DeptChairman >=", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanLessThan(String value) {
            addCriterion("DeptChairman <", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanLessThanOrEqualTo(String value) {
            addCriterion("DeptChairman <=", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanLike(String value) {
            addCriterion("DeptChairman like", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanNotLike(String value) {
            addCriterion("DeptChairman not like", value, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanIn(List<String> values) {
            addCriterion("DeptChairman in", values, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanNotIn(List<String> values) {
            addCriterion("DeptChairman not in", values, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanBetween(String value1, String value2) {
            addCriterion("DeptChairman between", value1, value2, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDeptchairmanNotBetween(String value1, String value2) {
            addCriterion("DeptChairman not between", value1, value2, "deptchairman");
            return (Criteria) this;
        }

        public Criteria andDepttelIsNull() {
            addCriterion("DeptTel is null");
            return (Criteria) this;
        }

        public Criteria andDepttelIsNotNull() {
            addCriterion("DeptTel is not null");
            return (Criteria) this;
        }

        public Criteria andDepttelEqualTo(String value) {
            addCriterion("DeptTel =", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotEqualTo(String value) {
            addCriterion("DeptTel <>", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelGreaterThan(String value) {
            addCriterion("DeptTel >", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelGreaterThanOrEqualTo(String value) {
            addCriterion("DeptTel >=", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelLessThan(String value) {
            addCriterion("DeptTel <", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelLessThanOrEqualTo(String value) {
            addCriterion("DeptTel <=", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelLike(String value) {
            addCriterion("DeptTel like", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotLike(String value) {
            addCriterion("DeptTel not like", value, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelIn(List<String> values) {
            addCriterion("DeptTel in", values, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotIn(List<String> values) {
            addCriterion("DeptTel not in", values, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelBetween(String value1, String value2) {
            addCriterion("DeptTel between", value1, value2, "depttel");
            return (Criteria) this;
        }

        public Criteria andDepttelNotBetween(String value1, String value2) {
            addCriterion("DeptTel not between", value1, value2, "depttel");
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