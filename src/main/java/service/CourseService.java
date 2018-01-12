package service;

import QueryVo.CourseinfoQueryVo;
import po.Courseinfo;
import pojoCustom.CourseinfoCustom;
import util.FormResult;
import util.MyResult;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1710:58
 * @Description:
 * @Modified By:
 */
public interface CourseService {
//    管理员添加新课程
    public MyResult addNewCourse(Courseinfo courseinfo) throws Exception;
//    管理员展示已有课程信息
    public FormResult listAllCourseInfoTable(int page,int limit)throws Exception;
//    管理员删除已有课程
    public MyResult delCourseInfo(String[] nums)throws Exception;
//    管理员修改已有课程
    public MyResult editCourseInfo(Courseinfo courseinfo) throws  Exception;
    //学生显示可选课程
    public FormResult selCourseInfoTable(int page,int limit,HttpSession session)throws Exception;
    //学生显示可选课程
    public FormResult selCourseInfoTable2(int page,int limit,HttpSession session)throws Exception;
    //学生选择课程
    public MyResult stuAddNewCourse(String courseNum, HttpSession session);
    //学生退选课程
    public MyResult stuRemoveCourse(String courseNum,HttpSession session);
    //管理员精准查询课程
    public FormResult searchCourseByCondition(CourseinfoCustom courseinfoCustom, int page , int limit)throws Exception;
    //管理员校验课程
    public MyResult changeCourseStatus(String user,String coursenum);
}
