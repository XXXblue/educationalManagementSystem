package com.project.controller;

import com.alibaba.fastjson.JSON;
import mapper.TeacherinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ManagerService;
import service.StudentService;
import service.TeacherService;
import util.MyResult;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2016:27
 * @Description:
 * @Modified By:
 */
@Controller
public class LoginController {
    @Autowired
    private ManagerService managerService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/loginsubmit")
    @ResponseBody
    public String loginsubmit(String username, String password, HttpSession session){
        return JSON.toJSONString(managerService.login(username,password,session));
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(HttpSession session){
        return JSON.toJSONString(managerService.logout(session));
    }

    @RequestMapping("/loginteachersubmit")
    @ResponseBody
    public String loginteachersubmit(String username, String password, HttpSession session){
        return JSON.toJSONString(teacherService.login(username,password,session));
    }

    @RequestMapping("/loginstudentsubmit")
    @ResponseBody
    public String loginstudentsubmit(String username, String password, HttpSession session){
        return JSON.toJSONString(studentService.login(username,password,session));
    }
}
