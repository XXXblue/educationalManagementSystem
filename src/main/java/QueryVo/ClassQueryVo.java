package QueryVo;

import po.Classinfo;
import pojoCustom.ClassinfoCustom;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1311:05
 * @Description:
 * @Modified By:
 */
public class ClassQueryVo {
    public ClassinfoCustom getClassinfoCustom() {
        return classinfoCustom;
    }

    public void setClassinfoCustom(ClassinfoCustom classinfoCustom) {
        this.classinfoCustom = classinfoCustom;
    }

    private ClassinfoCustom classinfoCustom;

}
