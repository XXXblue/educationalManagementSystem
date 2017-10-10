package poView;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/249:03
 * @Description:
 * @Modified By:
 */
public class CourseInfoViewShowStudent {
    private String CourseName;
    private String CourseCredit;
    private String ClassNum;
    private String TeacherName;
    private String CourseFree;
    private String MajorName;
    private String CourseNum;
    private Integer CourseDay;
    private Integer CourseDayTime;
    private String sCourseDay;
    private String sCourseDayTime;

    private String flag; //用来标记学生是否选课


    public Integer getCourseDay() {
        return CourseDay;
    }

    public void setCourseDay(Integer courseDay) {
        CourseDay = courseDay;
    }

    public Integer getCourseDayTime() {
        return CourseDayTime;
    }

    public void setCourseDayTime(Integer courseDayTime) {
        CourseDayTime = courseDayTime;
    }

    public String getsCourseDay() {
        return sCourseDay;
    }

    public void setsCourseDay(String sCourseDay) {
        this.sCourseDay = sCourseDay;
    }

    public String getsCourseDayTime() {
        return sCourseDayTime;
    }

    public void setsCourseDayTime(String sCourseDayTime) {
        this.sCourseDayTime = sCourseDayTime;
    }
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


    public String getCourseNum() {
        return CourseNum;
    }

    public void setCourseNum(String courseNum) {
        CourseNum = courseNum;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseCredit() {
        return CourseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        CourseCredit = courseCredit;
    }

    public String getClassNum() {
        return ClassNum;
    }

    public void setClassNum(String classNum) {
        ClassNum = classNum;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getCourseFree() {
        return CourseFree;
    }

    public void setCourseFree(String courseFree) {
        CourseFree = courseFree;
    }

    public String getMajorName() {
        return MajorName;
    }

    public void setMajorName(String majorName) {
        MajorName = majorName;
    }
}
