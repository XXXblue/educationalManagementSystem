package serviceImpl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import exception.CustomException;
import mapper.ClassinfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import othermapper.ClassinfoCustomMapper;
import po.Classinfo;
import po.ClassinfoExample;
import pojoCustom.ClassinfoCustom;
import service.ClassService;
import util.FormResult;
import util.MyResult;
import util.PropertyUtil;

import javax.servlet.jsp.tagext.TryCatchFinally;
import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1618:24
 * @Description:
 * @Modified By:
 */
@Service
public class ClassServiceImpl implements ClassService {
    private static Logger logger = LoggerFactory.getLogger(ClassServiceImpl.class);
    @Autowired
    private ClassinfoMapper classinfoMapper;
    @Autowired
    private ClassinfoCustomMapper classinfoCustomMapper;

    public MyResult addNewClass(Classinfo classinfo) throws Exception{
           MyResult myResult=new MyResult();
            try{
                if(checkClass(classinfo)){
                    myResult.setStatus(2);
                    return myResult;
                }
                classinfoMapper.insert(classinfo);
                myResult.setStatus(1);
                return myResult;
            }catch(Exception e){
                logger.error("错误原因："+e.getMessage());
                throw new CustomException("增加异常");
            }
    }


    public boolean checkClass(Classinfo classinfo) {
       Classinfo classinfo2= classinfoMapper.selectByPrimaryKey(classinfo.getClassnum());
       if(classinfo2!=null){
           return true;
       }
       return  false;
    }

    public FormResult listClassinfoTable(int page,int limit) throws Exception{
        try{
           List<ClassinfoCustom>list=classinfoCustomMapper.queryClassinfo((page-1)*limit,limit);
           long total=classinfoCustomMapper.queryClassinfoNum();
            FormResult formResult=new FormResult();
            formResult.setCode(0);
            formResult.setCount(total);
            formResult.setData(list);
            formResult.setMsg("");
            return formResult;
        }catch(Exception e){
            logger.error("错误原因："+e.getMessage());
            throw new CustomException("展示异常");
        }
    }

    public MyResult editClassInfo(Classinfo classinfo) throws Exception{
      try{
          MyResult myResult=new MyResult();
          myResult.setStatus(200);
          classinfoMapper.updateByPrimaryKey(classinfo);
          return  myResult;
      }catch (Exception e){
          logger.error("错误原因："+e.getMessage());
          throw new CustomException("编辑异常");
      }
    }

    public MyResult delClassInfo(String[] nums) throws Exception{
       try{
           MyResult myResult=new MyResult();
           for (int i = 0; i < nums.length; i++) {
               classinfoMapper.deleteByPrimaryKey(nums[i]);
           }
           myResult.setStatus(200);
           return myResult;
       }catch (Exception e){
           logger.error("错误原因："+e.getMessage());
           throw new CustomException("删除异常");
       }
    }
}
