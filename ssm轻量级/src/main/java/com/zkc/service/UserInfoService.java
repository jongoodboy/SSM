package com.zkc.service;

import com.zkc.dao.TestDao;
import com.zkc.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangJH on 2017/9/21.
 */
@Service
public class UserInfoService {
    @Resource
    private TestDao dao;

    public Object userInfo(){
        Map<String,Object> user = new HashMap();
        user.put("name","张三");
        user.put("sex","男");
        user.put("age","20");
        User u = new User();
        try {
             u = dao.findUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
}
