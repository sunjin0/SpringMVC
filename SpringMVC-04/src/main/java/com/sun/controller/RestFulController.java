package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RestFulController {
//	@RequestMapping("/commit/{p1}/{p2},method = {RequestMethod.POST}")
	@GetMapping("/commit/{p1}/{p2}")//上面的代码等于这句代码
	public String Rest( Model model, @PathVariable int p1, @PathVariable int p2){
		int result = p1+p2;
		model.addAttribute("msg2","结果"+result);
		return "text";
	}
}
