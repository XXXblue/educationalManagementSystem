package serviceImpl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.ClassinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Classinfo;
import po.ClassinfoExample;
import service.ClassService;
import util.FormResult;
import util.MyResult;
import util.PropertyUtil;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1618:24
 * @Description:
 * @Modified By:
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassinfoMapper classinfoMapper;

    private static String result= PropertyUtil.getProperty("accessKeyId");

    public MyResult addNewClass(Classinfo classinfo) {
        MyResult myResult=new MyResult();
        if(checkClass(classinfo)){
            myResult.setStatus(400);
            myResult.setMsg("重复的教室编号");
            return myResult;
        }
        classinfoMapper.insert(classinfo);
        myResult.setMsg("提交成功");
        myResult.setStatus(200);
        return myResult;
    }


    public boolean checkClass(Classinfo classinfo) {
       Classinfo classinfo2= classinfoMapper.selectByPrimaryKey(classinfo.getClassnum());
       if(classinfo2!=null){
           return true;
       }
       return  false;
    }

    public FormResult listClassinfoTable(int page,int limit) {
        System.out.println(result);
        ClassinfoExample classinfoExample=new ClassinfoExample();
        ClassinfoExample.Criteria criteria=classinfoExample.createCriteria();
        PageHelper.startPage(page,limit);
        List<Classinfo>list=classinfoMapper.selectByExample(classinfoExample);
        PageInfo<Classinfo> pageInfo = new PageInfo<Classinfo>(list);
        FormResult formResult=new FormResult();
        formResult.setCode(0);
        formResult.setCount(pageInfo.getTotal());
        formResult.setData(list);
        formResult.setMsg("");
        return formResult;
    }

    public MyResult editClassInfo(Classinfo classinfo) {
        MyResult myResult=new MyResult();
        try{
               myResult.setMsg("提交成功");
               myResult.setStatus(200);
                classinfoMapper.updateByPrimaryKey(classinfo);
            return  myResult;
       }catch(Exception e){
           myResult.setStatus(400);
           myResult.setMsg("编辑出错");
            return  myResult ;
       }

    }

    public MyResult delClassInfo(String[] nums) {
        MyResult myResult=new MyResult();
        try{
            for (int i = 0; i < nums.length; i++) {
                classinfoMapper.deleteByPrimaryKey(nums[i]);
            }
            myResult.setMsg("删除成功");
            myResult.setStatus(200);
            return myResult;
        }catch(Exception e){
            myResult.setStatus(400);
            myResult.setMsg("删除出错");
            return  myResult;
        }
    }
}
