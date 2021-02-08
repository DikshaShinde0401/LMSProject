package com.nv.service;

import java.util.ArrayList;

import com.nv.bean.Book;

public interface BookService {
	public void addBookStatus(boolean status);
	public void searchStatus(ArrayList<Book> book);
	public void issueBook(Book b,boolean status);
	public void confirmReturnBook(Book book,boolean status);
	
}
