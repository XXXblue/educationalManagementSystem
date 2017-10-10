package serviceImpl;

import QueryVo.CourseinfoQueryVo;
import QueryVo.StudentCourseInfoQueryVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.ClassinfoMapper;
import mapper.CourseinfoMapper;
import mapper.MajorinfoMapper;
import mapper.StudentcourseinfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import othermapper.MyCourseMapper;
import othermapper.MyStudentCourseInfoMapper;
import po.*;
import poView.ActiveRole;
import poView.CourseInfoView;
import poView.CourseInfoViewShowStudent;
import poView.CourseinfoConflict;
import service.CourseService;
import util.FormResult;
import util.MyResult;
import util.CourseInfoViewTurn;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
    private MajorinfoMapper majorinfoMapper;
    @Autowired
    private StudentcourseinfoMapper studentcourseinfoMapper;
    @Autowired
    private MyStudentCourseInfoMapper myStudentCourseInfoMapper;

    public MyResult addNewCourse(Courseinfo courseinfo) {
        MyResult myResult=null;
        Classinfo classinfo= classinfoMapper.selectByPrimaryKey(courseinfo.getClassnum());
        if(classinfo==null){
            myResult=new MyResult();
            myResult.setMsg("不存在该教室");
            myResult.setStatus(400);
            return  myResult;
        }
        if(courseinfo.getCoursenumlimit()==null){
            courseinfo.setCoursenumlimit(classinfo.getLimitnum());
        }
        if(courseinfo.getCoursenumlimit()>classinfo.getLimitnum()){
            myResult=new MyResult();
            myResult.setMsg("数量超过课室座位，错误");
            myResult.setStatus(400);
            return  myResult;
        }
      List<Courseinfo>list=
               myCourseMapper.checkCourseInfo(courseinfo.getCourseday(),courseinfo.getCoursedaytime(),courseinfo.getClassnum(),courseinfo.getTermtime(),courseinfo.getTermyear());

        if(list.size()>0&&list.get(0)!=null){
            myResult=new MyResult();
            myResult.setMsg("课程与其他课程冲突");
            myResult.setStatus(400);
            return  myResult;
        }
            courseinfo.setCoursenum(UUID.randomUUID().toString());
            courseinfo.setCreatetime(new Date());
            courseinfo.setUpdatetime(new Date());
            courseinfo.setCoursefree(courseinfo.getCoursenumlimit());
            courseinfoMapper.insert(courseinfo);
            myResult=new MyResult();
            myResult.setMsg("提交成功");
            myResult.setStatus(200);

        return  myResult;
    }

    public FormResult listAllCourseInfoTable(int page, int limit) {
        CourseinfoExample courseinfoExample=new CourseinfoExample();
        CourseinfoExample.Criteria criteria=courseinfoExample.createCriteria();
        PageHelper.startPage(page,limit);
        List<Courseinfo>list=courseinfoMapper.selectByExample(courseinfoExample);
        List<CourseInfoView>listView=new ArrayList<CourseInfoView>();
        PageInfo<Courseinfo> pageInfo = new PageInfo<Courseinfo>(list);
        for (int i = 0; i < list.size(); i++) {
            CourseInfoView courseInfoView=new CourseInfoView();
            BeanUtils.copyProperties(list.get(i),courseInfoView);
            //前端拦截不到数据，用这个方法处理一下日期和时段的显示
           CourseInfoViewTurn.changeDateView(courseInfoView);
            // 再次查询某些字段出来，这里设计的不好当初没有用自定义的mapper，暂时先这么解决
            changeCourinfoView(courseInfoView);
            listView.add(courseInfoView);
        }
        FormResult formResult=new FormResult();
        formResult.setCode(0);
        formResult.setCount(pageInfo.getTotal());
        formResult.setData(listView);
        formResult.setMsg("");
        return formResult;
    }


    public MyResult delCourseInfo(String[] nums) {
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
            myResult.setMsg("删除成功");
            myResult.setStatus(200);
            return myResult;
        }catch(Exception e){
            myResult.setStatus(400);
            myResult.setMsg("删除出错");
            return  myResult;
        }
    }

    public MyResult editCourseInfo(Courseinfo courseinfo) {
        MyResult myResult=null;
        Classinfo classinfo= classinfoMapper.selectByPrimaryKey(courseinfo.getClassnum());
        if(classinfo==null){
            myResult=new MyResult();
            myResult.setMsg("不存在该教室");
            myResult.setStatus(400);
            return  myResult;
        }
        if(courseinfo.getCoursenumlimit()==null){
            courseinfo.setCoursenumlimit(classinfo.getLimitnum());
        }
        if(courseinfo.getCoursenumlimit()>classinfo.getLimitnum()){
            myResult=new MyResult();
            myResult.setMsg("数量超过课室座位，错误");
            myResult.setStatus(400);
            return  myResult;
        }
        List<Courseinfo>list=
                myCourseMapper.checkCourseInfo(courseinfo.getCourseday(),courseinfo.getCoursedaytime(),courseinfo.getClassnum(),courseinfo.getTermtime(),courseinfo.getTermyear());

        if(list.size()>0&&list.get(0)!=null) {
            if(!list.get(0).getCoursenum().equals(courseinfo.getCoursenum())){
                myResult = new MyResult();
                myResult.setMsg("课程与其他课程冲突");
                myResult.setStatus(400);
                return myResult;
            }
        }
        courseinfo.setUpdatetime(new Date());
        courseinfoMapper.updateByPrimaryKey(courseinfo);
        myResult=new MyResult();
        myResult.setStatus(200);
        myResult.setMsg("修改成功");
        return myResult;
    }

    public FormResult selCourseInfoTable(int page, int limit,HttpSession session) {

//        检查课程是否被该学生选了
        List<CourseInfoViewShowStudent> list= myCourseMapper.showCourseinfoToStudent((page-1)*limit,limit);
//        先模拟学生已经登录
        StudentcourseinfoExample studentcourseinfoExample=new StudentcourseinfoExample();
        StudentcourseinfoExample.Criteria criteria=studentcourseinfoExample.createCriteria();
        StudentCourseInfoQueryVo studentCourseInfoQueryVo=new StudentCourseInfoQueryVo();
        Studentcourseinfo studentcourseinfo=new Studentcourseinfo();
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
        FormResult formResult=new FormResult();
        if(list!=null&&list.size()>0){
            for(CourseInfoViewShowStudent courseInfoView:list){
                CourseInfoViewTurn.changeDateView2(courseInfoView);
                studentcourseinfo.setCoursenum(courseInfoView.getCourseNum());
                studentcourseinfo.setStudentnum(activeRole.getUsernum());
                studentCourseInfoQueryVo.setStudentcourseinfo(studentcourseinfo);
                List<Studentcourseinfo>list2=myStudentCourseInfoMapper.checkIfSelCourse(studentCourseInfoQueryVo);
                if(list2.size()>0){
                    courseInfoView.setFlag("1");
                }else{
                    courseInfoView.setFlag("2");
                }
            }
            int total=myCourseMapper.showCourseinfoCount();
//        课程名 学分 课室 任课老师名字 剩余量 课程所属的系
            formResult.setCode(0);
            formResult.setCount((long) total);
            formResult.setData(list);
            formResult.setMsg("");
            return formResult;
        }
        formResult.setCode(0);
        formResult.setCount((long) 0);
        formResult.setData(null);
        formResult.setMsg("");
        return formResult;
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

    public FormResult searchCourseByCondition(CourseinfoQueryVo courseinfoQueryVo) {
        courseinfoQueryVo.getCourseInfoView().setPage((courseinfoQueryVo.getCourseInfoView().getPage()-1)*courseinfoQueryVo.getCourseInfoView().getLimit());
        List<CourseInfoView>list=myCourseMapper.selCourseByCondition(courseinfoQueryVo);
        for (CourseInfoView courseInfoView:list) {
            //前端拦截不到数据，用这个方法处理一下日期和时段的显示
            CourseInfoViewTurn.changeDateView(courseInfoView);
            //            再次查询某些字段出来，这里设计的不好当初没有用自定义的mapper，暂时先这么解决
            changeCourinfoView(courseInfoView);
        }
        FormResult formResult=new FormResult();
        if(list!=null&&list.size()>0){
            Integer total=myCourseMapper.CountSelCourseByCondition(courseinfoQueryVo);
            formResult.setCode(0);
            formResult.setCount((long) total);
            formResult.setData(list);
            formResult.setMsg("成功");
            return formResult;
        }
        formResult.setCode(0);
        formResult.setCount((long) 0);
        formResult.setData(null);
        formResult.setMsg("数据不存在或者出错");
        return formResult;
    }


    public boolean checkCourseExist(Courseinfo courseinfo) {
        Courseinfo courseinfo1=courseinfoMapper.selectByPrimaryKey(courseinfo.getCoursenum());
        if(courseinfo1!=null){
            return true;
        }
        return false;
    }

//    处理回显数据
    public void changeCourinfoView(CourseInfoView courseInfoView) {
        if((courseInfoView.getMajornum())!=null&&(courseInfoView.getMajornum())!=""){
            Majorinfo majorinfo= majorinfoMapper.selectByPrimaryKey(courseInfoView.getMajornum());
            if(majorinfo!=null){
                courseInfoView.setMajornum(majorinfo.getMajorname());
            }
        }
    }


}
