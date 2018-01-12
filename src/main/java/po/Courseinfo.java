package po;

import java.util.Date;

public class Courseinfo {
    private String coursenum;

    private String classnum;

    private String courseteachernum;

    private Integer coursenumlimit;

    private Integer coursefree;

    private Date createtime;

    private Date updatetime;

    private String termyear;

    private String coursestartweek;

    private String courseendweek;

    private String courseday;

    private String coursedaytime;

    private String termtime;

    private String ifopen;

    private String ifgrade;

    private String courseopennum;

    private String coursestatus;

    private String kcnum;

    public String getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(String coursenum) {
        this.coursenum = coursenum == null ? null : coursenum.trim();
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

    public String getCoursestartweek() {
        return coursestartweek;
    }

    public void setCoursestartweek(String coursestartweek) {
        this.coursestartweek = coursestartweek == null ? null : coursestartweek.trim();
    }

    public String getCourseendweek() {
        return courseendweek;
    }

    public void setCourseendweek(String courseendweek) {
        this.courseendweek = courseendweek == null ? null : courseendweek.trim();
    }

    public String getCourseday() {
        return courseday;
    }

    public void setCourseday(String courseday) {
        this.courseday = courseday == null ? null : courseday.trim();
    }

    public String getCoursedaytime() {
        return coursedaytime;
    }

    public void setCoursedaytime(String coursedaytime) {
        this.coursedaytime = coursedaytime == null ? null : coursedaytime.trim();
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

    public String getCourseopennum() {
        return courseopennum;
    }

    public void setCourseopennum(String courseopennum) {
        this.courseopennum = courseopennum == null ? null : courseopennum.trim();
    }

    public String getCoursestatus() {
        return coursestatus;
    }

    public void setCoursestatus(String coursestatus) {
        this.coursestatus = coursestatus == null ? null : coursestatus.trim();
    }

    public String getKcnum() {
        return kcnum;
    }

    public void setKcnum(String kcnum) {
        this.kcnum = kcnum == null ? null : kcnum.trim();
    }
}