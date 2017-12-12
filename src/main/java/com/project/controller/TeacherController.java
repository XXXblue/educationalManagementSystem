package com.project.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import po.Courseinfo;
import po.Teacherinfo;
import service.TeacherService;
import service.TeacherTimetableService;
import util.MyResult;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1615:54
 * @Description:
 * @Modified By:
 */
@Controller
public class TeacherController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);
    @Autowired
    private TeacherTimetableService teacherTimetableService;
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/addteacherinfo")
    @ResponseBody
    public String addTeacherInfo(Teacherinfo teacherinfo){

        return JSON.toJSONString(teacherService.addTeacherInfo(teacherinfo));
    }

    @RequestMapping("/teacherInfoTable")
    @ResponseBody
    public String teacherInfoTable(int page,int limit){
        return JSON.toJSONStringWithDateFormat(teacherService.listAllTeacherInfo(page,limit),"yyyy-MM-dd");
    }

    @RequestMapping("/editTeacherInfo")
    @ResponseBody
    public String editTeacaherInfo(Teacherinfo teacherinfo){
        return JSON.toJSONString(teacherService.updateTeacherInfo(teacherinfo));
    }

    @RequestMapping("/delTeacherInfo")
    @ResponseBody
    public String delTeacherInfo(String[] nums){
        return JSON.toJSONString(teacherService.delTeacherInfo(nums));
    }

    @RequestMapping("/teacherCourseInfoTable")
    @ResponseBody
    public String teacherCourseInfoTable(int page, int limit, HttpSession session){
        return JSON.toJSONString(teacherService.teacherCourseInfoTable(page,limit,session));
    }

    @RequestMapping(value="/detail/{courseNum}")
    public String teacherCourseListStudent(@PathVariable("courseNum") String courseNum,Model model){
        model.addAttribute("courseNum",courseNum);
        return "detailCourseStudent";
    }

    @RequestMapping("/courseStudentInfoTable")
    @ResponseBody
    public String courseStudentInfoTable(String courseNum,int page,int limit){
        return JSON.toJSONString(teacherService.courseStudentInfoTable(courseNum,page,limit));
    }

    @RequestMapping("/editStudentGrade")
    @ResponseBody
    public String editStudentGrade(Integer grade,Integer stuCourseID){
        return JSON.toJSONString(teacherService.editStudentGrade(grade,stuCourseID));
    }

    @RequestMapping("/teacher/teacherinfoshow")
    public String teacherinfoshow(HttpSession session,Model model){
        Teacherinfo teacherinfo=teacherService.teacherInfoShowForSelf(session);
        model.addAttribute("teacherinfo",teacherinfo);
        return "teacher/teacherinfoshow";
    }

    @RequestMapping("/editTeacherInfoForSelf")
    @ResponseBody
    public String editTeacherInfoForSelf(Teacherinfo teacherinfo,HttpSession session){
        return JSON.toJSONString(teacherService.editTeacherInfoForSelf(session,teacherinfo));
    }


    @RequestMapping("/uploadTeacherPic")
    @ResponseBody
    public String uploadTeacherPic(MultipartFile uploadFile){
        return JSON.toJSONString(teacherService.uploadTeacherPic(uploadFile));
    }

    @RequestMapping("/submitGrade")
    @ResponseBody
    public String submitGrade(@RequestBody Courseinfo courseinfo){
        return JSON.toJSONString(teacherService.submitGrade(courseinfo));
    }

    @RequestMapping("/searchteachercourseinfo")
    @ResponseBody
    public String search(String termyear,String termtime,String week,HttpSession session){
        return JSON.toJSONString(teacherTimetableService.searchTeacherTimetable(termyear,termtime,week,session));
    }
}
