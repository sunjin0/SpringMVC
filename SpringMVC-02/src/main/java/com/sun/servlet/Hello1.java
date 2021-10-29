package com.sun.servlet;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello1 implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
//		封装对象
		mv.addObject("msg","HelloMVC");
//		封装要跳转的视图
		mv.setViewName("hello1");
		return mv;
	}
}
