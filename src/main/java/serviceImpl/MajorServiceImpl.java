package serviceImpl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.DeptinfoMapper;
import mapper.MajorinfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Majorinfo;
import po.MajorinfoExample;
import poView.MajorInfoView;
import service.MajorService;
import util.FormResult;
import util.MajorInfoSel;
import util.MyResult;

import javax.sql.RowSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1010:44
 * @Description:
 * @Modified By:
 */
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    private MajorinfoMapper majorinfoMapper;
    @Autowired
    private DeptinfoMapper deptinfoMapper;
    public MyResult addMajor(Majorinfo majorinfo) {
        MyResult myResult=new MyResult();
        if(checkMajor(majorinfo.getMajornum())){
            myResult.setStatus(400);
            myResult.setMsg("重复的专业编号");
            return myResult;
        }
        majorinfoMapper.insert(majorinfo);
        myResult.setMsg("提交成功");
        myResult.setStatus(200);
        return myResult;
    }

    public boolean checkMajor(String majorinfonum) {
       Majorinfo majorinfo = majorinfoMapper.selectByPrimaryKey(majorinfonum);
       if(majorinfo!=null){
           return true;
       }
       return false;
    }

    public FormResult listAllMajor(int page, int limit) {
        MajorinfoExample majorinfoExample=new MajorinfoExample();
        MajorinfoExample.Criteria criteria=majorinfoExample.createCriteria();
        PageHelper.startPage(page,limit);
        List<Majorinfo>list=majorinfoMapper.selectByExample(majorinfoExample);
        PageInfo<Majorinfo> pageInfo = new PageInfo<Majorinfo>(list);
        List<MajorInfoView> list2=new ArrayList<MajorInfoView>();
        for (int i = 0; i < list.size(); i++) {
            MajorInfoView majorInfoView=new MajorInfoView();
            BeanUtils.copyProperties(list.get(i),majorInfoView);
            majorInfoView.setDeptname(deptinfoMapper.selectByPrimaryKey(list.get(i).getDeptnum()).getDeptname());
            list2.add(majorInfoView);
        }
        FormResult formResult=new FormResult();
        formResult.setCode(0);
        formResult.setCount(pageInfo.getTotal());
        formResult.setData(list2);
        formResult.setMsg("");
        return formResult;
    }

    public MyResult editMajor(Majorinfo majorinfo) {
        MyResult myResult=new MyResult();
        try {
            majorinfoMapper.updateByPrimaryKey(majorinfo);
            myResult.setMsg("提交修改成功");
            myResult.setStatus(200);
            return myResult;
        }catch (Exception e){
            myResult.setStatus(400);
            myResult.setMsg("编辑出错");
            return  myResult;
        }
    }

    public MyResult delMajor(String[] majornums) {
        MyResult myResult=new MyResult();
        try {
            for(int i=0;i<majornums.length;i++){
                majorinfoMapper.deleteByPrimaryKey(majornums[i]);
            }
            myResult.setMsg("删除成功成功");
            myResult.setStatus(200);
            return myResult;
        }catch (Exception e){
            myResult.setStatus(400);
            myResult.setMsg("删除出错");
            return  myResult;
        }
    }

    public List<MajorInfoSel> selMajorInfo() {
        MajorinfoExample majorinfoExample=new MajorinfoExample();
        MajorinfoExample.Criteria criteria=majorinfoExample.createCriteria();
        List<Majorinfo>list=majorinfoMapper.selectByExample(majorinfoExample);
        List<MajorInfoSel>list2=new ArrayList<MajorInfoSel>();
        for(int i=0;i<list.size();i++){
            MajorInfoSel majorInfoSel=new MajorInfoSel();
            majorInfoSel.setMajorname(list.get(i).getMajorname());
            majorInfoSel.setMajornum(list.get(i).getMajornum());
            list2.add(majorInfoSel);
        }
        return list2;
    }

}
