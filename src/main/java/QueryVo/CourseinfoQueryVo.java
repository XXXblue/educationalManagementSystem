package QueryVo;

import po.Courseinfo;
import poView.CourseInfoView;
import pojoCustom.CourseinfoCustom;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2610:45
 * @Description:
 * @Modified By:
 */
public class CourseinfoQueryVo {
   private CourseInfoView courseInfoView;
   private CourseinfoCustom courseinfoCustom;

    public CourseinfoCustom getCourseinfoCustom() {
        return courseinfoCustom;
    }

    public void setCourseinfoCustom(CourseinfoCustom courseinfoCustom) {
        this.courseinfoCustom = courseinfoCustom;
    }

    public CourseInfoView getCourseInfoView() {
        return courseInfoView;
    }

    public void setCourseInfoView(CourseInfoView courseInfoView) {
        this.courseInfoView = courseInfoView;
    }
}
