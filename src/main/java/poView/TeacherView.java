package poView;

import po.Teacherinfo;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1616:19
 * @Description:
 * @Modified By:
 */
public class TeacherView extends Teacherinfo{
    private String deptname;
    private String sbirthday;

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
