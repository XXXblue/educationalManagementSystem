package po;

import java.util.ArrayList;
import java.util.List;

public class KcinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcinfoExample() {
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

        public Criteria andKcnumIsNull() {
            addCriterion("kcnum is null");
            return (Criteria) this;
        }

        public Criteria andKcnumIsNotNull() {
            addCriterion("kcnum is not null");
            return (Criteria) this;
        }

        public Criteria andKcnumEqualTo(String value) {
            addCriterion("kcnum =", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumNotEqualTo(String value) {
            addCriterion("kcnum <>", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumGreaterThan(String value) {
            addCriterion("kcnum >", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumGreaterThanOrEqualTo(String value) {
            addCriterion("kcnum >=", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumLessThan(String value) {
            addCriterion("kcnum <", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumLessThanOrEqualTo(String value) {
            addCriterion("kcnum <=", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumLike(String value) {
            addCriterion("kcnum like", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumNotLike(String value) {
            addCriterion("kcnum not like", value, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumIn(List<String> values) {
            addCriterion("kcnum in", values, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumNotIn(List<String> values) {
            addCriterion("kcnum not in", values, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumBetween(String value1, String value2) {
            addCriterion("kcnum between", value1, value2, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcnumNotBetween(String value1, String value2) {
            addCriterion("kcnum not between", value1, value2, "kcnum");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNull() {
            addCriterion("kcxf is null");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNotNull() {
            addCriterion("kcxf is not null");
            return (Criteria) this;
        }

        public Criteria andKcxfEqualTo(String value) {
            addCriterion("kcxf =", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotEqualTo(String value) {
            addCriterion("kcxf <>", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThan(String value) {
            addCriterion("kcxf >", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThanOrEqualTo(String value) {
            addCriterion("kcxf >=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThan(String value) {
            addCriterion("kcxf <", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThanOrEqualTo(String value) {
            addCriterion("kcxf <=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLike(String value) {
            addCriterion("kcxf like", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotLike(String value) {
            addCriterion("kcxf not like", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfIn(List<String> values) {
            addCriterion("kcxf in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotIn(List<String> values) {
            addCriterion("kcxf not in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfBetween(String value1, String value2) {
            addCriterion("kcxf between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotBetween(String value1, String value2) {
            addCriterion("kcxf not between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxsIsNull() {
            addCriterion("kcxs is null");
            return (Criteria) this;
        }

        public Criteria andKcxsIsNotNull() {
            addCriterion("kcxs is not null");
            return (Criteria) this;
        }

        public Criteria andKcxsEqualTo(String value) {
            addCriterion("kcxs =", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsNotEqualTo(String value) {
            addCriterion("kcxs <>", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsGreaterThan(String value) {
            addCriterion("kcxs >", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsGreaterThanOrEqualTo(String value) {
            addCriterion("kcxs >=", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsLessThan(String value) {
            addCriterion("kcxs <", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsLessThanOrEqualTo(String value) {
            addCriterion("kcxs <=", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsLike(String value) {
            addCriterion("kcxs like", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsNotLike(String value) {
            addCriterion("kcxs not like", value, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsIn(List<String> values) {
            addCriterion("kcxs in", values, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsNotIn(List<String> values) {
            addCriterion("kcxs not in", values, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsBetween(String value1, String value2) {
            addCriterion("kcxs between", value1, value2, "kcxs");
            return (Criteria) this;
        }

        public Criteria andKcxsNotBetween(String value1, String value2) {
            addCriterion("kcxs not between", value1, value2, "kcxs");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNull() {
            addCriterion("majornum is null");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNotNull() {
            addCriterion("majornum is not null");
            return (Criteria) this;
        }

        public Criteria andMajornumEqualTo(String value) {
            addCriterion("majornum =", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotEqualTo(String value) {
            addCriterion("majornum <>", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThan(String value) {
            addCriterion("majornum >", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThanOrEqualTo(String value) {
            addCriterion("majornum >=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThan(String value) {
            addCriterion("majornum <", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThanOrEqualTo(String value) {
            addCriterion("majornum <=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLike(String value) {
            addCriterion("majornum like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotLike(String value) {
            addCriterion("majornum not like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumIn(List<String> values) {
            addCriterion("majornum in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotIn(List<String> values) {
            addCriterion("majornum not in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumBetween(String value1, String value2) {
            addCriterion("majornum between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotBetween(String value1, String value2) {
            addCriterion("majornum not between", value1, value2, "majornum");
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