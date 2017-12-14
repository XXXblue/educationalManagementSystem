package pojoCustom;

import po.Classinfo;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1312:22
 * @Description:
 * @Modified By:
 */
public class ClassinfoCustom extends Classinfo{
    private String kslxmc;
    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setLimit(Integer limit) {
        Limit = limit;
    }

    private Integer Limit;
    public String getKslxmc() {
        return kslxmc;
    }

    public void setKslxmc(String kslxmc) {
        this.kslxmc = kslxmc;
    }
}
