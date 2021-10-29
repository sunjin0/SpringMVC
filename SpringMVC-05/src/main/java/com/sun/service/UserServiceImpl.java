package com.sun.service;

import com.sun.dao.UserMapper;
import com.sun.pojo.User;

import java.util.HashMap;
import java.util.List;

public class UserServiceImpl implements UserService{
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}
	
	@Override
	public int deleteUser(int id) {
		return userMapper.deleteUser(id);
	}
	
	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}
	
	@Override
	public User queryUser(HashMap<String,Object> hashMap) {
		return userMapper.queryUser(hashMap);
	}
	
	@Override
	public User queryAdmits(HashMap<String, Object> hashMap) {
		return userMapper.queryAdmit(hashMap);
	}
	
	@Override
	public List<User> queryAllUser() {
		return userMapper.queryAllUser();
	}
}
