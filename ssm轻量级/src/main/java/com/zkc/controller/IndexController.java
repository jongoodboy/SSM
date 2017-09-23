package com.zkc.controller;

import com.zkc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangJH on 2017/9/21.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
   private UserInfoService service;
    /**
     * 登录页面
     */
    @RequestMapping("")
    public String login(){
       /* service.userInfo();*/
        return "login";
    }
    /**
     * 首页
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 登录
     * @param userNum 账号
     * @param password 密码
     * @return
     */
    @RequestMapping("login")
    @ResponseBody
    public Map<String,Object> login(String userNum,String password){
        Map<String,Object> resultMap = new HashMap();
        try {
            if(1 > 0){
                resultMap.put("code","200");
                resultMap.put("msg","登录成功");
            }else{
                resultMap.put("code","201");
                resultMap.put("msg","登录失败,用户或密码错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("code","500");
            resultMap.put("msg","查询数据异常:" + e);
        }
//        return JSON.parseObject(String.valueOf(resultMap));
        return resultMap;
    }

}
