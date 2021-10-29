package com.sun.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TextController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","世界,你好!");
		mv.addObject("msg1","如果世界都这么简单就好!");
		mv.setViewName("text");
		return mv;
	}
}
