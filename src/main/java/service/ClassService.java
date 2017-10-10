package service;

import po.Classinfo;
import util.FormResult;
import util.MyResult;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1618:23
 * @Description:
 * @Modified By:
 */
public interface ClassService {
//    管理员添加新课室
    public MyResult addNewClass(Classinfo classinfo);
//    管理员校验课室是否存在
    public boolean checkClass(Classinfo classInfo);
//    管理员展示课室信息
    public FormResult listClassinfoTable(int page,int limit);
//    管理员修改课室信息
    public  MyResult editClassInfo(Classinfo classinfo);
//    管理员删除已有课室
    public MyResult delClassInfo(String[] nums);
}
