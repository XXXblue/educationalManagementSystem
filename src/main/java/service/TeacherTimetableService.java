package service;

import util.MyResult;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2310:23
 * @Description:
 * @Modified By:
 */
public interface TeacherTimetableService {
//    教师展示教师课表
    public MyResult searchTeacherTimetable(String termYear, String termTime, String Week, HttpSession session);
}
