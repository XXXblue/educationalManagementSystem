package othermapper;

import org.apache.ibatis.annotations.Param;
import poView.StuCourseTableView;
import pojoCustom.CourseinfoCustom;

import java.util.List;
import java.util.Map;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1714:20
 * @Description:
 * @Modified By:
 */
public interface CourseinfoCustomMapper {
    public List<CourseinfoCustom> queryCourseinfo(int page,int limit);
    public Integer queryCourseinfoNum();
    public List<CourseinfoCustom> searchByCondition(Map map);
    public Integer searchByConditionNum(Map map);
    public List<CourseinfoCustom> courseSelTableToStudent(String stuId);
    public List<CourseinfoCustom> selCourseinfoTable(Map map);
    public Integer selCourseinfoTableNum(Map map);
    public List<CourseinfoCustom> selCourseinfoTable2(Map map);
    public Integer selCourseinfoTableNum2(Map map);
    public List<CourseinfoCustom> showStuCourseInfoTable(String studentNum, String termYear, String termTime,Integer week);
}
