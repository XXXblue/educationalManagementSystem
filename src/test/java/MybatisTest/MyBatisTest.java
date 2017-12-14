package MybatisTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import othermapper.*;
import pojoCustom.ClassinfoCustom;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)// 添加spring,mybatis测试方案
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")// 指定spring配置文件位置
public class MyBatisTest {
////
//    @Autowired
//   private MyCourseMapper myCourseMapper;
//
//    @Test
//    public void test() throws Exception {
//     List<Courseinfo> courseinfos=myCourseMapper.selTeacherTimetale("02","2017","1","5");
//     if(courseinfos.size()>0){
//         courseinfos.get(0).getCourseteachernum();
//     }
//    }
//    @Autowired
//    private MyManagerMapper myManagerMapper;
//    @Test
//    public void test()throws Exception{
//        List<Rolepermission> list=myManagerMapper.selPermissionByManagerNum("04150822");
//        if(list.size()>0){
//
//        }
//    }


//        @Autowired
//    private MyTeacherMapper myTeacherMapper;
//    @Test
//    public void test()throws Exception{
//        List<Rolepermission> list=myTeacherMapper.selPermissionByTeacherNum("02");
//        if(list.size()>0){
//
//        }
//    }
//    @Autowired
//    private MyStudentInfoMapper myStudentInfoMapper;
//    @Test
//    public void test()throws  Exception{
//        StudentInfoQueryVo studentInfoQueryVo=new StudentInfoQueryVo();
//        StudentInfoView studentInfoView=new StudentInfoView();
//        studentInfoView.setMajornum("04");
//        studentInfoView.setPage(0);
//        studentInfoView.setLimit(1);
//        studentInfoQueryVo.setStudentInfoView(studentInfoView);
//        List<StudentInfoView>list=myStudentInfoMapper.searchStudentInfoByCondition(studentInfoQueryVo);
//        Integer a=myStudentInfoMapper.searchStudentInfoCountByCondition(studentInfoQueryVo);
//        if(list.size()>0){
//
//        }
//    }

    @Autowired
    private MyStudentCourseInfoMapper myStudentCourseInfoMapper;
    @Autowired
    private MyStudentInfoMapper myStudentInfoMapper;
    @Autowired
    private MyCourseMapper myCourseMapper;
    @Autowired
    private MyTeacherMapper myTeacherMapper;
    @Autowired
    private MyStudentInfoMapper studentInfoMapper;
    @Autowired
    private ClassinfoCustomMapper kslxsjzdCustomMapper;
    @Test
    public void test(){
        List<ClassinfoCustom> list=kslxsjzdCustomMapper.queryClassinfo(2,2);
        int a=kslxsjzdCustomMapper.queryClassinfoNum();
        if(list!=null){

        }
//       List<StuCourseTableView> list=myStudentCourseInfoMapper.showStuCourseInfoTable("04150822","2017","1","5");
//       List<Rolepermission>list2=myStudentInfoMapper.selPermissionByStudentNum("04150822");
//       if(list.size()>0){
//
//       }
//       CourseinfoConflict courseinfoConflict= myCourseMapper.stuSelCourseCheckConflict("20161313");
//       if(courseinfoConflict!=null){
//
//       }
//        List<Courseinfo>list=myCourseMapper.checkStuAllSelCourse("04150822","1","1","2017","1");
//        List<Courseinfo>list2=myTeacherMapper.teacherCourseInfoTable("02",2,2);
//        int a=myTeacherMapper.teacherCourseInfoTotal("02");
//        List<StudentInfoOfCourseView> list3=myTeacherMapper.teacherCourseListStudentInfo("20161314",1,1);
//        Teacherinfo teacherinfo=new Teacherinfo();
//        teacherinfo.setTeachername("fds");
//        teacherinfo.setTeacherbirthday(new Date());
//        teacherinfo.setTeachernum("02");
//        teacherinfo.setTeacherphone("123");
//        teacherinfo.setTeacherpassword("");
//        myTeacherMapper.updateTeacherInfoForSelf(teacherinfo);
//        Studentinfo studentinfo=new Studentinfo();
//        studentinfo.setStudentnum("04150802");
//        studentinfo.setStudentname("上午");
//        studentinfo.setStudentbirthday(new Date());
//        studentinfo.setStudentphonenum("123456");
//        studentinfo.setStudentpassword("");
//        studentinfo.setStudentpic("");
//        myStudentInfoMapper.updateStudentInfoForSelf(studentinfo);
//        System.out.println(1);
    }

//    @Autowired
//    private MyCourseMapper myCourseMapper;
//    @Test
//    public void test()throws Exception{
//        CourseinfoQueryVo courseinfoQueryVo=new CourseinfoQueryVo();
//        CourseInfoView courseInfoView=new CourseInfoView();
//        courseInfoView.setIfopen("0");
//        courseInfoView.setMajornum("04");
//        courseInfoView.setTermyear("");
//        courseInfoView.setWeek(null);
//        courseInfoView.setTermtime("");
//        courseInfoView.setPage(0);
//        courseInfoView.setLimit(25);
//        courseinfoQueryVo.setCourseInfoView(courseInfoView);
//       Integer a=myCourseMapper.CountSelCourseByCondition(courseinfoQueryVo);
//       List<CourseInfoView>list=myCourseMapper.selCourseByCondition(courseinfoQueryVo);
//        if(list.size()>0){
//
//        }
//        System.out.println(a);
//    }

//    @Autowired
//    private MyStudentCourseInfoMapper studentCourseInfoMapper;
//    @Test
//        public void test()throws Exception{
//            StudentCourseInfoQueryVo studentCourseInfoQueryVo=new StudentCourseInfoQueryVo();
//            Studentcourseinfo studentcourseinfo=new Studentcourseinfo();
//            studentcourseinfo.setStudentnum(null);
//            studentcourseinfo.setCoursenum("47b71848-7fc7-4f03-b155-902097d5dbae");
//            studentCourseInfoQueryVo.setStudentcourseinfo(studentcourseinfo);
//        studentCourseInfoMapper.stuDelCourse(studentCourseInfoQueryVo);
//
//    }

}
