package com.project.controller;

import QueryVo.StudentInfoQueryVo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.ValueFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import po.Studentinfo;
import poView.StudentInfoView;
import service.StudentService;
import util.FormResult;
import util.MyResult;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1316:21
 * @Description:
 * @Modified By:
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addstudentinfo")
   @ResponseBody
    public String addStudentInfo(Studentinfo studentinfo){

        return JSON.toJSONString(studentService.addStudentInfo(studentinfo));
    }

    @RequestMapping("/studentInfoListAll")
    @ResponseBody
    public String studentListAll(int page,int limit){
        return  JSON.toJSONStringWithDateFormat(studentService.listAllStudentInfo(page,limit),"yyyy-MM-dd");
    }

    @RequestMapping("/editstudentinfo")
    @ResponseBody
    public String studentEdit(Studentinfo studentinfo){
        return JSON.toJSONString(studentService.updateStudentInfo(studentinfo));
    }

    @RequestMapping("/delStudentInfo")
    @ResponseBody
    public  String studentDel(String[] nums){
        return JSON.toJSONString(studentService.delStudentInfo(nums));
    }

    @RequestMapping("/searchStudentInfoByCondition")
    @ResponseBody
    public String searchStudentInfoByCondition(StudentInfoView studentinfo){
        StudentInfoQueryVo studentInfoQueryVo=new StudentInfoQueryVo();
        studentInfoQueryVo.setStudentInfoView(studentinfo);
        return  JSON.toJSONStringWithDateFormat(studentService.searchStudentInfoByCondition(studentInfoQueryVo),"yyyy-MM-dd");
    }

    @RequestMapping("/searchstudentcourseinfo")
    @ResponseBody
    public String searchstudentcourseinfo(String termyear,String termtime,String week,HttpSession session){
        return JSON.toJSONString(studentService.searchstudentcourseinfo(termyear,termtime,week,session));
    }

    @RequestMapping("/student/studentSelfInfo")
    public String studentSelfInfo(HttpSession session, Model model) {
        /**
         * @Author: xiaojianyu
         * @Method: showPage
         * @Description: 页面跳转
         * @Date: 0:01 2017/8/1
         * @Return: java.lang.String
         * @Param: [page]
         */
        Studentinfo studentinfo=studentService.studentSelfInfo(session);
        model.addAttribute("studentinfo",studentinfo);
        return "/student/studentSelfInfo";
    }

    @RequestMapping("/editStudentInfoForSelf")
    @ResponseBody
    public String editStudentInfoForSelf(Studentinfo studentinfo,HttpSession session){
        return JSON.toJSONString(studentService.editStudentInfoForSelf(studentinfo,session));
    }

    @RequestMapping("/uploadStudentPic")
    @ResponseBody
    public String uploadStudentPic(MultipartFile uploadFile){
        return JSON.toJSONString(studentService.uploadStudentPic(uploadFile));
    }
}
