package po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Courseinfo {
    private String coursenum;

    private String coursename;

    private Integer coursecredit;

    private String classnum;

    private String courseteachernum;

    private Integer coursenumlimit;

    private Integer coursefree;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createtime;

    private Date updatetime;

    private String termyear;

    private Integer courselong;

    private Integer coursestartweek;

    private Integer courseendweek;

    private Integer courseday;

    private Integer coursedaytime;

    private String majornum;

    private String termtime;

    private String ifopen;

    private String ifgrade;

    private String coursedesc;

    public String getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(String coursenum) {
        this.coursenum = coursenum == null ? null : coursenum.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Integer getCoursecredit() {
        return coursecredit;
    }

    public void setCoursecredit(Integer coursecredit) {
        this.coursecredit = coursecredit;
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum == null ? null : classnum.trim();
    }

    public String getCourseteachernum() {
        return courseteachernum;
    }

    public void setCourseteachernum(String courseteachernum) {
        this.courseteachernum = courseteachernum == null ? null : courseteachernum.trim();
    }

    public Integer getCoursenumlimit() {
        return coursenumlimit;
    }

    public void setCoursenumlimit(Integer coursenumlimit) {
        this.coursenumlimit = coursenumlimit;
    }

    public Integer getCoursefree() {
        return coursefree;
    }

    public void setCoursefree(Integer coursefree) {
        this.coursefree = coursefree;
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

    public String getTermyear() {
        return termyear;
    }

    public void setTermyear(String termyear) {
        this.termyear = termyear == null ? null : termyear.trim();
    }

    public Integer getCourselong() {
        return courselong;
    }

    public void setCourselong(Integer courselong) {
        this.courselong = courselong;
    }

    public Integer getCoursestartweek() {
        return coursestartweek;
    }

    public void setCoursestartweek(Integer coursestartweek) {
        this.coursestartweek = coursestartweek;
    }

    public Integer getCourseendweek() {
        return courseendweek;
    }

    public void setCourseendweek(Integer courseendweek) {
        this.courseendweek = courseendweek;
    }

    public Integer getCourseday() {
        return courseday;
    }

    public void setCourseday(Integer courseday) {
        this.courseday = courseday;
    }

    public Integer getCoursedaytime() {
        return coursedaytime;
    }

    public void setCoursedaytime(Integer coursedaytime) {
        this.coursedaytime = coursedaytime;
    }

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum == null ? null : majornum.trim();
    }

    public String getTermtime() {
        return termtime;
    }

    public void setTermtime(String termtime) {
        this.termtime = termtime == null ? null : termtime.trim();
    }

    public String getIfopen() {
        return ifopen;
    }

    public void setIfopen(String ifopen) {
        this.ifopen = ifopen == null ? null : ifopen.trim();
    }

    public String getIfgrade() {
        return ifgrade;
    }

    public void setIfgrade(String ifgrade) {
        this.ifgrade = ifgrade == null ? null : ifgrade.trim();
    }

    public String getCoursedesc() {
        return coursedesc;
    }

    public void setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc == null ? null : coursedesc.trim();
    }
}