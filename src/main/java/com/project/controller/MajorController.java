package com.project.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Majorinfo;
import service.MajorService;
import util.MyResult;

import java.util.List;
import java.util.Map;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1010:39
 * @Description:
 * @Modified By:
 */
@Controller
public class MajorController {
    @Autowired
    private MajorService majorService;
    @RequestMapping("/addMajorInfo")
    @ResponseBody
    public String addMajorInfo(Majorinfo majorinfo){
        /**
         * @Author: xiaojianyu
         * @Method: addMajorInfo
         * @Description: 新增专业
         * @Date: 10:41 2017/9/10
         * @Return: java.lang.String
         * @Param: []
         */

        return JSON.toJSONString(majorService.addMajor(majorinfo));
    }

    @RequestMapping("/majorInfoListAll")
    @ResponseBody
    public String majorInfoListAll(int page,int limit){
        /**
         * @Author: xiaojianyu
         * @Method: majorInfoListAll
         * @Description:   展示专业
         * @Date: 13:45 2017/9/13
         * @Return: java.lang.String
         * @Param: [page, limit]
         */
        return JSON.toJSONString(majorService.listAllMajor(page,limit));
    }

    @RequestMapping("/editMajorInfo")
    @ResponseBody
    public String editMajorInfo(Majorinfo majorinfo){
        /**
         * @Author: xiaojianyu
         * @Method: editMajorInfo
         * @Description:  编辑专业
         * @Date: 13:46 2017/9/13
         * @Return: java.lang.String
         * @Param: [majorinfo, premajornum]
         */

        return JSON.toJSONString(majorService.editMajor(majorinfo));
    }


    @RequestMapping("/delMajorInfo")
    @ResponseBody
    public String delMajorInfo(String[] nums){
        /**
         * @Author: xiaojianyu
         * @Method: delMajorInfo
         * @Description: 删除专业
         * @Date: 13:47 2017/9/13
         * @Return: java.lang.String
         * @Param: [nums]
         */
        return JSON.toJSONString(majorService.delMajor(nums));
    }

    @RequestMapping("/listmajorinfoselect")
    @ResponseBody
    public  String listMajorInfoSelect(){
        return JSON.toJSONString(majorService.selMajorInfo());
    }
}
