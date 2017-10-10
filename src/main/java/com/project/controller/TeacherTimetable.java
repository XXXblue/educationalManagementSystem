package com.project.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TeacherTimetableService;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2310:22
 * @Description:
 * @Modified By:
 */
@Controller
public class TeacherTimetable {
    @Autowired
    private TeacherTimetableService teacherTimetableService;
    @RequestMapping("/searchteachercourseinfo")
    @ResponseBody
    public String search(String termyear,String termtime,String week,HttpSession session){
        return JSON.toJSONString(teacherTimetableService.searchTeacherTimetable(termyear,termtime,week,session));
    }
}
