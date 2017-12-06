package com.project.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Applygrade;
import service.ApplyGradeServcie;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/618:15
 * @Description:
 * @Modified By:
 */
@Controller
public class ApplyGradeController {
    @Autowired
    private ApplyGradeServcie applyGradeServcie;
    @RequestMapping("/applygradeTable")
    @ResponseBody
    public String applygradeTable(int page,int limit){
        return JSON.toJSONString(applyGradeServcie.applygradeTable(page,limit));
    }

    @RequestMapping("ifAgreeSubmitGrade/{ifagree}")
    @ResponseBody
    public String ifAgreeSubmitGrade(@PathVariable("ifagree") String ifagree, @RequestBody Applygrade applygrade){
        return JSON.toJSONString(applyGradeServcie.ifAgreeSubmitGrade(ifagree,applygrade));
     }
}
