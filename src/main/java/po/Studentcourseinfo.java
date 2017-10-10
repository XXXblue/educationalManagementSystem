package po;

import java.util.Date;

public class Studentcourseinfo {
    private Integer stucourseid;

    private String studentnum;

    private String coursenum;

    private Integer grade;

    private Date createtime;

    private Date updatetime;

    public Integer getStucourseid() {
        return stucourseid;
    }

    public void setStucourseid(Integer stucourseid) {
        this.stucourseid = stucourseid;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum == null ? null : studentnum.trim();
    }

    public String getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(String coursenum) {
        this.coursenum = coursenum == null ? null : coursenum.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}