package com.nv.dao.impl;

import java.util.ArrayList;

import com.nv.bean.Book;
import com.nv.bean.Login;
import com.nv.dao.BookDao;

public class BookDaoImpl implements BookDao {

	public static ArrayList<Book> bookList = new ArrayList<>();
	public static ArrayList<Book> bookIssueList = new ArrayList<>();
	Book book1 = new Book("Computer", "Networking", "Tom", 200, 100);
	Book book2 = new Book("Java", "Techincal", "James Goshling", 400, 100);
	Login login=new Login();
	boolean status = false;
	
	

	@Override
	public boolean defaultBook(Book book) {
		book1.setBookId(1);
		book2.setBookId(2);
		bookList.add(book1);
		bookList.add(book2);
		status = true;
		return status;
	}

	@Override
	public boolean addBook(Book book) {
		if (book.getBookId() > 0) {
			bookList.add(book);
			status = true;
		} else {
			status = false;
		}

		return status;
	}

	@Override
	public void getAllBook() {
		if (bookList.isEmpty()) {
			System.out.println("No Books");
		} else {
			System.out.println("All Books");
			for (Book b : bookList) {
				System.out.println(b.toString());
			}
		}

	}

	@Override
	public ArrayList<Book> searchByBookName(String bookName) {
		ArrayList<Book> arrayList = new ArrayList<Book>();

		for (Book b1 : bookList) {
			if (b1.getBookName().contains(bookName)) {
				arrayList.add(b1);
			}
		}
		return arrayList;

	}

	public ArrayList<Book> searchByAuthorName(String authorName) {
		ArrayList<Book> arrayList = new ArrayList<Book>();

		for (Book b1 : bookList) {
			if (b1.getAuthorName().contains(authorName)) {
				arrayList.add(b1);
			}
		}
		return arrayList;

	}

	public void issuedBooks()// librarian
	{
		if (bookIssueList.isEmpty()) {
			System.out.println("No Books are Issued");
		} else {
			for (Book b : bookIssueList) {
				System.out.println("The book Has been issued by id= "+login.getsName());
				System.out.println(b.toString());
			}
		}
	}

	public void getAvailability() // for students
	{
		@SuppressWarnings("unused")
		ArrayList<Book> arrayList = new ArrayList<Book>();

		if (bookList.isEmpty()) {
			System.out.println("Nothing To Display");
		} else {
			System.out.println(" Available Books");
			for (Book b1 : bookList) {
				if (b1.isAvailable() == true) {
					System.out.println(b1.toString());
				}
			}

		}

	}

	@Override
	public void getBookCount() {
		System.out.println("Books in the Library Are:- " + bookList.size());
	}

	@Override
	public ArrayList<Book> studentSearchByBookName(String bookName) {
		ArrayList<Book> arrayList = new ArrayList<Book>();
		for (Book b1 : bookList) {
			if ((b1.isAvailable() == true) && (b1.getBookName().contains(bookName))) {
				arrayList.add(b1);
			}
		}
		return arrayList;
	}
}
