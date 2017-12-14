package com.project.controller;

import QueryVo.DeptQueryVo;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Deptinfo;
import service.DeptService;
import service.MajorService;
import util.MyResult;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/169:24
 * @Description:
 * @Modified By:
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/addDeptInfo")
    @ResponseBody
    public String addDeptInfo(DeptQueryVo deptQueryVo)throws Exception{
        return JSON.toJSONString(deptService.addDept(deptQueryVo.getDeptCustom()));
    }

    @RequestMapping("/deptInfoListAll")
    @ResponseBody
    public String listDeptInfo(int page,int limit)throws Exception{
        return JSON.toJSONString(deptService.ListAllDeptInfo(page,limit));
    }

    @RequestMapping(value="/editDeptInfo/{deptnum}",method= RequestMethod.GET)
    @ResponseBody
    public String deptinfowithblobs(@PathVariable("deptnum") String deptnum)throws Exception{
        return JSON.toJSONString(deptService.wihtblobsDeptInfo(deptnum));
    }

    @RequestMapping("/editDeptInfo")
    @ResponseBody
    public String deptEdit(DeptQueryVo deptQueryVo)throws Exception{
        return JSON.toJSONString(deptService.editdeptInfo(deptQueryVo.getDeptCustom()));
    }

    @RequestMapping("/delDeptInfo")
    @ResponseBody
    public String delDeptInfo(String[] nums)throws Exception{
        return JSON.toJSONString(deptService.delDeptInfo(nums));
    }


    @RequestMapping("/listDeptinfoselect")
    @ResponseBody
    public String listDeptinfoselect()throws Exception{
        return JSON.toJSONString(deptService.listDeptInfo());
    }
}
