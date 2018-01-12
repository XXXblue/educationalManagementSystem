package po;

public class Kcinfo {
    private String kcnum;

    private String kcxf;

    private String kcxs;

    private String deptnum;

    private String kclx;

    private String kcmc;

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

    public String getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(String deptnum) {
        this.deptnum = deptnum == null ? null : deptnum.trim();
    }

    public String getKclx() {
        return kclx;
    }

    public void setKclx(String kclx) {
        this.kclx = kclx == null ? null : kclx.trim();
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc == null ? null : kcmc.trim();
    }

    public String getKcjj() {
        return kcjj;
    }

    public void setKcjj(String kcjj) {
        this.kcjj = kcjj == null ? null : kcjj.trim();
    }
}