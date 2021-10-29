package com.sun.service;

import com.sun.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

//BookService:底下需要去实现,调用dao层
@Service
public interface BookService {
	//增加一个Book
	void addBook(Books book);
	
	//根据id删除一个Book
	void deleteBookById(int id);
	
	//更新Book
	void updateBook(Books books);
	
	//根据id查询,返回一个Book
	Books queryBookById(int id);
	
	//查询全部Book,返回list集合
	List<Books> queryAllBook();
}