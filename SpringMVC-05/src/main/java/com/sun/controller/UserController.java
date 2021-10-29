package com.sun.controller;

import com.sun.pojo.User;
import com.sun.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {
	private final UserService userService;
	
	public UserController(@Qualifier("userServiceImpl")UserService userService) {
		this.userService=userService;
	}
	//管理员登入
	@RequestMapping(value = "/select01",method = RequestMethod.POST)
	//@RequestParam(value = "name")获取前端的数据,这个name要更前端标签的name一致
	public String select01(@RequestParam(value = "name") String name, @RequestParam(value = "pwd") String pwd, HashMap<String,Object> hashMap, Model model){
		hashMap.put("name",name);
		hashMap.put("pwd",pwd);
		User user = userService.queryAdmits(hashMap);
		if (user!=null) {
			return "redirect:/book/allBook";
		}else{
			model.addAttribute("msg","密码或者账号错误");
			return "index2";
		}
	}
	//用户管理
	@RequestMapping("/selectAllUser")
	public String selectAllUser(Model model){
		List<User> users = userService.queryAllUser();
		model.addAttribute("users",users);
		return "UserAdmin";
	}
	//用户登入
	@RequestMapping(value = "/select",method = RequestMethod.POST)
	//@RequestParam(value = "name")获取前端的数据,这个name要更前端标签的name一致
	public String select(@RequestParam(value = "name") String name, @RequestParam(value = "pwd") String pwd, HashMap<String,Object> hashMap, Model model){
		hashMap.put("name",name);
		hashMap.put("pwd",pwd);
		User user = userService.queryUser(hashMap);
		if (user!=null) {
			return "redirect:/book/allBook2";
		}else{
			model.addAttribute("msg","密码或者账号错误");
			return "index2";
		}
	}
	//用户注册
	@RequestMapping("/insert")
	public String insert(@RequestParam(value = "name") String name, @RequestParam(value = "pwd") String pwd,Model model){
		int i = userService.addUser(new User(name, pwd));
		if (i>0) {
			model.addAttribute("msg","注册成功");
			return "index2";
		}else {
			model.addAttribute("msg","注册失败,请重试");
			return "login";}
	}
	//用户注册页面
	@RequestMapping("/toInsert")
	public String toInsert(){
		return "login";
	}
	
	
}
