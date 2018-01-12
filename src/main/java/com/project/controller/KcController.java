package com.project.controller;

import QueryVo.KcQueryVo;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojoCustom.KcCustom;
import service.KcService;
import service.KxlxmcService;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/129:40
 * @Description:
 * @Modified By:
 */
@Controller
public class KcController {
    @Autowired
    private KcService kcService;
    @RequestMapping("/addNewKc")
    @ResponseBody
    public String addKc(KcQueryVo kcQueryVo)throws Exception{
        return JSON.toJSONString(kcService.addNewKc(kcQueryVo.getKcCustom()));
    }

    @RequestMapping("/kcTable")
    @ResponseBody
    public String queryKcinfo(int page,int limit)throws Exception{
        return JSON.toJSONString(kcService.queryKcinfo(page,limit));
    }

    @RequestMapping("/editKcInfo")
    @ResponseBody
    public String editKcInfo(KcQueryVo kcQueryVo)throws Exception{
        return JSON.toJSONString(kcService.editKcInfo(kcQueryVo.getKcCustom()));
    }

    @RequestMapping("/delKcInfo")
    @ResponseBody
    public String delKcInfo(String nums[])throws Exception{
        return JSON.toJSONString(kcService.delKcInfo(nums));
    }

    @RequestMapping("/listSelKc")
    @ResponseBody
    public String listSelCourse()throws Exception{
        return JSON.toJSONString(kcService.listSelCourse());
    }
}
