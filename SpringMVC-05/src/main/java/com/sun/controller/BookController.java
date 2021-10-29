package com.sun.controller;

import com.sun.pojo.Books;
import com.sun.pojo.User;
import com.sun.service.BookService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
	private int i,i2;
	private Books books;
	private final BookService bookService;
	
	public BookController(@Qualifier("bookServiceImpl") BookService bookService) {
		this.bookService = bookService;
	}
	
	public void allBook(Model model){
		List<Books> list = bookService.queryAllBook();
		model.addAttribute("list", list);
	}
	@RequestMapping("/allBook")
	public String list(Model model) {
		allBook(model);
		return "allBook";
	}
	@RequestMapping("/allBook2")
	public String list2(Model model,User user) {
		model.addAttribute("msg","欢迎"+user.getName()+"到来");
		allBook(model);
		return "/allBook2";
	}
	@RequestMapping("/allBook3")
	public String list3(Model model) {
		if (i>0) {
			model.addAttribute("msg",books.getbookName()+"借到了");
			bookService.updateBook(new Books(books.getbookID(),books.getbookName(),i,books.getdetail()));
		}else if (i==0){
			model.addAttribute("msg",books.getbookName()+"没有了");
		}
		if (i2>0) {
			model.addAttribute("msg",books.getbookName()+"归还了");
			bookService.updateBook(new Books(books.getbookID(),books.getbookName(),i2,books.getdetail()));
		}
		allBook(model);
		return "/allBook2";
	}
	@RequestMapping("/toAddBook")
	public String toAddPaper() {
		return "addBook";
	}
	
	@RequestMapping("/addBook")
	public String addPaper(Books books) {
		System.out.println(books);
		bookService.addBook(books);
		return "redirect:/book/allBook";
	}
	@RequestMapping("/toUpdateBook")
	public String toUpdateBook(Model model, int id) {
		Books books = bookService.queryBookById(id);
		System.out.println(books);
		model.addAttribute("book",books );
		return "updateBook";
	}
	
	@RequestMapping("/updateBook")
	public String updateBook(Model model, Books book) {
		System.out.println(book);
		bookService.updateBook(book);
		Books books = bookService.queryBookById(book.getbookID());
		model.addAttribute("books", books);
		return "redirect:/book/allBook";
	}
	
	@RequestMapping("/studyBook{bookId}")
	public String studyBook(@PathVariable int bookId ){
		books = bookService.queryBookById(bookId);
		i = books.getbookCounts() - 1;
		return "redirect:/book/allBook3";
		
	}
	@RequestMapping("/studyBook2{bookId}")
	public String studyBook2(@PathVariable int bookId ){
		books = bookService.queryBookById(bookId);
		i2 = books.getbookCounts() +1;
		return "redirect:/book/allBook3";
		
	}
	@RequestMapping("/del/{bookId}")
	public String deleteBook(@PathVariable("bookId") int id) {
		bookService.deleteBookById(id);
		return "redirect:/book/allBook";
	}
}