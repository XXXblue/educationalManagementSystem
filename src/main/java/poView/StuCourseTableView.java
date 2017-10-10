package poView;

/**
 * @Author: XBlue
 * @Date: Create in 2017/10/29:08
 * @Description:
 * @Modified By:
 */
public class StuCourseTableView {
    private String CourseName;
    private String ClassNum;
    private String TeacherName;
    private Integer CourseDay;
    private Integer CourseDayTime;

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

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
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
}
