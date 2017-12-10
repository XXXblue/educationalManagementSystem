package com.project.controller;

import QueryVo.CourseinfoQueryVo;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import po.Courseinfo;
import poView.CourseInfoView;
import service.CourseService;
import util.MyResult;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1710:55
 * @Description:
 * @Modified By:
 */
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/addCourseInfo")
    @ResponseBody
    public String addNewCourse(Courseinfo courseinfo){

        return JSON.toJSONString(courseService.addNewCourse(courseinfo));
    }

    @RequestMapping("/editCourseInfo")
    @ResponseBody
    public String editCourse(Courseinfo courseinfo){

        return JSON.toJSONString(courseService.editCourseInfo(courseinfo));
    }

    @RequestMapping("/courseInfoTable")
    @ResponseBody
    public String listCourseInfoTable(int page,int limit){
        return JSON.toJSONStringWithDateFormat(courseService.listAllCourseInfoTable(page,limit),"yyyy-MM-dd hh:mm:ss");
    }

    @RequestMapping("/delCourseInfo")
    @ResponseBody
    public String  delCourseInfo(String[] nums){
        return JSON.toJSONString(courseService.delCourseInfo(nums));
    }

    @RequestMapping("/stuselcourseInfoTable")
    @ResponseBody
    public String selCourseInfoTable(int page,int limit,HttpSession session){
        return JSON.toJSONString(courseService.selCourseInfoTable(page,limit,session));
    }

    @RequestMapping(value="/stuselcourse/{courseNum}",method= RequestMethod.GET)
    @ResponseBody
    public String stuAddNewCourse(@PathVariable("courseNum") String courseNum, HttpSession session){
        return JSON.toJSONString(courseService.stuAddNewCourse(courseNum,session));
    }

    @RequestMapping(value="/sturemovecourse/{courseNum}",method= RequestMethod.GET)
    @ResponseBody
    public String stuRemoveCourse(@PathVariable("courseNum") String courseNum,HttpSession session){
        return JSON.toJSONString(courseService.stuRemoveCourse(courseNum,session));
    }

    @RequestMapping("/searchCourseByCondition")
    @ResponseBody
    public String searchCourseByCondition(CourseInfoView courseInfoView){
        CourseinfoQueryVo courseinfoQueryVo=new CourseinfoQueryVo();
        courseinfoQueryVo.setCourseInfoView(courseInfoView);
        return JSON.toJSONStringWithDateFormat(courseService.searchCourseByCondition(courseinfoQueryVo),"yyyy-MM-dd hh:mm:ss");
    }

    @RequestMapping("/changeCourseStatus/{user}/{coursenum}")
    @ResponseBody
    public String changeCourseStatus(@PathVariable("user") String user,@PathVariable("coursenum") String coursenum){
        return JSON.toJSONString(courseService.changeCourseStatus(user,coursenum));
    }
}
