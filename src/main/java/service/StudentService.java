package service;

import QueryVo.StudentInfoQueryVo;
import org.springframework.web.multipart.MultipartFile;
import po.Studentinfo;
import util.FormResult;
import util.MyResult;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1316:42
 * @Description:
 * @Modified By:
 */
public interface StudentService {
//    管理员新增学生信息
    public MyResult addStudentInfo(Studentinfo studentinfo);
//    管理员校验学生是否已经存在
    public boolean checkedStudentInfo(String studentinfonum);
//    管理员展示学生信息
    public FormResult listAllStudentInfo(int page,int limit);
//    管理员更新学生信息
    public MyResult updateStudentInfo(Studentinfo studentinfo);
//    管理员删除学生信息
    public MyResult delStudentInfo(String[] nums);
//    管理员查询学生信息
    public FormResult searchStudentInfoByCondition(StudentInfoQueryVo studentInfoQueryVo);
//    学生查询自己课表
    public MyResult searchstudentcourseinfo(String termyear,String termtime,String week,HttpSession session);
//    学生登录
    public MyResult login(String username,String password,HttpSession session);
//    学生查看个人信息
    public Studentinfo studentSelfInfo(HttpSession session);
//    学生修改学生个人信息
    public MyResult editStudentInfoForSelf(Studentinfo studentinfo,HttpSession session);
//    上传学生个人头像
    public MyResult uploadStudentPic(MultipartFile multipartFile);
}
