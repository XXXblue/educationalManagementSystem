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
    public String addNewCourse(CourseinfoQueryVo courseinfoQueryVo)throws Exception{
        return JSON.toJSONString(courseService.addNewCourse(courseinfoQueryVo.getCourseinfoCustom()));
    }

    @RequestMapping("/editCourseInfo")
    @ResponseBody
    public String editCourse(CourseinfoQueryVo courseinfoQueryVo) throws  Exception{

        return JSON.toJSONString(courseService.editCourseInfo(courseinfoQueryVo.getCourseinfoCustom()));
    }

    @RequestMapping("/courseInfoTable")
    @ResponseBody
    public String listCourseInfoTable(int page,int limit)throws Exception{
        return JSON.toJSONStringWithDateFormat(courseService.listAllCourseInfoTable(page,limit),"yyyy-MM-dd hh:mm:ss");
    }

    @RequestMapping("/delCourseInfo")
    @ResponseBody
    public String  delCourseInfo(String[] nums)throws Exception{
        return JSON.toJSONString(courseService.delCourseInfo(nums));
    }

    @RequestMapping("/stuselcourseInfoTable")
    @ResponseBody
    public String selCourseInfoTable(int page,int limit,HttpSession session)throws Exception{
        return JSON.toJSONString(courseService.selCourseInfoTable(page,limit,session));
    }

    @RequestMapping("/stuselcourseInfoTable2")
    @ResponseBody
    public String stuselcourseInfoTable2(int page,int limit,HttpSession session)throws Exception{
        return JSON.toJSONString(courseService.selCourseInfoTable2(page,limit,session));
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
    public String searchCourseByCondition(CourseinfoQueryVo courseinfoQueryVo,int page,int limit)throws Exception{
        courseinfoQueryVo.getCourseinfoCustom().setKcmc(new String(courseinfoQueryVo.getCourseinfoCustom().getKcmc().getBytes("ISO-8859-1"),"UTF-8"));
        return JSON.toJSONString(courseService.searchCourseByCondition(courseinfoQueryVo.getCourseinfoCustom(),page,limit));
    }

    @RequestMapping("/changeCourseStatus/{user}/{coursenum}")
    @ResponseBody
    public String changeCourseStatus(@PathVariable("user") String user,@PathVariable("coursenum") String coursenum){
        return JSON.toJSONString(courseService.changeCourseStatus(user,coursenum));
    }
}
