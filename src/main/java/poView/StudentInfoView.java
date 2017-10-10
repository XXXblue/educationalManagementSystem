package poView;

import po.Studentinfo;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/168:49
 * @Description:
 * @Modified By:
 */
public class StudentInfoView extends Studentinfo {
    private String deptname;
    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    private Integer limit;
    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
