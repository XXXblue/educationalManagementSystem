package po;

public class Kcinfo {
    private String kcnum;

    private String kcxf;

    private String kcxs;

    private String majornum;

    private String kcjj;

    public String getKcnum() {
        return kcnum;
    }

    public void setKcnum(String kcnum) {
        this.kcnum = kcnum == null ? null : kcnum.trim();
    }

    public String getKcxf() {
        return kcxf;
    }

    public void setKcxf(String kcxf) {
        this.kcxf = kcxf == null ? null : kcxf.trim();
    }

    public String getKcxs() {
        return kcxs;
    }

    public void setKcxs(String kcxs) {
        this.kcxs = kcxs == null ? null : kcxs.trim();
    }

    public String getMajornum() {
        return majornum;
    }

    public void setMajornum(String majornum) {
        this.majornum = majornum == null ? null : majornum.trim();
    }

    public String getKcjj() {
        return kcjj;
    }

    public void setKcjj(String kcjj) {
        this.kcjj = kcjj == null ? null : kcjj.trim();
    }
}