package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class TextController02 {
	@RequestMapping("/02")
	public String text(ModelMap model){
		//用hashmap储存数据
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("msg1","1");
		hashMap.put("msg2","2");
		model.addAllAttributes(hashMap);
		model.addAttribute("msg","世界");
		return "text02";
	}
}