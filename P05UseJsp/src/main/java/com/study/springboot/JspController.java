package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "JSP";
	}
	
	@RequestMapping("/test1")
	public String test1() {
		return "test";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		return "sub/test1";
	}
}
