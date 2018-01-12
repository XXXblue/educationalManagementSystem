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

        public Criteria andDeptnumIsNull() {
            addCriterion("deptnum is null");
            return (Criteria) this;
        }

        public Criteria andDeptnumIsNotNull() {
            addCriterion("deptnum is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnumEqualTo(String value) {
            addCriterion("deptnum =", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotEqualTo(String value) {
            addCriterion("deptnum <>", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThan(String value) {
            addCriterion("deptnum >", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThanOrEqualTo(String value) {
            addCriterion("deptnum >=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThan(String value) {
            addCriterion("deptnum <", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThanOrEqualTo(String value) {
            addCriterion("deptnum <=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLike(String value) {
            addCriterion("deptnum like", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotLike(String value) {
            addCriterion("deptnum not like", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumIn(List<String> values) {
            addCriterion("deptnum in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotIn(List<String> values) {
            addCriterion("deptnum not in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumBetween(String value1, String value2) {
            addCriterion("deptnum between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotBetween(String value1, String value2) {
            addCriterion("deptnum not between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andKclxIsNull() {
            addCriterion("kclx is null");
            return (Criteria) this;
        }

        public Criteria andKclxIsNotNull() {
            addCriterion("kclx is not null");
            return (Criteria) this;
        }

        public Criteria andKclxEqualTo(String value) {
            addCriterion("kclx =", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotEqualTo(String value) {
            addCriterion("kclx <>", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxGreaterThan(String value) {
            addCriterion("kclx >", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxGreaterThanOrEqualTo(String value) {
            addCriterion("kclx >=", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxLessThan(String value) {
            addCriterion("kclx <", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxLessThanOrEqualTo(String value) {
            addCriterion("kclx <=", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxLike(String value) {
            addCriterion("kclx like", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotLike(String value) {
            addCriterion("kclx not like", value, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxIn(List<String> values) {
            addCriterion("kclx in", values, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotIn(List<String> values) {
            addCriterion("kclx not in", values, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxBetween(String value1, String value2) {
            addCriterion("kclx between", value1, value2, "kclx");
            return (Criteria) this;
        }

        public Criteria andKclxNotBetween(String value1, String value2) {
            addCriterion("kclx not between", value1, value2, "kclx");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNull() {
            addCriterion("kcmc is null");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNotNull() {
            addCriterion("kcmc is not null");
            return (Criteria) this;
        }

        public Criteria andKcmcEqualTo(String value) {
            addCriterion("kcmc =", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotEqualTo(String value) {
            addCriterion("kcmc <>", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThan(String value) {
            addCriterion("kcmc >", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThanOrEqualTo(String value) {
            addCriterion("kcmc >=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThan(String value) {
            addCriterion("kcmc <", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThanOrEqualTo(String value) {
            addCriterion("kcmc <=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLike(String value) {
            addCriterion("kcmc like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotLike(String value) {
            addCriterion("kcmc not like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcIn(List<String> values) {
            addCriterion("kcmc in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotIn(List<String> values) {
            addCriterion("kcmc not in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcBetween(String value1, String value2) {
            addCriterion("kcmc between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotBetween(String value1, String value2) {
            addCriterion("kcmc not between", value1, value2, "kcmc");
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