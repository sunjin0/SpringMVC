package com.sun.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Books {
	private int bookID;
	private String bookName;
	private int bookCounts;
	private String detail;
	
	public int getbookID() {
		return bookID;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getbookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public int getbookCounts() {
		return bookCounts;
	}
	
	public void setBookCounts(int bookCounts) {
		this.bookCounts = bookCounts;
	}
	
	public String getdetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	@Override
	public String toString() {
		return "Books{" +
				"bookID=" + bookID +
				", bookName='" + bookName + '\'' +
				", bookCounts=" + bookCounts +
				", detail='" + detail + '\'' +
				'}';
	}
}
