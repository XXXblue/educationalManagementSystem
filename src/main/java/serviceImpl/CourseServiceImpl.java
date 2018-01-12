package serviceImpl;

import QueryVo.CourseinfoQueryVo;
import QueryVo.StudentCourseInfoQueryVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import exception.CustomException;
import mapper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import othermapper.CourseinfoCustomMapper;
import othermapper.MyCourseMapper;
import othermapper.MyStudentCourseInfoMapper;
import po.*;
import poView.ActiveRole;
import poView.CourseInfoView;
import poView.CourseInfoViewShowStudent;
import poView.CourseinfoConflict;
import pojoCustom.CourseinfoCustom;
import service.CourseService;
import util.FormResult;
import util.MyResult;
import util.CourseInfoViewTurn;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1710:59
 * @Description:
 * @Modified By:
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private ClassinfoMapper classinfoMapper;
    @Autowired
    private CourseinfoMapper courseinfoMapper;
    @Autowired
    private MyCourseMapper myCourseMapper;
    @Autowired
    private MyStudentCourseInfoMapper myStudentCourseInfoMapper;
    @Autowired
    private CourseinfoCustomMapper courseinfoCustomMapper;
    @Autowired
    private StudentcourseinfoMapper studentcourseinfoMapper;
    @Autowired
    private StudentinfoMapper studentinfoMapper;
    @Autowired
    private MajorinfoMapper majorinfoMapper;
    private static Logger logger = LoggerFactory.getLogger(CourseServiceImpl.class);
    public MyResult addNewCourse(Courseinfo courseinfo) throws Exception{
           try{
               MyResult myResult=new MyResult();
               courseinfo.setCoursenum(UUID.randomUUID().toString());
               courseinfo.setCreatetime(new Date());
               courseinfo.setUpdatetime(new Date());
               courseinfo.setCoursestatus("0");
               courseinfo.setIfgrade("0");
               courseinfo.setCoursefree(courseinfo.getCoursenumlimit());
               courseinfoMapper.insert(courseinfo);
               myResult.setMsg("提交成功");
               myResult.setStatus(200);
               return  myResult;
           }catch(Exception e){
                logger.error("错误信息："+e);
                throw new CustomException("新增课程异常");
           }

    }

    public FormResult listAllCourseInfoTable(int page, int limit) throws Exception {
        try{
            List<CourseinfoCustom>list=courseinfoCustomMapper.queryCourseinfo((page-1)*limit,limit);
            long total=courseinfoCustomMapper.queryCourseinfoNum();
            FormResult formResult=new FormResult();
            formResult.setCode(0);
            formResult.setCount(total);
            formResult.setData(list);
            formResult.setMsg("");
            return formResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("排课展示列表错误");
        }
    }


    public MyResult delCourseInfo(String[] nums) throws Exception{
        MyResult myResult=new MyResult();
        try{
            StudentCourseInfoQueryVo studentCourseInfoQueryVo=new StudentCourseInfoQueryVo();
            Studentcourseinfo studentcourseinfo=new Studentcourseinfo();
            for (int i = 0; i < nums.length; i++) {
                courseinfoMapper.deleteByPrimaryKey(nums[i]);
                studentcourseinfo.setCoursenum(nums[i]);
                studentCourseInfoQueryVo.setStudentcourseinfo(studentcourseinfo);
                myStudentCourseInfoMapper.stuDelCourse(studentCourseInfoQueryVo);
            }
            myResult.setStatus(200);
            return myResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("删除列表错误");
        }
    }

    public MyResult editCourseInfo(Courseinfo courseinfo) throws Exception {
        try{
            MyResult myResult=new MyResult();
            CourseinfoExample courseinfoExample=new CourseinfoExample();
            CourseinfoExample.Criteria criteria= courseinfoExample.createCriteria();
            if(courseinfo.getClassnum()==null||courseinfo.getClassnum().equals("")){
                Courseinfo courseinfoS=courseinfoMapper.selectByPrimaryKey(courseinfo.getCoursenum());
                courseinfo.setClassnum(courseinfoS.getClassnum());
            }
            criteria.andClassnumEqualTo(courseinfo.getClassnum());
            criteria.andCoursedayEqualTo(courseinfo.getCourseday());
            criteria.andCoursedaytimeEqualTo(courseinfo.getCoursedaytime());
            criteria.andCourseteachernumEqualTo(courseinfo.getCourseteachernum());
            criteria.andTermyearEqualTo(courseinfo.getTermyear());
            criteria.andTermtimeEqualTo(courseinfo.getTermtime());
            List<Courseinfo>list=courseinfoMapper.selectByExample(courseinfoExample);
            if(list!=null&&list.size()>0){
                if(list.size()==1&&list.get(0).getCoursenum().equals(courseinfo.getCoursenum())){
                    courseinfoMapper.updateByPrimaryKeySelective(courseinfo);
                    myResult.setStatus(200);
                    return myResult;
                }else{
                    myResult.setStatus(400);
                    return myResult;
                }
            }
            courseinfoMapper.updateByPrimaryKeySelective(courseinfo);
            myResult.setStatus(200);
            return myResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("排课修改错误");
        }
    }

    public FormResult selCourseInfoTable(int page, int limit,HttpSession session)throws Exception {
        try{
            ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
            StudentcourseinfoExample studentcourseinfoExample=new StudentcourseinfoExample();
            StudentcourseinfoExample.Criteria criteria=studentcourseinfoExample.createCriteria();
            criteria.andStudentnumEqualTo(activeRole.getUsernum());
            List<Studentcourseinfo> clist=studentcourseinfoMapper.selectByExample(studentcourseinfoExample);
            Set<String> set=new HashSet<String>();
            if(clist!=null&& clist.size()>0){
                for(Studentcourseinfo studentcourseinfo: clist){
                    set.add(studentcourseinfo.getCoursenum());
                }
            }
            Map map=new HashMap<String ,Object>();
            CourseinfoCustom courseinfoCustom=new CourseinfoCustom();
            courseinfoCustom.setKclx("校级公选课");
            courseinfoCustom.setIfopen("1");
            map.put("page",(page-1)*limit);
            map.put("limit",limit);
            map.put("courseinfoCustom", courseinfoCustom);
            List<CourseinfoCustom>list=courseinfoCustomMapper.selCourseinfoTable(map);
            List<CourseinfoCustom>rlist=new ArrayList<CourseinfoCustom>();
            for(CourseinfoCustom courseinfoCustomS:list){
                if(clist!=null&& clist.size()>0&&set.contains(courseinfoCustomS.getCoursenum())){
                    courseinfoCustomS.setStatus("1");
                }else{
                    courseinfoCustomS.setStatus("0");
                }
                rlist.add(courseinfoCustomS);
            }
            long total=courseinfoCustomMapper.selCourseinfoTableNum(map);
            FormResult formResult=new FormResult();
            formResult.setCode(0);
            formResult.setCount((long) total);
            formResult.setData(rlist);
            formResult.setMsg("");
            return formResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("排课修改错误");
        }
    }

    public FormResult selCourseInfoTable2(int page, int limit, HttpSession session) throws Exception {
        try{
            ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
            StudentcourseinfoExample studentcourseinfoExample=new StudentcourseinfoExample();
            StudentcourseinfoExample.Criteria criteria=studentcourseinfoExample.createCriteria();
            criteria.andStudentnumEqualTo(activeRole.getUsernum());
            List<Studentcourseinfo> clist=studentcourseinfoMapper.selectByExample(studentcourseinfoExample);
            Set<String> set=new HashSet<String>();
            if(clist!=null&& clist.size()>0){
                for(Studentcourseinfo studentcourseinfo: clist){
                    set.add(studentcourseinfo.getCoursenum());
                }
            }
            Studentinfo studentinfo=studentinfoMapper.selectByPrimaryKey(activeRole.getUsernum());
            Map map=new HashMap<String ,Object>();
            CourseinfoCustom courseinfoCustom=new CourseinfoCustom();
            courseinfoCustom.setKclx("学院选修课");
            courseinfoCustom.setIfopen("1");
            Majorinfo majorinfo=majorinfoMapper.selectByPrimaryKey(studentinfo.getMajornum());
            courseinfoCustom.setDeptnum(majorinfo.getDeptnum());
            map.put("page",(page-1)*limit);
            map.put("limit",limit);
            map.put("courseinfoCustom", courseinfoCustom);
            List<CourseinfoCustom>list=courseinfoCustomMapper.selCourseinfoTable2(map);
            List<CourseinfoCustom>rlist=new ArrayList<CourseinfoCustom>();
            for(CourseinfoCustom courseinfoCustomS:list){
                if(clist!=null&& clist.size()>0&&set.contains(courseinfoCustomS.getCoursenum())){
                    courseinfoCustomS.setStatus("1");
                }else{
                    courseinfoCustomS.setStatus("0");
                }
                rlist.add(courseinfoCustomS);
            }
            long total=courseinfoCustomMapper.selCourseinfoTableNum2(map);
            FormResult formResult=new FormResult();
            formResult.setCode(0);
            formResult.setCount((long) total);
            formResult.setData(rlist);
            formResult.setMsg("");
            return formResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("排课修改错误");
        }
    }

    public MyResult stuAddNewCourse(String courseNum, HttpSession session) {
//        检查是否有库存是否大于0
        Courseinfo courseinfo= myCourseMapper.selcetByPrimaryKey(courseNum);
        MyResult myResult=new MyResult();
        if(courseinfo!=null){
            if(courseinfo.getCoursefree()==0){
                myResult.setMsg("抱歉，此课程满选");
                myResult.setStatus(1);
                return myResult;
            }
//            检查课程是否冲突
//            搜素该课程的 四个要点
              CourseinfoConflict courseinfoConflict= myCourseMapper.stuSelCourseCheckConflict(courseNum);
//            根据学生学号，四个要点去遍历学生所有课程，如果出现有课程则证明课程有冲突
            ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
            List<Courseinfo> list=myCourseMapper.checkStuAllSelCourse(activeRole.getUsernum(),courseinfoConflict.getCourseDay()+"",
         courseinfoConflict.getCourseDayTime()+"", courseinfoConflict.getTermYear(),courseinfoConflict.getTermTime());
            if(list!=null&&list.size()>0){
                myResult.setMsg("抱歉，课程冲突");
                myResult.setStatus(3);
                return  myResult;
            }
//

//        选择课程记录到学生选课表
            Studentcourseinfo studentcourseinfo=new Studentcourseinfo();
//         先模拟学生已经登录
            studentcourseinfo.setStudentnum(activeRole.getUsernum());
            studentcourseinfo.setCreatetime(new Date());
            studentcourseinfo.setUpdatetime(new Date());
            studentcourseinfo.setCoursenum(courseNum);
            studentcourseinfoMapper.insert(studentcourseinfo);
//        课程的数量要减1
            courseinfo.setCoursefree(courseinfo.getCoursefree()-1);
            courseinfoMapper.updateByPrimaryKey(courseinfo);
            myResult.setStatus(2);
            myResult.setMsg("选课成功");
            return myResult;
        }
        return null;
    }

    public MyResult stuRemoveCourse(String courseNum,HttpSession session) {

        StudentCourseInfoQueryVo studentCourseInfoQueryVo=new StudentCourseInfoQueryVo();
        Studentcourseinfo studentcourseinfo=new Studentcourseinfo();
//        模拟学生已经登录
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
        studentcourseinfo.setStudentnum(activeRole.getUsernum());
        studentcourseinfo.setCoursenum(courseNum);
        studentCourseInfoQueryVo.setStudentcourseinfo(studentcourseinfo);
//       退选删除stuourseinfo的内容
        myStudentCourseInfoMapper.stuDelCourse(studentCourseInfoQueryVo);
//       courseinfo内容加1
        Courseinfo courserInfo= courseinfoMapper.selectByPrimaryKey(courseNum);
        courserInfo.setCoursefree(courserInfo.getCoursefree()+1);
        courseinfoMapper.updateByPrimaryKey(courserInfo);
        MyResult myResult=new MyResult();
        myResult.setStatus(1);
        myResult.setMsg("退选成功");
        return myResult;
    }


    public FormResult searchCourseByCondition(CourseinfoCustom courseinfoCustom, int page, int limit) throws Exception {
        try{
            Map map=new HashMap<String,Object>();
            map.put("courseinfoCustom",courseinfoCustom);
            map.put("page",(page-1)*limit);
            map.put("limit",limit);
           List<CourseinfoCustom> list= courseinfoCustomMapper.searchByCondition(map);
           Integer total=courseinfoCustomMapper.searchByConditionNum(map);
           FormResult formResult=new FormResult();
           formResult.setCode(0);
           formResult.setCount((long) total);
           formResult.setData(list);
           return formResult;
        }catch(Exception e){
            logger.error("错误信息："+e);
            throw new CustomException("查询排课信息错误");
        }
    }


    public MyResult changeCourseStatus(String user, String coursenum) {
        MyResult myResult=new MyResult();
        if(user.equals("manager")){
            Courseinfo courseinfo=courseinfoMapper.selectByPrimaryKey(coursenum);
            if((courseinfo.getCoursenumlimit()-courseinfo.getCoursefree())>=Integer.parseInt(courseinfo.getCourseopennum())){
                    Courseinfo courseinfoU=new Courseinfo();
                    courseinfoU.setCoursenum(coursenum);
                    courseinfoU.setCoursestatus("1");
                    courseinfoMapper.updateByPrimaryKeySelective(courseinfoU);
                    myResult=new MyResult();
                    myResult.setStatus(1);
            }else{
                    myResult=new MyResult();
                    myResult.setStatus(2);
            }
        }
        if(user.equals("teacher")){
            Courseinfo courseinfo=new Courseinfo();
            courseinfo.setCoursenum(coursenum);
            courseinfo.setCoursestatus("2");
            courseinfoMapper.updateByPrimaryKeySelective(courseinfo);
            myResult=new MyResult();
            myResult.setStatus(1);
        }
        return myResult;
    }


    public boolean checkCourseExist(Courseinfo courseinfo) {
        Courseinfo courseinfo1=courseinfoMapper.selectByPrimaryKey(courseinfo.getCoursenum());
        if(courseinfo1!=null){
            return true;
        }
        return false;
    }



}
