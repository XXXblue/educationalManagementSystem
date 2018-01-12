package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseinfoExample() {
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

        public Criteria andCourseteachernumIsNull() {
            addCriterion("CourseTeacherNum is null");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumIsNotNull() {
            addCriterion("CourseTeacherNum is not null");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumEqualTo(String value) {
            addCriterion("CourseTeacherNum =", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumNotEqualTo(String value) {
            addCriterion("CourseTeacherNum <>", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumGreaterThan(String value) {
            addCriterion("CourseTeacherNum >", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumGreaterThanOrEqualTo(String value) {
            addCriterion("CourseTeacherNum >=", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumLessThan(String value) {
            addCriterion("CourseTeacherNum <", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumLessThanOrEqualTo(String value) {
            addCriterion("CourseTeacherNum <=", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumLike(String value) {
            addCriterion("CourseTeacherNum like", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumNotLike(String value) {
            addCriterion("CourseTeacherNum not like", value, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumIn(List<String> values) {
            addCriterion("CourseTeacherNum in", values, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumNotIn(List<String> values) {
            addCriterion("CourseTeacherNum not in", values, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumBetween(String value1, String value2) {
            addCriterion("CourseTeacherNum between", value1, value2, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCourseteachernumNotBetween(String value1, String value2) {
            addCriterion("CourseTeacherNum not between", value1, value2, "courseteachernum");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitIsNull() {
            addCriterion("CourseNumLimit is null");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitIsNotNull() {
            addCriterion("CourseNumLimit is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitEqualTo(Integer value) {
            addCriterion("CourseNumLimit =", value, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitNotEqualTo(Integer value) {
            addCriterion("CourseNumLimit <>", value, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitGreaterThan(Integer value) {
            addCriterion("CourseNumLimit >", value, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseNumLimit >=", value, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitLessThan(Integer value) {
            addCriterion("CourseNumLimit <", value, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitLessThanOrEqualTo(Integer value) {
            addCriterion("CourseNumLimit <=", value, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitIn(List<Integer> values) {
            addCriterion("CourseNumLimit in", values, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitNotIn(List<Integer> values) {
            addCriterion("CourseNumLimit not in", values, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitBetween(Integer value1, Integer value2) {
            addCriterion("CourseNumLimit between", value1, value2, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursenumlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseNumLimit not between", value1, value2, "coursenumlimit");
            return (Criteria) this;
        }

        public Criteria andCoursefreeIsNull() {
            addCriterion("CourseFree is null");
            return (Criteria) this;
        }

        public Criteria andCoursefreeIsNotNull() {
            addCriterion("CourseFree is not null");
            return (Criteria) this;
        }

        public Criteria andCoursefreeEqualTo(Integer value) {
            addCriterion("CourseFree =", value, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeNotEqualTo(Integer value) {
            addCriterion("CourseFree <>", value, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeGreaterThan(Integer value) {
            addCriterion("CourseFree >", value, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseFree >=", value, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeLessThan(Integer value) {
            addCriterion("CourseFree <", value, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeLessThanOrEqualTo(Integer value) {
            addCriterion("CourseFree <=", value, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeIn(List<Integer> values) {
            addCriterion("CourseFree in", values, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeNotIn(List<Integer> values) {
            addCriterion("CourseFree not in", values, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeBetween(Integer value1, Integer value2) {
            addCriterion("CourseFree between", value1, value2, "coursefree");
            return (Criteria) this;
        }

        public Criteria andCoursefreeNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseFree not between", value1, value2, "coursefree");
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

        public Criteria andTermyearIsNull() {
            addCriterion("TermYear is null");
            return (Criteria) this;
        }

        public Criteria andTermyearIsNotNull() {
            addCriterion("TermYear is not null");
            return (Criteria) this;
        }

        public Criteria andTermyearEqualTo(String value) {
            addCriterion("TermYear =", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearNotEqualTo(String value) {
            addCriterion("TermYear <>", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearGreaterThan(String value) {
            addCriterion("TermYear >", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearGreaterThanOrEqualTo(String value) {
            addCriterion("TermYear >=", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearLessThan(String value) {
            addCriterion("TermYear <", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearLessThanOrEqualTo(String value) {
            addCriterion("TermYear <=", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearLike(String value) {
            addCriterion("TermYear like", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearNotLike(String value) {
            addCriterion("TermYear not like", value, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearIn(List<String> values) {
            addCriterion("TermYear in", values, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearNotIn(List<String> values) {
            addCriterion("TermYear not in", values, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearBetween(String value1, String value2) {
            addCriterion("TermYear between", value1, value2, "termyear");
            return (Criteria) this;
        }

        public Criteria andTermyearNotBetween(String value1, String value2) {
            addCriterion("TermYear not between", value1, value2, "termyear");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekIsNull() {
            addCriterion("CourseStartWeek is null");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekIsNotNull() {
            addCriterion("CourseStartWeek is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekEqualTo(String value) {
            addCriterion("CourseStartWeek =", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekNotEqualTo(String value) {
            addCriterion("CourseStartWeek <>", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekGreaterThan(String value) {
            addCriterion("CourseStartWeek >", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekGreaterThanOrEqualTo(String value) {
            addCriterion("CourseStartWeek >=", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekLessThan(String value) {
            addCriterion("CourseStartWeek <", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekLessThanOrEqualTo(String value) {
            addCriterion("CourseStartWeek <=", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekLike(String value) {
            addCriterion("CourseStartWeek like", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekNotLike(String value) {
            addCriterion("CourseStartWeek not like", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekIn(List<String> values) {
            addCriterion("CourseStartWeek in", values, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekNotIn(List<String> values) {
            addCriterion("CourseStartWeek not in", values, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekBetween(String value1, String value2) {
            addCriterion("CourseStartWeek between", value1, value2, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekNotBetween(String value1, String value2) {
            addCriterion("CourseStartWeek not between", value1, value2, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekIsNull() {
            addCriterion("CourseEndWeek is null");
            return (Criteria) this;
        }

        public Criteria andCourseendweekIsNotNull() {
            addCriterion("CourseEndWeek is not null");
            return (Criteria) this;
        }

        public Criteria andCourseendweekEqualTo(String value) {
            addCriterion("CourseEndWeek =", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekNotEqualTo(String value) {
            addCriterion("CourseEndWeek <>", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekGreaterThan(String value) {
            addCriterion("CourseEndWeek >", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekGreaterThanOrEqualTo(String value) {
            addCriterion("CourseEndWeek >=", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekLessThan(String value) {
            addCriterion("CourseEndWeek <", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekLessThanOrEqualTo(String value) {
            addCriterion("CourseEndWeek <=", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekLike(String value) {
            addCriterion("CourseEndWeek like", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekNotLike(String value) {
            addCriterion("CourseEndWeek not like", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekIn(List<String> values) {
            addCriterion("CourseEndWeek in", values, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekNotIn(List<String> values) {
            addCriterion("CourseEndWeek not in", values, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekBetween(String value1, String value2) {
            addCriterion("CourseEndWeek between", value1, value2, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekNotBetween(String value1, String value2) {
            addCriterion("CourseEndWeek not between", value1, value2, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCoursedayIsNull() {
            addCriterion("CourseDay is null");
            return (Criteria) this;
        }

        public Criteria andCoursedayIsNotNull() {
            addCriterion("CourseDay is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedayEqualTo(String value) {
            addCriterion("CourseDay =", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayNotEqualTo(String value) {
            addCriterion("CourseDay <>", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayGreaterThan(String value) {
            addCriterion("CourseDay >", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayGreaterThanOrEqualTo(String value) {
            addCriterion("CourseDay >=", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayLessThan(String value) {
            addCriterion("CourseDay <", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayLessThanOrEqualTo(String value) {
            addCriterion("CourseDay <=", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayLike(String value) {
            addCriterion("CourseDay like", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayNotLike(String value) {
            addCriterion("CourseDay not like", value, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayIn(List<String> values) {
            addCriterion("CourseDay in", values, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayNotIn(List<String> values) {
            addCriterion("CourseDay not in", values, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayBetween(String value1, String value2) {
            addCriterion("CourseDay between", value1, value2, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedayNotBetween(String value1, String value2) {
            addCriterion("CourseDay not between", value1, value2, "courseday");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeIsNull() {
            addCriterion("CourseDayTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeIsNotNull() {
            addCriterion("CourseDayTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeEqualTo(String value) {
            addCriterion("CourseDayTime =", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeNotEqualTo(String value) {
            addCriterion("CourseDayTime <>", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeGreaterThan(String value) {
            addCriterion("CourseDayTime >", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("CourseDayTime >=", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeLessThan(String value) {
            addCriterion("CourseDayTime <", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeLessThanOrEqualTo(String value) {
            addCriterion("CourseDayTime <=", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeLike(String value) {
            addCriterion("CourseDayTime like", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeNotLike(String value) {
            addCriterion("CourseDayTime not like", value, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeIn(List<String> values) {
            addCriterion("CourseDayTime in", values, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeNotIn(List<String> values) {
            addCriterion("CourseDayTime not in", values, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeBetween(String value1, String value2) {
            addCriterion("CourseDayTime between", value1, value2, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andCoursedaytimeNotBetween(String value1, String value2) {
            addCriterion("CourseDayTime not between", value1, value2, "coursedaytime");
            return (Criteria) this;
        }

        public Criteria andTermtimeIsNull() {
            addCriterion("TermTime is null");
            return (Criteria) this;
        }

        public Criteria andTermtimeIsNotNull() {
            addCriterion("TermTime is not null");
            return (Criteria) this;
        }

        public Criteria andTermtimeEqualTo(String value) {
            addCriterion("TermTime =", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeNotEqualTo(String value) {
            addCriterion("TermTime <>", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeGreaterThan(String value) {
            addCriterion("TermTime >", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeGreaterThanOrEqualTo(String value) {
            addCriterion("TermTime >=", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeLessThan(String value) {
            addCriterion("TermTime <", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeLessThanOrEqualTo(String value) {
            addCriterion("TermTime <=", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeLike(String value) {
            addCriterion("TermTime like", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeNotLike(String value) {
            addCriterion("TermTime not like", value, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeIn(List<String> values) {
            addCriterion("TermTime in", values, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeNotIn(List<String> values) {
            addCriterion("TermTime not in", values, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeBetween(String value1, String value2) {
            addCriterion("TermTime between", value1, value2, "termtime");
            return (Criteria) this;
        }

        public Criteria andTermtimeNotBetween(String value1, String value2) {
            addCriterion("TermTime not between", value1, value2, "termtime");
            return (Criteria) this;
        }

        public Criteria andIfopenIsNull() {
            addCriterion("ifOpen is null");
            return (Criteria) this;
        }

        public Criteria andIfopenIsNotNull() {
            addCriterion("ifOpen is not null");
            return (Criteria) this;
        }

        public Criteria andIfopenEqualTo(String value) {
            addCriterion("ifOpen =", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenNotEqualTo(String value) {
            addCriterion("ifOpen <>", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenGreaterThan(String value) {
            addCriterion("ifOpen >", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenGreaterThanOrEqualTo(String value) {
            addCriterion("ifOpen >=", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenLessThan(String value) {
            addCriterion("ifOpen <", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenLessThanOrEqualTo(String value) {
            addCriterion("ifOpen <=", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenLike(String value) {
            addCriterion("ifOpen like", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenNotLike(String value) {
            addCriterion("ifOpen not like", value, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenIn(List<String> values) {
            addCriterion("ifOpen in", values, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenNotIn(List<String> values) {
            addCriterion("ifOpen not in", values, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenBetween(String value1, String value2) {
            addCriterion("ifOpen between", value1, value2, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfopenNotBetween(String value1, String value2) {
            addCriterion("ifOpen not between", value1, value2, "ifopen");
            return (Criteria) this;
        }

        public Criteria andIfgradeIsNull() {
            addCriterion("ifGrade is null");
            return (Criteria) this;
        }

        public Criteria andIfgradeIsNotNull() {
            addCriterion("ifGrade is not null");
            return (Criteria) this;
        }

        public Criteria andIfgradeEqualTo(String value) {
            addCriterion("ifGrade =", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeNotEqualTo(String value) {
            addCriterion("ifGrade <>", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeGreaterThan(String value) {
            addCriterion("ifGrade >", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeGreaterThanOrEqualTo(String value) {
            addCriterion("ifGrade >=", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeLessThan(String value) {
            addCriterion("ifGrade <", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeLessThanOrEqualTo(String value) {
            addCriterion("ifGrade <=", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeLike(String value) {
            addCriterion("ifGrade like", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeNotLike(String value) {
            addCriterion("ifGrade not like", value, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeIn(List<String> values) {
            addCriterion("ifGrade in", values, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeNotIn(List<String> values) {
            addCriterion("ifGrade not in", values, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeBetween(String value1, String value2) {
            addCriterion("ifGrade between", value1, value2, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andIfgradeNotBetween(String value1, String value2) {
            addCriterion("ifGrade not between", value1, value2, "ifgrade");
            return (Criteria) this;
        }

        public Criteria andCourseopennumIsNull() {
            addCriterion("courseOpenNum is null");
            return (Criteria) this;
        }

        public Criteria andCourseopennumIsNotNull() {
            addCriterion("courseOpenNum is not null");
            return (Criteria) this;
        }

        public Criteria andCourseopennumEqualTo(String value) {
            addCriterion("courseOpenNum =", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumNotEqualTo(String value) {
            addCriterion("courseOpenNum <>", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumGreaterThan(String value) {
            addCriterion("courseOpenNum >", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumGreaterThanOrEqualTo(String value) {
            addCriterion("courseOpenNum >=", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumLessThan(String value) {
            addCriterion("courseOpenNum <", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumLessThanOrEqualTo(String value) {
            addCriterion("courseOpenNum <=", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumLike(String value) {
            addCriterion("courseOpenNum like", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumNotLike(String value) {
            addCriterion("courseOpenNum not like", value, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumIn(List<String> values) {
            addCriterion("courseOpenNum in", values, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumNotIn(List<String> values) {
            addCriterion("courseOpenNum not in", values, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumBetween(String value1, String value2) {
            addCriterion("courseOpenNum between", value1, value2, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCourseopennumNotBetween(String value1, String value2) {
            addCriterion("courseOpenNum not between", value1, value2, "courseopennum");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIsNull() {
            addCriterion("courseStatus is null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIsNotNull() {
            addCriterion("courseStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusEqualTo(String value) {
            addCriterion("courseStatus =", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotEqualTo(String value) {
            addCriterion("courseStatus <>", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThan(String value) {
            addCriterion("courseStatus >", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThanOrEqualTo(String value) {
            addCriterion("courseStatus >=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThan(String value) {
            addCriterion("courseStatus <", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThanOrEqualTo(String value) {
            addCriterion("courseStatus <=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLike(String value) {
            addCriterion("courseStatus like", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotLike(String value) {
            addCriterion("courseStatus not like", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIn(List<String> values) {
            addCriterion("courseStatus in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotIn(List<String> values) {
            addCriterion("courseStatus not in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusBetween(String value1, String value2) {
            addCriterion("courseStatus between", value1, value2, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotBetween(String value1, String value2) {
            addCriterion("courseStatus not between", value1, value2, "coursestatus");
            return (Criteria) this;
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