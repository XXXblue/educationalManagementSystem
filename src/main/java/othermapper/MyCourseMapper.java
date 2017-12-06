package othermapper;

import QueryVo.CourseinfoQueryVo;
import po.Classinfo;
import po.Courseinfo;
import po.Deptinfo;
import po.Studentcourseinfo;
import poView.CourseInfoView;
import poView.CourseInfoViewShowStudent;
import poView.CourseinfoConflict;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1711:12
 * @Description:
 * @Modified By:
 */
public interface MyCourseMapper {
    public List<Courseinfo> checkCourseInfo(Integer courseDay,Integer courseDayTime,String classNum,String TermTime ,String TermYear );
    public List<Courseinfo> selTeacherTimetale(String teachernum,String termyear,String termtime,String week);
    public List<CourseInfoViewShowStudent> showCourseinfoToStudent(int page,int limit);
    public Integer showCourseinfoCount();
    public Courseinfo selcetByPrimaryKey(String key);
    public List<CourseInfoView> selCourseByCondition(CourseinfoQueryVo courseinfoQueryVo);
    public Integer CountSelCourseByCondition(CourseinfoQueryVo courseinfoQueryVo);
    public CourseinfoConflict stuSelCourseCheckConflict(String courseNum);
    public List<Courseinfo> checkStuAllSelCourse(String stuNum,String courseDay,String CourseDayTime,String TermTime,String TermYear);
    public List<Deptinfo> selectByName(Deptinfo deptinfo);
}
