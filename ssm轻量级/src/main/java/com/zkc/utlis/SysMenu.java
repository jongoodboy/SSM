package com.zkc.utlis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangJH on 2017/9/22.
 * 系统菜单
 */
public class SysMenu {
    //初始化菜单
    public static List gitMenu(){
        List<Map> list = new ArrayList();
        Map<String,Object> meun = new HashMap();
        List menuList = new ArrayList();
        Map<String,Object> p1 = new HashMap();
        p1.put("name","质量监管");
        p1.put("url","index01.html");
        p1.put("icon","el-icon-menu");

        Map<String,Object> p2 = new HashMap();
        p1.put("name","行政执法");
        p1.put("url","index01.html");
        p1.put("icon","el-icon-setting");
        menuList.add(p1);
        menuList.add(p2);
        meun.put("levelMenu",menuList);

        meun.put("twoLevelMenu3",menuList);
        list.add(meun);
        return list;
    }
}
