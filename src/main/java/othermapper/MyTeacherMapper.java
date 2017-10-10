package othermapper;

import po.Courseinfo;
import po.Rolepermission;
import po.Teacherinfo;
import poView.StudentInfoOfCourseView;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2314:43
 * @Description:
 * @Modified By:
 */
public interface MyTeacherMapper {
    public List<Rolepermission> selPermissionByTeacherNum(String TeacherNum);
    public List<Courseinfo> teacherCourseInfoTable(String teacherNum,int page,int limit);
    public Integer teacherCourseInfoTotal(String teacherNum);
    public List<StudentInfoOfCourseView> teacherCourseListStudentInfo(String courseNum,int page,int limit);
    public Integer teacherCourseListStudentInfoTotal(String courseNum);
    public void updateTeacherInfoForSelf(Teacherinfo teacherinfo);
}
