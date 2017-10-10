package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ManagerinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andManagernumIsNull() {
            addCriterion("ManagerNum is null");
            return (Criteria) this;
        }

        public Criteria andManagernumIsNotNull() {
            addCriterion("ManagerNum is not null");
            return (Criteria) this;
        }

        public Criteria andManagernumEqualTo(String value) {
            addCriterion("ManagerNum =", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotEqualTo(String value) {
            addCriterion("ManagerNum <>", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumGreaterThan(String value) {
            addCriterion("ManagerNum >", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerNum >=", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumLessThan(String value) {
            addCriterion("ManagerNum <", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumLessThanOrEqualTo(String value) {
            addCriterion("ManagerNum <=", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumLike(String value) {
            addCriterion("ManagerNum like", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotLike(String value) {
            addCriterion("ManagerNum not like", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumIn(List<String> values) {
            addCriterion("ManagerNum in", values, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotIn(List<String> values) {
            addCriterion("ManagerNum not in", values, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumBetween(String value1, String value2) {
            addCriterion("ManagerNum between", value1, value2, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotBetween(String value1, String value2) {
            addCriterion("ManagerNum not between", value1, value2, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNull() {
            addCriterion("ManagerName is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("ManagerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("ManagerName =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("ManagerName <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("ManagerName >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerName >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("ManagerName <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("ManagerName <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("ManagerName like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("ManagerName not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("ManagerName in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("ManagerName not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("ManagerName between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("ManagerName not between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagersexIsNull() {
            addCriterion("ManagerSex is null");
            return (Criteria) this;
        }

        public Criteria andManagersexIsNotNull() {
            addCriterion("ManagerSex is not null");
            return (Criteria) this;
        }

        public Criteria andManagersexEqualTo(String value) {
            addCriterion("ManagerSex =", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotEqualTo(String value) {
            addCriterion("ManagerSex <>", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexGreaterThan(String value) {
            addCriterion("ManagerSex >", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerSex >=", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexLessThan(String value) {
            addCriterion("ManagerSex <", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexLessThanOrEqualTo(String value) {
            addCriterion("ManagerSex <=", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexLike(String value) {
            addCriterion("ManagerSex like", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotLike(String value) {
            addCriterion("ManagerSex not like", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexIn(List<String> values) {
            addCriterion("ManagerSex in", values, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotIn(List<String> values) {
            addCriterion("ManagerSex not in", values, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexBetween(String value1, String value2) {
            addCriterion("ManagerSex between", value1, value2, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotBetween(String value1, String value2) {
            addCriterion("ManagerSex not between", value1, value2, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayIsNull() {
            addCriterion("ManagerBirthday is null");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayIsNotNull() {
            addCriterion("ManagerBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthday =", value, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthday <>", value, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("ManagerBirthday >", value, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthday >=", value, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("ManagerBirthday <", value, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthday <=", value, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("ManagerBirthday in", values, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("ManagerBirthday not in", values, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ManagerBirthday between", value1, value2, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ManagerBirthday not between", value1, value2, "managerbirthday");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordIsNull() {
            addCriterion("ManagerPassword is null");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordIsNotNull() {
            addCriterion("ManagerPassword is not null");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordEqualTo(String value) {
            addCriterion("ManagerPassword =", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotEqualTo(String value) {
            addCriterion("ManagerPassword <>", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordGreaterThan(String value) {
            addCriterion("ManagerPassword >", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerPassword >=", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordLessThan(String value) {
            addCriterion("ManagerPassword <", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordLessThanOrEqualTo(String value) {
            addCriterion("ManagerPassword <=", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordLike(String value) {
            addCriterion("ManagerPassword like", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotLike(String value) {
            addCriterion("ManagerPassword not like", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordIn(List<String> values) {
            addCriterion("ManagerPassword in", values, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotIn(List<String> values) {
            addCriterion("ManagerPassword not in", values, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordBetween(String value1, String value2) {
            addCriterion("ManagerPassword between", value1, value2, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotBetween(String value1, String value2) {
            addCriterion("ManagerPassword not between", value1, value2, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerroleIsNull() {
            addCriterion("ManagerRole is null");
            return (Criteria) this;
        }

        public Criteria andManagerroleIsNotNull() {
            addCriterion("ManagerRole is not null");
            return (Criteria) this;
        }

        public Criteria andManagerroleEqualTo(String value) {
            addCriterion("ManagerRole =", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleNotEqualTo(String value) {
            addCriterion("ManagerRole <>", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleGreaterThan(String value) {
            addCriterion("ManagerRole >", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerRole >=", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleLessThan(String value) {
            addCriterion("ManagerRole <", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleLessThanOrEqualTo(String value) {
            addCriterion("ManagerRole <=", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleLike(String value) {
            addCriterion("ManagerRole like", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleNotLike(String value) {
            addCriterion("ManagerRole not like", value, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleIn(List<String> values) {
            addCriterion("ManagerRole in", values, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleNotIn(List<String> values) {
            addCriterion("ManagerRole not in", values, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleBetween(String value1, String value2) {
            addCriterion("ManagerRole between", value1, value2, "managerrole");
            return (Criteria) this;
        }

        public Criteria andManagerroleNotBetween(String value1, String value2) {
            addCriterion("ManagerRole not between", value1, value2, "managerrole");
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