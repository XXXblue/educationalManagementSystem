package serviceImpl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.DeptinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Deptinfo;
import po.DeptinfoExample;
import poView.DeptInfoSel;
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
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptinfoMapper deptinfoMapper;
    public MyResult addDept(Deptinfo deptinfo) {
        MyResult myResult=new MyResult();
        if(checkDept(deptinfo.getDeptnum())){
            myResult.setStatus(400);
            myResult.setMsg("重复的学院编号");
            return myResult;
        }
        deptinfoMapper.insert(deptinfo);
        myResult.setMsg("提交成功");
        myResult.setStatus(200);
        return myResult;
    }

    public boolean checkDept(String deptinfonum) {
        if(deptinfoMapper.selectByPrimaryKey(deptinfonum)!=null){
            return true;
        }else {
            return false;
        }
    }

    public FormResult ListAllDeptInfo(int page, int limit) {
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
    }

    public MyResult wihtblobsDeptInfo(String deptinfonum) {
        DeptinfoExample deptinfoExample=new DeptinfoExample();
        DeptinfoExample.Criteria criteria=deptinfoExample.createCriteria();
        criteria.andDeptnumEqualTo(deptinfonum);
        List<Deptinfo>list=deptinfoMapper.selectByExampleWithBLOBs(deptinfoExample);
        MyResult myResult=new MyResult();
        myResult.setStatus(200);
        myResult.setData(list.get(0));
        return myResult;
    }

    public MyResult editdeptInfo(Deptinfo deptinfo) {
        MyResult myResult=new MyResult();
        try{
            DeptinfoExample deptinfoExample=new DeptinfoExample();
            DeptinfoExample.Criteria criteria=deptinfoExample.createCriteria();
            criteria.andDeptnumEqualTo(deptinfo.getDeptnum());
          deptinfoMapper.updateByExampleWithBLOBs(deptinfo,deptinfoExample);
            myResult.setMsg("提交修改成功");
            myResult.setStatus(200);
            return  myResult;
        }catch (Exception e){
            myResult.setStatus(400);
            myResult.setMsg("编辑出错");
            return myResult;
        }

    }

    public MyResult delDeptInfo(String[] nums) {
        MyResult myResult=new MyResult();
        try{
            for (int i = 0; i <nums.length; i++) {
                deptinfoMapper.deleteByPrimaryKey(nums[i]);
            }
            myResult.setMsg("删除成功成功");
            myResult.setStatus(200);
            return  myResult;
        }catch(Exception e){
            myResult.setStatus(400);
            myResult.setMsg("删除出错");
            return  myResult;
        }
    }

    public List<DeptInfoSel> listDeptInfo() {
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
    }


}
