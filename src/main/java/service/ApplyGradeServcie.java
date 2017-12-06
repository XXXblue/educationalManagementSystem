package service;

import po.Applygrade;
import util.FormResult;
import util.MyResult;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/618:22
 * @Description:
 * @Modified By:
 */
public interface ApplyGradeServcie {
    public FormResult applygradeTable(int page,int limit);
    public MyResult ifAgreeSubmitGrade(String ifagree, Applygrade applygrade);
}
