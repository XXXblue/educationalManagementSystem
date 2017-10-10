package po;

public class Deptinfo {
    private String deptnum;

    private String deptname;

    private String deptchairman;

    private String depttel;

    private String deptdesc;

    public String getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(String deptnum) {
        this.deptnum = deptnum == null ? null : deptnum.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDeptchairman() {
        return deptchairman;
    }

    public void setDeptchairman(String deptchairman) {
        this.deptchairman = deptchairman == null ? null : deptchairman.trim();
    }

    public String getDepttel() {
        return depttel;
    }

    public void setDepttel(String depttel) {
        this.depttel = depttel == null ? null : depttel.trim();
    }

    public String getDeptdesc() {
        return deptdesc;
    }

    public void setDeptdesc(String deptdesc) {
        this.deptdesc = deptdesc == null ? null : deptdesc.trim();
    }
}