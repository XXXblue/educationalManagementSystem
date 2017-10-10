package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentcourseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentcourseinfoExample() {
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

        public Criteria andStucourseidIsNull() {
            addCriterion("StuCourseID is null");
            return (Criteria) this;
        }

        public Criteria andStucourseidIsNotNull() {
            addCriterion("StuCourseID is not null");
            return (Criteria) this;
        }

        public Criteria andStucourseidEqualTo(Integer value) {
            addCriterion("StuCourseID =", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotEqualTo(Integer value) {
            addCriterion("StuCourseID <>", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidGreaterThan(Integer value) {
            addCriterion("StuCourseID >", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StuCourseID >=", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidLessThan(Integer value) {
            addCriterion("StuCourseID <", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidLessThanOrEqualTo(Integer value) {
            addCriterion("StuCourseID <=", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidIn(List<Integer> values) {
            addCriterion("StuCourseID in", values, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotIn(List<Integer> values) {
            addCriterion("StuCourseID not in", values, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidBetween(Integer value1, Integer value2) {
            addCriterion("StuCourseID between", value1, value2, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("StuCourseID not between", value1, value2, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("StudentNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("StudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(String value) {
            addCriterion("StudentNum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(String value) {
            addCriterion("StudentNum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(String value) {
            addCriterion("StudentNum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(String value) {
            addCriterion("StudentNum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(String value) {
            addCriterion("StudentNum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(String value) {
            addCriterion("StudentNum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLike(String value) {
            addCriterion("StudentNum like", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotLike(String value) {
            addCriterion("StudentNum not like", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<String> values) {
            addCriterion("StudentNum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<String> values) {
            addCriterion("StudentNum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(String value1, String value2) {
            addCriterion("StudentNum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(String value1, String value2) {
            addCriterion("StudentNum not between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNull() {
            addCriterion("CourseNum is null");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNotNull() {
            addCriterion("CourseNum is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenumEqualTo(String value) {
            addCriterion("CourseNum =", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotEqualTo(String value) {
            addCriterion("CourseNum <>", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThan(String value) {
            addCriterion("CourseNum >", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThanOrEqualTo(String value) {
            addCriterion("CourseNum >=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThan(String value) {
            addCriterion("CourseNum <", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThanOrEqualTo(String value) {
            addCriterion("CourseNum <=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLike(String value) {
            addCriterion("CourseNum like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotLike(String value) {
            addCriterion("CourseNum not like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumIn(List<String> values) {
            addCriterion("CourseNum in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotIn(List<String> values) {
            addCriterion("CourseNum not in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumBetween(String value1, String value2) {
            addCriterion("CourseNum between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotBetween(String value1, String value2) {
            addCriterion("CourseNum not between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
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