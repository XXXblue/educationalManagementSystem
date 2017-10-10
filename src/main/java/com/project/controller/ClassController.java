package com.project.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Classinfo;
import service.ClassService;
import util.MyResult;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1618:22
 * @Description:
 * @Modified By:
 */
@Controller
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping("/addClassInfo")
    @ResponseBody
    public String addClassInfo(Classinfo classinfo){
        return JSON.toJSONString(classService.addNewClass(classinfo));
    }

    @RequestMapping("/classInfoTable")
    @ResponseBody
    public String classInfoTable(int page,int limit){

        return  JSON.toJSONString(classService.listClassinfoTable(page,limit));
    }

    @RequestMapping("/editClassInfo")
    @ResponseBody
    public String classInfoEdit(Classinfo classinfo){

        return JSON.toJSONString(classService.editClassInfo(classinfo));
    }

    @RequestMapping("/delClassInfo")
    @ResponseBody
    public String classInfoDel(String[] nums)
    {
        return JSON.toJSONString(classService.delClassInfo(nums));
    }

}
