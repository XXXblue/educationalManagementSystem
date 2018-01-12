package com.project.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.KxlxmcService;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1318:12
 * @Description:
 * @Modified By:
 */
@Controller
public class KxlxmcController {
    @Autowired
    private KxlxmcService kxlxmcService;
    @RequestMapping("/querykslxsjzd")
    @ResponseBody
    public String querykslxsjzd(){
        return JSON.toJSONString(kxlxmcService.ajaxSelQuery());
    }
}
