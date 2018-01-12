package com.project.controller;

import QueryVo.ClassQueryVo;
import com.alibaba.fastjson.JSON;
import exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Classinfo;
import pojoCustom.ClassinfoCustom;
import service.ClassService;
import util.MyResult;

import java.util.List;

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
    public String addClassInfo(ClassQueryVo classQueryVo)throws Exception{
        return JSON.toJSONString(classService.addNewClass(classQueryVo.getClassinfoCustom()));
    }

    @RequestMapping("/classInfoTable")
    @ResponseBody
    public String classInfoTable(int page,int limit)throws Exception{
        return  JSON.toJSONString(classService.listClassinfoTable(page,limit));
    }

    @RequestMapping("/editClassInfo")
    @ResponseBody
    public String classInfoEdit(ClassQueryVo classQueryVo)throws Exception{

        return JSON.toJSONString(classService.editClassInfo(classQueryVo.getClassinfoCustom()));
    }

    @RequestMapping("/delClassInfo")
    @ResponseBody
    public String classInfoDel(String[] nums)throws Exception
    {
        return JSON.toJSONString(classService.delClassInfo(nums));
    }

    @RequestMapping("/searchFreeClass")
    @ResponseBody
    public String searchFreeClass(String ct, String ty, String tt, String cd, String cdt,String th)throws Exception{
        return JSON.toJSONString(classService.searchFreeClass(ct,ty,tt,cd,cdt,th));
    }

}
