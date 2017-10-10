package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentinfoExample() {
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

        public Criteria andStudentnameIsNull() {
            addCriterion("StudentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("StudentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("StudentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("StudentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("StudentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("StudentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("StudentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("StudentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("StudentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("StudentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("StudentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("StudentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("StudentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("StudentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNull() {
            addCriterion("StudentSex is null");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNotNull() {
            addCriterion("StudentSex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsexEqualTo(String value) {
            addCriterion("StudentSex =", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotEqualTo(String value) {
            addCriterion("StudentSex <>", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThan(String value) {
            addCriterion("StudentSex >", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThanOrEqualTo(String value) {
            addCriterion("StudentSex >=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThan(String value) {
            addCriterion("StudentSex <", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThanOrEqualTo(String value) {
            addCriterion("StudentSex <=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLike(String value) {
            addCriterion("StudentSex like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotLike(String value) {
            addCriterion("StudentSex not like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexIn(List<String> values) {
            addCriterion("StudentSex in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotIn(List<String> values) {
            addCriterion("StudentSex not in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexBetween(String value1, String value2) {
            addCriterion("StudentSex between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotBetween(String value1, String value2) {
            addCriterion("StudentSex not between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayIsNull() {
            addCriterion("StudentBirthday is null");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayIsNotNull() {
            addCriterion("StudentBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("StudentBirthday =", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("StudentBirthday <>", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("StudentBirthday >", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StudentBirthday >=", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("StudentBirthday <", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StudentBirthday <=", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("StudentBirthday in", values, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("StudentBirthday not in", values, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StudentBirthday between", value1, value2, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StudentBirthday not between", value1, value2, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNull() {
            addCriterion("StudentPassword is null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNotNull() {
            addCriterion("StudentPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordEqualTo(String value) {
            addCriterion("StudentPassword =", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotEqualTo(String value) {
            addCriterion("StudentPassword <>", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThan(String value) {
            addCriterion("StudentPassword >", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("StudentPassword >=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThan(String value) {
            addCriterion("StudentPassword <", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThanOrEqualTo(String value) {
            addCriterion("StudentPassword <=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLike(String value) {
            addCriterion("StudentPassword like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotLike(String value) {
            addCriterion("StudentPassword not like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIn(List<String> values) {
            addCriterion("StudentPassword in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotIn(List<String> values) {
            addCriterion("StudentPassword not in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordBetween(String value1, String value2) {
            addCriterion("StudentPassword between", value1, value2, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotBetween(String value1, String value2) {
            addCriterion("StudentPassword not between", value1, value2, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumIsNull() {
            addCriterion("StudentPhoneNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumIsNotNull() {
            addCriterion("StudentPhoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumEqualTo(String value) {
            addCriterion("StudentPhoneNum =", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumNotEqualTo(String value) {
            addCriterion("StudentPhoneNum <>", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumGreaterThan(String value) {
            addCriterion("StudentPhoneNum >", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumGreaterThanOrEqualTo(String value) {
            addCriterion("StudentPhoneNum >=", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumLessThan(String value) {
            addCriterion("StudentPhoneNum <", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumLessThanOrEqualTo(String value) {
            addCriterion("StudentPhoneNum <=", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumLike(String value) {
            addCriterion("StudentPhoneNum like", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumNotLike(String value) {
            addCriterion("StudentPhoneNum not like", value, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumIn(List<String> values) {
            addCriterion("StudentPhoneNum in", values, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumNotIn(List<String> values) {
            addCriterion("StudentPhoneNum not in", values, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumBetween(String value1, String value2) {
            addCriterion("StudentPhoneNum between", value1, value2, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentphonenumNotBetween(String value1, String value2) {
            addCriterion("StudentPhoneNum not between", value1, value2, "studentphonenum");
            return (Criteria) this;
        }

        public Criteria andStudentpicIsNull() {
            addCriterion("StudentPic is null");
            return (Criteria) this;
        }

        public Criteria andStudentpicIsNotNull() {
            addCriterion("StudentPic is not null");
            return (Criteria) this;
        }

        public Criteria andStudentpicEqualTo(String value) {
            addCriterion("StudentPic =", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicNotEqualTo(String value) {
            addCriterion("StudentPic <>", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicGreaterThan(String value) {
            addCriterion("StudentPic >", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicGreaterThanOrEqualTo(String value) {
            addCriterion("StudentPic >=", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicLessThan(String value) {
            addCriterion("StudentPic <", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicLessThanOrEqualTo(String value) {
            addCriterion("StudentPic <=", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicLike(String value) {
            addCriterion("StudentPic like", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicNotLike(String value) {
            addCriterion("StudentPic not like", value, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicIn(List<String> values) {
            addCriterion("StudentPic in", values, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicNotIn(List<String> values) {
            addCriterion("StudentPic not in", values, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicBetween(String value1, String value2) {
            addCriterion("StudentPic between", value1, value2, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentpicNotBetween(String value1, String value2) {
            addCriterion("StudentPic not between", value1, value2, "studentpic");
            return (Criteria) this;
        }

        public Criteria andStudentroleIsNull() {
            addCriterion("StudentRole is null");
            return (Criteria) this;
        }

        public Criteria andStudentroleIsNotNull() {
            addCriterion("StudentRole is not null");
            return (Criteria) this;
        }

        public Criteria andStudentroleEqualTo(String value) {
            addCriterion("StudentRole =", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleNotEqualTo(String value) {
            addCriterion("StudentRole <>", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleGreaterThan(String value) {
            addCriterion("StudentRole >", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleGreaterThanOrEqualTo(String value) {
            addCriterion("StudentRole >=", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleLessThan(String value) {
            addCriterion("StudentRole <", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleLessThanOrEqualTo(String value) {
            addCriterion("StudentRole <=", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleLike(String value) {
            addCriterion("StudentRole like", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleNotLike(String value) {
            addCriterion("StudentRole not like", value, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleIn(List<String> values) {
            addCriterion("StudentRole in", values, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleNotIn(List<String> values) {
            addCriterion("StudentRole not in", values, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleBetween(String value1, String value2) {
            addCriterion("StudentRole between", value1, value2, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentroleNotBetween(String value1, String value2) {
            addCriterion("StudentRole not between", value1, value2, "studentrole");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationIsNull() {
            addCriterion("StudentOrganization is null");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationIsNotNull() {
            addCriterion("StudentOrganization is not null");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationEqualTo(String value) {
            addCriterion("StudentOrganization =", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationNotEqualTo(String value) {
            addCriterion("StudentOrganization <>", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationGreaterThan(String value) {
            addCriterion("StudentOrganization >", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationGreaterThanOrEqualTo(String value) {
            addCriterion("StudentOrganization >=", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationLessThan(String value) {
            addCriterion("StudentOrganization <", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationLessThanOrEqualTo(String value) {
            addCriterion("StudentOrganization <=", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationLike(String value) {
            addCriterion("StudentOrganization like", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationNotLike(String value) {
            addCriterion("StudentOrganization not like", value, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationIn(List<String> values) {
            addCriterion("StudentOrganization in", values, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationNotIn(List<String> values) {
            addCriterion("StudentOrganization not in", values, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationBetween(String value1, String value2) {
            addCriterion("StudentOrganization between", value1, value2, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentorganizationNotBetween(String value1, String value2) {
            addCriterion("StudentOrganization not between", value1, value2, "studentorganization");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearIsNull() {
            addCriterion("StudentComeYear is null");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearIsNotNull() {
            addCriterion("StudentComeYear is not null");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearEqualTo(String value) {
            addCriterion("StudentComeYear =", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearNotEqualTo(String value) {
            addCriterion("StudentComeYear <>", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearGreaterThan(String value) {
            addCriterion("StudentComeYear >", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearGreaterThanOrEqualTo(String value) {
            addCriterion("StudentComeYear >=", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearLessThan(String value) {
            addCriterion("StudentComeYear <", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearLessThanOrEqualTo(String value) {
            addCriterion("StudentComeYear <=", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearLike(String value) {
            addCriterion("StudentComeYear like", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearNotLike(String value) {
            addCriterion("StudentComeYear not like", value, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearIn(List<String> values) {
            addCriterion("StudentComeYear in", values, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearNotIn(List<String> values) {
            addCriterion("StudentComeYear not in", values, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearBetween(String value1, String value2) {
            addCriterion("StudentComeYear between", value1, value2, "studentcomeyear");
            return (Criteria) this;
        }

        public Criteria andStudentcomeyearNotBetween(String value1, String value2) {
            addCriterion("StudentComeYear not between", value1, value2, "studentcomeyear");
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