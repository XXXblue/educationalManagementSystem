package po;

public class Majorinfo {
    private String majornum;

    private String deptnum;

    private String majorname;

    private String majorassistant;

    private String majortel;

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum == null ? null : majornum.trim();
    }

    public String getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(String deptnum) {
        this.deptnum = deptnum == null ? null : deptnum.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getMajorassistant() {
        return majorassistant;
    }

    public void setMajorassistant(String majorassistant) {
        this.majorassistant = majorassistant == null ? null : majorassistant.trim();
    }

    public String getMajortel() {
        return majortel;
    }

    public void setMajortel(String majortel) {
        this.majortel = majortel == null ? null : majortel.trim();
    }
}