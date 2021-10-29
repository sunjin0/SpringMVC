package com.sun.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int id;
	private  String name;
	private  String pwd;
	public User(String name,String pwd){
		this.name=name;
		this.pwd=pwd;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPwd() {
		return pwd;
	}
}
