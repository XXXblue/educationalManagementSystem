package othermapper;

import QueryVo.StudentCourseInfoQueryVo;
import po.Courseinfo;
import po.Studentcourseinfo;
import po.Studentinfo;
import poView.StuCourseTableView;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2516:37
 * @Description:
 * @Modified By:
 */
public interface MyStudentCourseInfoMapper {
//    学生查看学生该课程是否已选
    public List<Studentcourseinfo> checkIfSelCourse(StudentCourseInfoQueryVo studentCourseInfoQueryVo);
//    学生退选该课程
    public void stuDelCourse(StudentCourseInfoQueryVo studentCourseInfoQueryVo);
//    学生课表展示
    public List<StuCourseTableView> showStuCourseInfoTable(String studentNum, String termYear, String termTime, String week);
}
