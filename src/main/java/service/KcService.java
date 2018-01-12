package service;

import po.Kcinfo;
import util.FormResult;
import util.MyResult;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1410:40
 * @Description:
 * @Modified By:
 */
public interface KcService {
    public MyResult addNewKc(Kcinfo kcinfo) throws Exception ;
    public FormResult queryKcinfo(int page,int limit)throws Exception;
    public MyResult editKcInfo(Kcinfo kcinfo) throws Exception;
    public MyResult delKcInfo(String[] nums)throws Exception;
    public List<Kcinfo> listSelCourse()throws Exception;
}
