package po;

import java.util.ArrayList;
import java.util.List;

public class MajorinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorinfoExample() {
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

        public Criteria andMajornumIsNull() {
            addCriterion("MajorNum is null");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNotNull() {
            addCriterion("MajorNum is not null");
            return (Criteria) this;
        }

        public Criteria andMajornumEqualTo(String value) {
            addCriterion("MajorNum =", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotEqualTo(String value) {
            addCriterion("MajorNum <>", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThan(String value) {
            addCriterion("MajorNum >", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThanOrEqualTo(String value) {
            addCriterion("MajorNum >=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThan(String value) {
            addCriterion("MajorNum <", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThanOrEqualTo(String value) {
            addCriterion("MajorNum <=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLike(String value) {
            addCriterion("MajorNum like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotLike(String value) {
            addCriterion("MajorNum not like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumIn(List<String> values) {
            addCriterion("MajorNum in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotIn(List<String> values) {
            addCriterion("MajorNum not in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumBetween(String value1, String value2) {
            addCriterion("MajorNum between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotBetween(String value1, String value2) {
            addCriterion("MajorNum not between", value1, value2, "majornum");
            return (Criteria) this;
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

        public Criteria andMajornameIsNull() {
            addCriterion("MajorName is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("MajorName is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("MajorName =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("MajorName <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("MajorName >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("MajorName >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("MajorName <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("MajorName <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("MajorName like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("MajorName not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("MajorName in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("MajorName not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("MajorName between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("MajorName not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajorassistantIsNull() {
            addCriterion("MajorAssistant is null");
            return (Criteria) this;
        }

        public Criteria andMajorassistantIsNotNull() {
            addCriterion("MajorAssistant is not null");
            return (Criteria) this;
        }

        public Criteria andMajorassistantEqualTo(String value) {
            addCriterion("MajorAssistant =", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantNotEqualTo(String value) {
            addCriterion("MajorAssistant <>", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantGreaterThan(String value) {
            addCriterion("MajorAssistant >", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantGreaterThanOrEqualTo(String value) {
            addCriterion("MajorAssistant >=", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantLessThan(String value) {
            addCriterion("MajorAssistant <", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantLessThanOrEqualTo(String value) {
            addCriterion("MajorAssistant <=", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantLike(String value) {
            addCriterion("MajorAssistant like", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantNotLike(String value) {
            addCriterion("MajorAssistant not like", value, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantIn(List<String> values) {
            addCriterion("MajorAssistant in", values, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantNotIn(List<String> values) {
            addCriterion("MajorAssistant not in", values, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantBetween(String value1, String value2) {
            addCriterion("MajorAssistant between", value1, value2, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajorassistantNotBetween(String value1, String value2) {
            addCriterion("MajorAssistant not between", value1, value2, "majorassistant");
            return (Criteria) this;
        }

        public Criteria andMajortelIsNull() {
            addCriterion("MajorTel is null");
            return (Criteria) this;
        }

        public Criteria andMajortelIsNotNull() {
            addCriterion("MajorTel is not null");
            return (Criteria) this;
        }

        public Criteria andMajortelEqualTo(String value) {
            addCriterion("MajorTel =", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelNotEqualTo(String value) {
            addCriterion("MajorTel <>", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelGreaterThan(String value) {
            addCriterion("MajorTel >", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelGreaterThanOrEqualTo(String value) {
            addCriterion("MajorTel >=", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelLessThan(String value) {
            addCriterion("MajorTel <", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelLessThanOrEqualTo(String value) {
            addCriterion("MajorTel <=", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelLike(String value) {
            addCriterion("MajorTel like", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelNotLike(String value) {
            addCriterion("MajorTel not like", value, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelIn(List<String> values) {
            addCriterion("MajorTel in", values, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelNotIn(List<String> values) {
            addCriterion("MajorTel not in", values, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelBetween(String value1, String value2) {
            addCriterion("MajorTel between", value1, value2, "majortel");
            return (Criteria) this;
        }

        public Criteria andMajortelNotBetween(String value1, String value2) {
            addCriterion("MajorTel not between", value1, value2, "majortel");
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