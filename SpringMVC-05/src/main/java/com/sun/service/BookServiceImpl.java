package com.sun.service;

import com.sun.dao.BookMapper;
import com.sun.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
	
	private BookMapper bookMapper;
	
	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}
	
	public void addBook(Books book) {
		bookMapper.addBook(book);
	}
	
	public void deleteBookById(int id) {
		bookMapper.deleteBookById(id);
	}
	
	public void updateBook(Books books) {
		bookMapper.updateBook(books);
	}
	
	public Books queryBookById(int id) {
		return bookMapper.queryBookById(id);
	}
	
	public List<Books> queryAllBook() {
		return bookMapper.queryAllBook();
	}
}
