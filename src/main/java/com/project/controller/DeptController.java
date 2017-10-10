package com.project.controller;

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
    public String addDeptInfo(Deptinfo deptinfo){

        return JSON.toJSONString(deptService.addDept(deptinfo));
    }

    @RequestMapping("/deptInfoListAll")
    @ResponseBody
    public String listDeptInfo(int page,int limit){
        return JSON.toJSONString(deptService.ListAllDeptInfo(page,limit));
    }

    @RequestMapping(value="/editDeptInfo/{deptnum}",method= RequestMethod.GET)
    @ResponseBody
    public String deptinfowithblobs(@PathVariable("deptnum") String deptnum){

        return JSON.toJSONString(deptService.wihtblobsDeptInfo(deptnum));
    }

    @RequestMapping("/editDeptInfo")
    @ResponseBody
    public String deptEdit(Deptinfo deptinfo){
        /**
         * @Author: xiaojianyu
         * @Method: deptEdit
         * @Description: 更新信息
         * @Date: 13:44 2017/9/16
         * @Return: java.lang.String
         * @Param: [deptinfo]
         */

        return JSON.toJSONString(deptService.editdeptInfo(deptinfo));
    }

    @RequestMapping("/delDeptInfo")
    @ResponseBody
    public String delDeptInfo(String[] nums){
        return JSON.toJSONString(deptService.delDeptInfo(nums));
    }

    @RequestMapping("/listDeptinfoselect")
    @ResponseBody
    public String listDeptinfoselect(){

        return JSON.toJSONString(deptService.listDeptInfo());
    }
}
