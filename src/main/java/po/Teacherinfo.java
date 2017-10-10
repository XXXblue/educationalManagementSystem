package po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Teacherinfo {
    private String teachernum;

    private String deptnum;

    private String teachername;

    private String teachersex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date teacherbirthday;

    private String teachertitle;

    private String teacherpassword;

    private String teacherphone;

    private String teacherrole;

    private String teacherpic;

    private String teacheridcardnum;

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public String getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(String deptnum) {
        this.deptnum = deptnum == null ? null : deptnum.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeachersex() {
        return teachersex;
    }

    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex == null ? null : teachersex.trim();
    }

    public Date getTeacherbirthday() {
        return teacherbirthday;
    }

    public void setTeacherbirthday(Date teacherbirthday) {
        this.teacherbirthday = teacherbirthday;
    }

    public String getTeachertitle() {
        return teachertitle;
    }

    public void setTeachertitle(String teachertitle) {
        this.teachertitle = teachertitle == null ? null : teachertitle.trim();
    }

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword == null ? null : teacherpassword.trim();
    }

    public String getTeacherphone() {
        return teacherphone;
    }

    public void setTeacherphone(String teacherphone) {
        this.teacherphone = teacherphone == null ? null : teacherphone.trim();
    }

    public String getTeacherrole() {
        return teacherrole;
    }

    public void setTeacherrole(String teacherrole) {
        this.teacherrole = teacherrole == null ? null : teacherrole.trim();
    }

    public String getTeacherpic() {
        return teacherpic;
    }

    public void setTeacherpic(String teacherpic) {
        this.teacherpic = teacherpic == null ? null : teacherpic.trim();
    }

    public String getTeacheridcardnum() {
        return teacheridcardnum;
    }

    public void setTeacheridcardnum(String teacheridcardnum) {
        this.teacheridcardnum = teacheridcardnum == null ? null : teacheridcardnum.trim();
    }
}