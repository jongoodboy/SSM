package com.zkc.utlis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by wangJH on 2017/9/21.
 */
public class PropertiesUtil {
    public static String getProperties(String key) throws IOException {
       /* String classpath = Thread.currentThread().getContextClassLoader().getResource("/").getPath();
        String fileName = classpath + "config.properties";
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream(fileName);
        pro.load(fis);*/
        Properties pps = new Properties();
        InputStream fis =PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties");
        pps.load(fis);
        return pps.getProperty(key);
    }
}
