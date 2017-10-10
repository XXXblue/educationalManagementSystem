package po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Studentinfo {
    private String studentnum;

    private String majornum;

    private String studentname;

    private String studentsex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date studentbirthday;

    private String studentpassword;

    private String studentphonenum;

    private String studentpic;

    private String studentrole;

    private String studentorganization;

    private String studentcomeyear;

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum == null ? null : studentnum.trim();
    }

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum == null ? null : majornum.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex == null ? null : studentsex.trim();
    }

    public Date getStudentbirthday() {
        return studentbirthday;
    }

    public void setStudentbirthday(Date studentbirthday) {
        this.studentbirthday = studentbirthday;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword == null ? null : studentpassword.trim();
    }

    public String getStudentphonenum() {
        return studentphonenum;
    }

    public void setStudentphonenum(String studentphonenum) {
        this.studentphonenum = studentphonenum == null ? null : studentphonenum.trim();
    }

    public String getStudentpic() {
        return studentpic;
    }

    public void setStudentpic(String studentpic) {
        this.studentpic = studentpic == null ? null : studentpic.trim();
    }

    public String getStudentrole() {
        return studentrole;
    }

    public void setStudentrole(String studentrole) {
        this.studentrole = studentrole == null ? null : studentrole.trim();
    }

    public String getStudentorganization() {
        return studentorganization;
    }

    public void setStudentorganization(String studentorganization) {
        this.studentorganization = studentorganization == null ? null : studentorganization.trim();
    }

    public String getStudentcomeyear() {
        return studentcomeyear;
    }

    public void setStudentcomeyear(String studentcomeyear) {
        this.studentcomeyear = studentcomeyear == null ? null : studentcomeyear.trim();
    }
}