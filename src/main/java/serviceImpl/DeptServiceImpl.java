package serviceImpl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import exception.CustomException;
import mapper.DeptinfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Deptinfo;
import po.DeptinfoExample;
import poView.DeptInfoSel;
import pojoCustom.DeptCustom;
import service.DeptService;
import util.FormResult;
import util.MyResult;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: XBlue
 * @Date: Create in 2017/9/169:27
 * @Description:
 * @Modified By:
 */
@Service
public class DeptServiceImpl implements DeptService  {
    private static Logger logger = LoggerFactory.getLogger(DeptServiceImpl.class);
    @Autowired
    private DeptinfoMapper deptinfoMapper;
    public MyResult addDept(Deptinfo deptinfo) throws Exception{
      try{
          MyResult myResult=new MyResult();
          if(checkDept(deptinfo.getDeptnum())){
              myResult.setStatus(400);
              return myResult;
          }
          deptinfoMapper.insert(deptinfo);
          myResult.setStatus(200);
          return myResult;
      }catch(Exception e){
          logger.error("错误信息："+e);
        throw new CustomException("新增异常");
      }
    }

    public boolean checkDept(String deptinfonum) throws Exception {
        if(deptinfoMapper.selectByPrimaryKey(deptinfonum)!=null){
            return true;
        }else {
            return false;
        }
    }

    public FormResult ListAllDeptInfo(int page, int limit) throws Exception{
        try{
            DeptinfoExample deptinfoExample=new DeptinfoExample();
            DeptinfoExample.Criteria criteria=deptinfoExample.createCriteria();
            PageHelper.startPage(page,limit);
            List<Deptinfo> list=deptinfoMapper.selectByExample(deptinfoExample);
            PageInfo<Deptinfo> pageInfo = new PageInfo<Deptinfo>(list);
            FormResult formResult=new FormResult();
            formResult.setCode(0);
            formResult.setCount(pageInfo.getTotal());
            formResult.setData(list);
            formResult.setMsg("");
            return formResult;
        }catch (Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("展示异常");
        }
    }

    public MyResult wihtblobsDeptInfo(String deptinfonum) throws Exception{
       try{
           Deptinfo deptinfo=deptinfoMapper.selectByPrimaryKey(deptinfonum);
           MyResult myResult=new MyResult();
           myResult.setStatus(200);
           myResult.setData(deptinfo);
           return myResult;
       }catch(Exception e){
           logger.error("错误信息："+e);
           throw new CustomException("展示详细信息出错");
       }
    }

    public MyResult editdeptInfo(Deptinfo deptinfo) throws Exception{
        MyResult myResult=new MyResult();
        try{
           deptinfoMapper.updateByPrimaryKeySelective(deptinfo);
            myResult.setStatus(200);
            return  myResult;
        }catch (Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("修改信息出错");
        }

    }

    public MyResult delDeptInfo(String[] nums) throws Exception{
        MyResult myResult=new MyResult();
        try{
            for (int i = 0; i <nums.length; i++) {
                deptinfoMapper.deleteByPrimaryKey(nums[i]);
            }
            myResult.setStatus(200);
            return  myResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("删除信息出错");
        }
    }

    public List<DeptInfoSel> listDeptInfo() throws Exception{
       try{
           DeptinfoExample deptinfoExample=new DeptinfoExample();
           DeptinfoExample.Criteria criteria=deptinfoExample.createCriteria();
           List<Deptinfo>list= deptinfoMapper.selectByExample(deptinfoExample);
           List<DeptInfoSel>list2=new ArrayList<DeptInfoSel>();
           for (int i = 0; i < list.size(); i++) {
               DeptInfoSel deptInfoSel=new DeptInfoSel();
               deptInfoSel.setDeptnum(list.get(i).getDeptnum());
               deptInfoSel.setDeptname(list.get(i).getDeptname());
               list2.add(deptInfoSel);
           }
           return list2;
       }catch(Exception e){
           logger.error("错误信息："+e);
           throw new CustomException("下拉数据字典出错");
       }
    }


}
