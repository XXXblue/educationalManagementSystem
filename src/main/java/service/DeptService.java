package service;

import po.Deptinfo;
import po.Majorinfo;
import poView.DeptInfoSel;
import util.FormResult;
import util.MyResult;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/169:26
 * @Description:
 * @Modified By:
 */
public interface DeptService {
//    管理员添加新学院
    public MyResult addDept(Deptinfo deptinfo)throws Exception;
//    管理员校验学院是否存在
    public boolean checkDept(String deptinfonum)throws Exception;
//    管理员展示学院信息
    public FormResult ListAllDeptInfo(int page,int limit)throws Exception;
//    管理员展示学院详细介绍
    public MyResult wihtblobsDeptInfo(String deptinfonum)throws Exception;
//    管理员修改学院信息
    public MyResult editdeptInfo(Deptinfo deptinfo)throws Exception;
//    管理员删除学院
    public MyResult delDeptInfo(String[] nums)throws Exception;
//    下拉ajax加载学院信息
    public List<DeptInfoSel> listDeptInfo()throws Exception;
}
