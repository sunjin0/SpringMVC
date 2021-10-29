package com.sun.service;

import com.sun.pojo.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public interface UserService {
	//增加一个Book
	int addUser(User user);
	
	//根据id删除一个Book
	int deleteUser(int id);
	
	//更新Book
	int updateUser(User user);
	
	//根据id查询,返回一个Book
	User queryUser(HashMap<String,Object> hashMap);
	
	User queryAdmits(HashMap<String,Object> hashMap);
	
	//查询全部Book,返回list集合
	List<User> queryAllUser();
}
