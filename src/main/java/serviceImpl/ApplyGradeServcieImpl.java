package serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.ApplygradeMapper;
import mapper.CourseinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Applygrade;
import po.ApplygradeExample;
import po.Courseinfo;
import service.ApplyGradeServcie;
import util.FormResult;
import util.MyResult;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/618:23
 * @Description:
 * @Modified By:
 */
@Service
public class ApplyGradeServcieImpl implements ApplyGradeServcie {
    @Autowired
    private ApplygradeMapper applygradeMapper;
    @Autowired
    private CourseinfoMapper courseinfoMapper;
    public FormResult applygradeTable(int page, int limit) {
        ApplygradeExample applygradeExample=new ApplygradeExample();
        ApplygradeExample.Criteria criteria=applygradeExample.createCriteria();
        PageHelper.startPage(page,limit);
        List<Applygrade>list=applygradeMapper.selectByExample(applygradeExample);
        PageInfo<Applygrade>pageInfo=new PageInfo<Applygrade>(list);
        FormResult formResult=new FormResult();
        formResult.setCount(pageInfo.getTotal());
        formResult.setData(list);
        formResult.setMsg("");
        formResult.setCode(0);
        return formResult;
    }

    public MyResult ifAgreeSubmitGrade(String ifagree, Applygrade applygrade) {
        MyResult myResult=new MyResult();
        Applygrade applygradeU=new Applygrade();
        Courseinfo courseinfo=new Courseinfo();
        courseinfo.setCoursenum(applygrade.getCoursenum());
        if(ifagree.equals("1")){
            applygradeU.setIfpass("1");
            applygradeU.setId(applygrade.getId());
            courseinfo.setIfgrade("2");
        }else{
            applygradeU.setId(applygrade.getId());
            applygradeU.setIfpass("2");
            courseinfo.setIfgrade("3");
        }
        applygradeMapper.updateByPrimaryKeySelective(applygradeU);
        courseinfoMapper.updateByPrimaryKeySelective(courseinfo);
        return myResult;
    }
}
