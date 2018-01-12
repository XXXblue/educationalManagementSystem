package pojoCustom;

import po.Courseinfo;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1610:48
 * @Description:
 * @Modified By:
 */
public class CourseinfoCustom extends Courseinfo {
    private String kcmc;
    private String kcxf;
    private String kcxs;
    private String ClassNum;
    private String TeacherName;
    private String CourseNumLimit;
    private String CourseFree;
    private String kclx;
    private String status;
    private String deptnum;

    public String getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(String deptnum) {
        this.deptnum = deptnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKclx() {
        return kclx;
    }

    public void setKclx(String kclx) {
        this.kclx = kclx;
    }

    public String getCourseFree() {
        return CourseFree;
    }

    public void setCourseFree(String courseFree) {
        CourseFree = courseFree;
    }

    public String getCourseNumLimit() {
        return CourseNumLimit;
    }

    public void setCourseNumLimit(String courseNumLimit) {
        CourseNumLimit = courseNumLimit;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getClassNum() {
        return ClassNum;
    }

    public void setClassNum(String classNum) {
        ClassNum = classNum;
    }

    public String getKcxs() {
        return kcxs;
    }

    public void setKcxs(String kcxs) {
        this.kcxs = kcxs;
    }

    public String getKcxf() {
        return kcxf;
    }

    public void setKcxf(String kcxf) {
        this.kcxf = kcxf;
    }

    public String getKcmc() {

        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc;
    }
}
