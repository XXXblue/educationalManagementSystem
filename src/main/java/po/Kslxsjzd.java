package po;

public class Kslxsjzd {
    private Integer id;

    private String kslxmc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKslxmc() {
        return kslxmc;
    }

    public void setKslxmc(String kslxmc) {
        this.kslxmc = kslxmc == null ? null : kslxmc.trim();
    }
}