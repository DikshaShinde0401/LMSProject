package com.nv.dao;

import java.util.ArrayList;

import com.nv.bean.Book;

public interface BookDao {
	public boolean addBook(Book book);
	public boolean defaultBook(Book book);
	public void getAllBook();
	public ArrayList<Book> searchByBookName(String bookName);
	public ArrayList<Book> searchByAuthorName(String authorName);
	public void issuedBooks();//Librarian
	public void getAvailability();//student
	public void getBookCount();
	public ArrayList<Book> studentSearchByBookName(String bookName);
	
}
