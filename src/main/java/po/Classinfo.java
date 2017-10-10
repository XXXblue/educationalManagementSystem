package po;

public class Classinfo {
    private String classnum;

    private String classman;

    private String classmantel;

    private Integer limitnum;

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum == null ? null : classnum.trim();
    }

    public String getClassman() {
        return classman;
    }

    public void setClassman(String classman) {
        this.classman = classman == null ? null : classman.trim();
    }

    public String getClassmantel() {
        return classmantel;
    }

    public void setClassmantel(String classmantel) {
        this.classmantel = classmantel == null ? null : classmantel.trim();
    }

    public Integer getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(Integer limitnum) {
        this.limitnum = limitnum;
    }
}