package com.zkc.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.zkc.utlis.PropertiesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class SimpleController {
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public String helloWorld(@RequestParam(value="user",required=false, defaultValue="World") String userName) {
		return "Hello " + userName + " !";
	}
	
	@RequestMapping(value = "helloMap", method = RequestMethod.GET)
	public String helloMap(@RequestParam(value="user",required=false, defaultValue="World") String userName) throws IOException {
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("hello", userName);
		String t = PropertiesUtil.getProperties("web.view.prefix");//取配置文件
		return "index";
	}

}
