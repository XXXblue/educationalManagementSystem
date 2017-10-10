package service;

import po.Majorinfo;
import util.FormResult;
import util.MajorInfoSel;
import util.MyResult;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1010:43
 * @Description:
 * @Modified By:
 */
public interface MajorService {
//    管理员添加新专业
    public MyResult addMajor(Majorinfo majorinfo);
//    管理员校验专业是否存在
    public boolean checkMajor(String majorinfonum);
//    管理员展示专业信息
    public FormResult listAllMajor(int page, int limit);
//    管理员修改专业信息
    public MyResult editMajor(Majorinfo majorinfo);
//    管理员删除专业信息
    public MyResult delMajor(String []majornums);
//    下拉ajax加载专业信息
    public List<MajorInfoSel> selMajorInfo();
}
