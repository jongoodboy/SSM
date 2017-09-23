package com.zkc.controller;

import com.zkc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangJH on 2017/9/21.
 */
@Controller
@RequestMapping("/user")
public class UserInfoController{

    @Autowired
    private UserInfoService userService;

    @RequestMapping("userInfo")
    @ResponseBody
    public Map<String,Object> userInfo(){
        Map<String,Object> resultMap = new HashMap();
        try {
            resultMap.put("code","200");
            resultMap.put("msg","查询数据成功");
            Object m = userService.userInfo();
            resultMap.put("data",m);
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("code","500");
            resultMap.put("msg","查询数据异常:" + e);
        }
        return  resultMap;

    }
}
