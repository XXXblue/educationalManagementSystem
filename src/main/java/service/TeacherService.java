package service;

import org.springframework.web.multipart.MultipartFile;
import po.Courseinfo;
import po.Teacherinfo;
import util.FormResult;
import util.MyResult;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1615:56
 * @Description:
 * @Modified By:
 */
public interface TeacherService {
//    管理员添加教师信息
    public MyResult addTeacherInfo(Teacherinfo teacherinfo);
//    管理员校验教师是否重复
    public boolean checkTeacherInfo(Teacherinfo teacherinfo);
//    管理员展示教师信息
    public FormResult listAllTeacherInfo(int page, int limit);
//    管理员更新教师信息
    public MyResult updateTeacherInfo(Teacherinfo teacherinfo);
//    管理员删除教师信息
    public MyResult delTeacherInfo(String[] nums);
//    教师登录
    public MyResult login(String username, String password, HttpSession session);
//    教师查看课程详情信息
    public FormResult teacherCourseInfoTable(int page,int limit,HttpSession httpSession);
//    教师查看选择本人课程的学生信息
    public FormResult courseStudentInfoTable(String courseNum,int page,int limit);
//    修改学生成绩
    public MyResult editStudentGrade(Integer grade,Integer stuCourseID);
//    教师查看教师个人信息
    public Teacherinfo teacherInfoShowForSelf(HttpSession session);
//    教师修改教师个人信息
    public MyResult editTeacherInfoForSelf(HttpSession session,Teacherinfo teacherinfo);
//    教师修改头像上传
    public MyResult uploadTeacherPic(MultipartFile uploadFile);
//  提交成绩
    public MyResult submitGrade(Courseinfo courseinfo);

    public List<Teacherinfo>queryteachernum() throws Exception;
}
