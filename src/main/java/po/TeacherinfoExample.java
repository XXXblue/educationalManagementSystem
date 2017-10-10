package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherinfoExample() {
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

        public Criteria andTeachernumIsNull() {
            addCriterion("TeacherNum is null");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNotNull() {
            addCriterion("TeacherNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernumEqualTo(String value) {
            addCriterion("TeacherNum =", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotEqualTo(String value) {
            addCriterion("TeacherNum <>", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThan(String value) {
            addCriterion("TeacherNum >", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherNum >=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThan(String value) {
            addCriterion("TeacherNum <", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThanOrEqualTo(String value) {
            addCriterion("TeacherNum <=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLike(String value) {
            addCriterion("TeacherNum like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotLike(String value) {
            addCriterion("TeacherNum not like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumIn(List<String> values) {
            addCriterion("TeacherNum in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotIn(List<String> values) {
            addCriterion("TeacherNum not in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumBetween(String value1, String value2) {
            addCriterion("TeacherNum between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotBetween(String value1, String value2) {
            addCriterion("TeacherNum not between", value1, value2, "teachernum");
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

        public Criteria andTeachernameIsNull() {
            addCriterion("TeacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("TeacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("TeacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("TeacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("TeacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("TeacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("TeacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("TeacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("TeacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("TeacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("TeacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("TeacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("TeacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNull() {
            addCriterion("TeacherSex is null");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNotNull() {
            addCriterion("TeacherSex is not null");
            return (Criteria) this;
        }

        public Criteria andTeachersexEqualTo(String value) {
            addCriterion("TeacherSex =", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotEqualTo(String value) {
            addCriterion("TeacherSex <>", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThan(String value) {
            addCriterion("TeacherSex >", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherSex >=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThan(String value) {
            addCriterion("TeacherSex <", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThanOrEqualTo(String value) {
            addCriterion("TeacherSex <=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLike(String value) {
            addCriterion("TeacherSex like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotLike(String value) {
            addCriterion("TeacherSex not like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexIn(List<String> values) {
            addCriterion("TeacherSex in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotIn(List<String> values) {
            addCriterion("TeacherSex not in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexBetween(String value1, String value2) {
            addCriterion("TeacherSex between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotBetween(String value1, String value2) {
            addCriterion("TeacherSex not between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayIsNull() {
            addCriterion("TeacherBirthday is null");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayIsNotNull() {
            addCriterion("TeacherBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("TeacherBirthday =", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("TeacherBirthday <>", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("TeacherBirthday >", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TeacherBirthday >=", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("TeacherBirthday <", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TeacherBirthday <=", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("TeacherBirthday in", values, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("TeacherBirthday not in", values, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TeacherBirthday between", value1, value2, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TeacherBirthday not between", value1, value2, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIsNull() {
            addCriterion("TeacherTitle is null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIsNotNull() {
            addCriterion("TeacherTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleEqualTo(String value) {
            addCriterion("TeacherTitle =", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotEqualTo(String value) {
            addCriterion("TeacherTitle <>", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleGreaterThan(String value) {
            addCriterion("TeacherTitle >", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherTitle >=", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLessThan(String value) {
            addCriterion("TeacherTitle <", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLessThanOrEqualTo(String value) {
            addCriterion("TeacherTitle <=", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLike(String value) {
            addCriterion("TeacherTitle like", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotLike(String value) {
            addCriterion("TeacherTitle not like", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIn(List<String> values) {
            addCriterion("TeacherTitle in", values, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotIn(List<String> values) {
            addCriterion("TeacherTitle not in", values, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleBetween(String value1, String value2) {
            addCriterion("TeacherTitle between", value1, value2, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotBetween(String value1, String value2) {
            addCriterion("TeacherTitle not between", value1, value2, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNull() {
            addCriterion("TeacherPassword is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNotNull() {
            addCriterion("TeacherPassword is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordEqualTo(String value) {
            addCriterion("TeacherPassword =", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotEqualTo(String value) {
            addCriterion("TeacherPassword <>", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThan(String value) {
            addCriterion("TeacherPassword >", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherPassword >=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThan(String value) {
            addCriterion("TeacherPassword <", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThanOrEqualTo(String value) {
            addCriterion("TeacherPassword <=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLike(String value) {
            addCriterion("TeacherPassword like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotLike(String value) {
            addCriterion("TeacherPassword not like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIn(List<String> values) {
            addCriterion("TeacherPassword in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotIn(List<String> values) {
            addCriterion("TeacherPassword not in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordBetween(String value1, String value2) {
            addCriterion("TeacherPassword between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotBetween(String value1, String value2) {
            addCriterion("TeacherPassword not between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneIsNull() {
            addCriterion("TeacherPhone is null");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneIsNotNull() {
            addCriterion("TeacherPhone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneEqualTo(String value) {
            addCriterion("TeacherPhone =", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneNotEqualTo(String value) {
            addCriterion("TeacherPhone <>", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneGreaterThan(String value) {
            addCriterion("TeacherPhone >", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherPhone >=", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneLessThan(String value) {
            addCriterion("TeacherPhone <", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneLessThanOrEqualTo(String value) {
            addCriterion("TeacherPhone <=", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneLike(String value) {
            addCriterion("TeacherPhone like", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneNotLike(String value) {
            addCriterion("TeacherPhone not like", value, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneIn(List<String> values) {
            addCriterion("TeacherPhone in", values, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneNotIn(List<String> values) {
            addCriterion("TeacherPhone not in", values, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneBetween(String value1, String value2) {
            addCriterion("TeacherPhone between", value1, value2, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherphoneNotBetween(String value1, String value2) {
            addCriterion("TeacherPhone not between", value1, value2, "teacherphone");
            return (Criteria) this;
        }

        public Criteria andTeacherroleIsNull() {
            addCriterion("TeacherRole is null");
            return (Criteria) this;
        }

        public Criteria andTeacherroleIsNotNull() {
            addCriterion("TeacherRole is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherroleEqualTo(String value) {
            addCriterion("TeacherRole =", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleNotEqualTo(String value) {
            addCriterion("TeacherRole <>", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleGreaterThan(String value) {
            addCriterion("TeacherRole >", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherRole >=", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleLessThan(String value) {
            addCriterion("TeacherRole <", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleLessThanOrEqualTo(String value) {
            addCriterion("TeacherRole <=", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleLike(String value) {
            addCriterion("TeacherRole like", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleNotLike(String value) {
            addCriterion("TeacherRole not like", value, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleIn(List<String> values) {
            addCriterion("TeacherRole in", values, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleNotIn(List<String> values) {
            addCriterion("TeacherRole not in", values, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleBetween(String value1, String value2) {
            addCriterion("TeacherRole between", value1, value2, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherroleNotBetween(String value1, String value2) {
            addCriterion("TeacherRole not between", value1, value2, "teacherrole");
            return (Criteria) this;
        }

        public Criteria andTeacherpicIsNull() {
            addCriterion("TeacherPic is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpicIsNotNull() {
            addCriterion("TeacherPic is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpicEqualTo(String value) {
            addCriterion("TeacherPic =", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicNotEqualTo(String value) {
            addCriterion("TeacherPic <>", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicGreaterThan(String value) {
            addCriterion("TeacherPic >", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherPic >=", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicLessThan(String value) {
            addCriterion("TeacherPic <", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicLessThanOrEqualTo(String value) {
            addCriterion("TeacherPic <=", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicLike(String value) {
            addCriterion("TeacherPic like", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicNotLike(String value) {
            addCriterion("TeacherPic not like", value, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicIn(List<String> values) {
            addCriterion("TeacherPic in", values, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicNotIn(List<String> values) {
            addCriterion("TeacherPic not in", values, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicBetween(String value1, String value2) {
            addCriterion("TeacherPic between", value1, value2, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacherpicNotBetween(String value1, String value2) {
            addCriterion("TeacherPic not between", value1, value2, "teacherpic");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumIsNull() {
            addCriterion("TeacherIdCardNum is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumIsNotNull() {
            addCriterion("TeacherIdCardNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumEqualTo(String value) {
            addCriterion("TeacherIdCardNum =", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumNotEqualTo(String value) {
            addCriterion("TeacherIdCardNum <>", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumGreaterThan(String value) {
            addCriterion("TeacherIdCardNum >", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherIdCardNum >=", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumLessThan(String value) {
            addCriterion("TeacherIdCardNum <", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumLessThanOrEqualTo(String value) {
            addCriterion("TeacherIdCardNum <=", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumLike(String value) {
            addCriterion("TeacherIdCardNum like", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumNotLike(String value) {
            addCriterion("TeacherIdCardNum not like", value, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumIn(List<String> values) {
            addCriterion("TeacherIdCardNum in", values, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumNotIn(List<String> values) {
            addCriterion("TeacherIdCardNum not in", values, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumBetween(String value1, String value2) {
            addCriterion("TeacherIdCardNum between", value1, value2, "teacheridcardnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridcardnumNotBetween(String value1, String value2) {
            addCriterion("TeacherIdCardNum not between", value1, value2, "teacheridcardnum");
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