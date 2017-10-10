package po;

import java.util.Date;

public class Managerinfo {
    private String managernum;

    private String managername;

    private String managersex;

    private Date managerbirthday;

    private String managerpassword;

    private String managerrole;

    public String getManagernum() {
        return managernum;
    }

    public void setManagernum(String managernum) {
        this.managernum = managernum == null ? null : managernum.trim();
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername == null ? null : managername.trim();
    }

    public String getManagersex() {
        return managersex;
    }

    public void setManagersex(String managersex) {
        this.managersex = managersex == null ? null : managersex.trim();
    }

    public Date getManagerbirthday() {
        return managerbirthday;
    }

    public void setManagerbirthday(Date managerbirthday) {
        this.managerbirthday = managerbirthday;
    }

    public String getManagerpassword() {
        return managerpassword;
    }

    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword == null ? null : managerpassword.trim();
    }

    public String getManagerrole() {
        return managerrole;
    }

    public void setManagerrole(String managerrole) {
        this.managerrole = managerrole == null ? null : managerrole.trim();
    }
}