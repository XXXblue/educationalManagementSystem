package service;

import po.Classinfo;
import pojoCustom.ClassinfoCustom;
import util.FormResult;
import util.MyResult;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1618:23
 * @Description:
 * @Modified By:
 */
public interface ClassService {
//    管理员添加新课室
    public MyResult addNewClass(Classinfo classinfo)throws Exception;
//    管理员校验课室是否存在
    public boolean checkClass(Classinfo classInfo)throws Exception;
//    管理员展示课室信息
    public FormResult listClassinfoTable(int page,int limit)throws Exception;
//    管理员修改课室信息
    public  MyResult editClassInfo(Classinfo classinfo)throws Exception;
//    管理员删除已有课室
    public MyResult delClassInfo(String[] nums)throws Exception;

    public List<ClassinfoCustom> searchFreeClass(String ct,String ty,String tt,String cd,String cdt,String th)throws Exception;
}
