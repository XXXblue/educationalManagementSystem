package com.project.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: Xblue
 * @Description: 页面跳转
 * @Date: 0:00 2017/8/1
 */
@Controller
public class PageController {


    //页面时通过ajax静态加载其他页面的 不是通过修改url的 所以要定义一下页面跳转
    //其他的controller都是页面利用ajax异步请求的，而这里的页面跳转是点击到某个页面
    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page") String page) {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return page;
    }

    @RequestMapping("/teacher/index2")
    public String showTeacherIndex() {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return "/teacher/index2";
    }

    @RequestMapping("/teacher/schooltimetable")
    public String showTeacherSchoolTimeTable() {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return "/teacher/schooltimetable";
    }

    @RequestMapping("/teacher/studentselcourseshow")
    public String studentselcourseshow() {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return "/teacher/studentselcourseshow";
    }

    @RequestMapping("/teacher/main")
    public String showTeacherMain() {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return "main";
    }

    @RequestMapping("/student/index3")
    public String showStudentIndex() {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return "/student/index3";
    }

    @RequestMapping("/student/studentschooltimetable")
    public String showStudentSchoolTimeTable() {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return "/student/studentschooltimetable";
    }

    @RequestMapping("/student/studentSelCourse")
    public String studentSelCourse() {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        return "/student/studentSelCourse";
    }

    @RequestMapping("/teacher/login")
    public String teacherLogin(){
        return "login";
    }

    @RequestMapping("/student/login")
    public String studentLogin(){
        return "login";
    }

//    @RequestMapping("/teacher/main")
//    public String teacherMain(){
//        return "main";
//    }
//
    @RequestMapping("/student/main")
    public String studentMain(){
        return "main";
    }


}