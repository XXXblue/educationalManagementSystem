package util;

import mapper.MajorinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import po.Majorinfo;
import poView.CourseInfoView;
import poView.CourseInfoViewShowStudent;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/279:09
 * @Description:
 * @Modified By:
 */
public class CourseInfoViewTurn {
    public  static void changeDateView(CourseInfoView courseInfoView) {
        switch (Integer.parseInt(courseInfoView.getCourseday())){
            case 1:
                courseInfoView.setScourseDay("星期一");
                break;
            case 2:
                courseInfoView.setScourseDay("星期二");
                break;
            case 3:
                courseInfoView.setScourseDay("星期三");
                break;
            case 4:
                courseInfoView.setScourseDay("星期四");
                break;
            case 5:
                courseInfoView.setScourseDay("星期五");
                break;
            case 6:
                courseInfoView.setScourseDay("星期六");
                break;
            case 7:
                courseInfoView.setScourseDay("星期日");
                break;
        }
        switch (Integer.parseInt(courseInfoView.getCoursedaytime())){
            case 1:
                courseInfoView.setScourseDayTime("上午第一节课");
                break;
            case 2:
                courseInfoView.setScourseDayTime("上午第二节课");
                break;
            case 3:
                courseInfoView.setScourseDayTime("下午第一节课");
                break;
            case 4:
                courseInfoView.setScourseDayTime("下午第二节课");
                break;
            case 5:
                courseInfoView.setScourseDayTime("晚上第一节课");
                break;
        }
        if(courseInfoView.getIfopen()!=null){

            if(courseInfoView.getIfopen().equals("1")){
                courseInfoView.setIfopen("是");
            }else {
                courseInfoView.setIfopen("否");
            }
        }

    }

    public  static void changeDateView2(CourseInfoViewShowStudent courseInfoViewShowStudent) {
        switch (courseInfoViewShowStudent.getCourseDay()){
            case 1:
               courseInfoViewShowStudent.setsCourseDay("星期一");
                break;
            case 2:
                courseInfoViewShowStudent.setsCourseDay("星期二");
                break;
            case 3:
                courseInfoViewShowStudent.setsCourseDay("星期三");
                break;
            case 4:
                courseInfoViewShowStudent.setsCourseDay("星期四");
                break;
            case 5:
                courseInfoViewShowStudent.setsCourseDay("星期五");
                break;
            case 6:
                courseInfoViewShowStudent.setsCourseDay("星期六");
                break;
            case 7:
                courseInfoViewShowStudent.setsCourseDay("星期日");
                break;
        }
        switch (courseInfoViewShowStudent.getCourseDayTime()){
            case 1:
                courseInfoViewShowStudent.setsCourseDayTime("上午第一节课");
                break;
            case 2:
                courseInfoViewShowStudent.setsCourseDayTime("上午第二节课");
                break;
            case 3:
                courseInfoViewShowStudent.setsCourseDayTime("下午第一节课");
                break;
            case 4:
                courseInfoViewShowStudent.setsCourseDayTime("下午第二节课");
                break;
            case 5:
                courseInfoViewShowStudent.setsCourseDayTime("晚上第二节课");
                break;
        }
    }


}
