package serviceImpl;

import exception.CustomException;
import mapper.KcinfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import othermapper.KcCustomMapper;
import po.Kcinfo;
import po.KcinfoExample;
import pojoCustom.KcCustom;
import service.KcService;
import util.FormResult;
import util.MyResult;

import java.util.List;
import java.util.UUID;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1410:41
 * @Description:
 * @Modified By:
 */
@Service
public class KcServiceImpl implements KcService {
    private static Logger logger = LoggerFactory.getLogger(KcServiceImpl.class);
    @Autowired
    private KcinfoMapper kcinfoMapper;
    @Autowired
    private KcCustomMapper kcCustomMapper;
    public MyResult addNewKc(Kcinfo kcinfo) throws Exception {
        MyResult myResult=new MyResult();
        try{
            if(ifKcRepeat(kcinfo)){
                kcinfo.setKcnum(UUID.randomUUID().toString());
                kcinfoMapper.insert(kcinfo);
                myResult.setStatus(200);
            }else{
                myResult.setStatus(400);
            }
           return myResult;
        }catch(Exception e){
            logger.info("错误信息："+e);
            throw new CustomException("新增課程出錯");
        }
    }

    public FormResult queryKcinfo(int page, int limit) throws Exception{
      try{
          List<KcCustom>list=kcCustomMapper.queryKcinfo((page-1)*limit,limit);
          long total=kcCustomMapper.queryKcinfoNum();
          FormResult formResult=new FormResult();
          formResult.setCode(0);
          formResult.setCount(total);
          formResult.setData(list);
          formResult.setMsg("");
          return formResult;
      }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("展示课程信息异常");
      }

    }

    public MyResult editKcInfo(Kcinfo kcinfo) throws Exception {
        try{
            MyResult myResult=new MyResult();
            if(ifKcRepeat(kcinfo)){
                kcinfoMapper.updateByPrimaryKeyWithBLOBs(kcinfo);
                myResult.setStatus(200);
            }else{
                myResult.setStatus(400);
            }
            return  myResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("修改课程信息异常");
        }
    }

    public MyResult delKcInfo(String[] nums) throws Exception {
        try{
            MyResult myResult=new MyResult();
            myResult.setStatus(200);
            for (int i = 0; i < nums.length; i++) {
                kcinfoMapper.deleteByPrimaryKey(nums[i]);
            }
            return  myResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("删除课程信息异常");
        }
    }

    public List<Kcinfo> listSelCourse() throws Exception {
       try{
           KcinfoExample kcinfoExample=new KcinfoExample();
           return kcinfoMapper.selectByExample(kcinfoExample);
       }catch(Exception e){
           logger.error("错误信息："+e);
           throw new CustomException("ajax课程下拉异常");
       }
    }

    //判断课程明是否完全重复
    public boolean ifKcRepeat(Kcinfo kcinfo)throws Exception{
            KcinfoExample kcinfoExample=new KcinfoExample();
            KcinfoExample.Criteria criteria=kcinfoExample.createCriteria();
            criteria.andKclxEqualTo(kcinfo.getKclx());
            criteria.andDeptnumEqualTo(kcinfo.getDeptnum());
            criteria.andKcmcEqualTo(kcinfo.getKcmc());
            List<Kcinfo> list=kcinfoMapper.selectByExample(kcinfoExample);
            if(list!=null&&list.size()>0){
                if(list.get(0).getKcnum().equals(kcinfo.getKcnum())){
                    return true;
                }
                return false;
            }
            return  true;
    }
}
