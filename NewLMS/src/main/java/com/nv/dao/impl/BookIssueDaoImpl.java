package com.nv.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.nv.bean.Book;
import com.nv.dao.BookDao;
import com.nv.dao.BookIssueDao;
import com.nv.dao.impl.BookDaoImpl;
import com.nv.service.BookService;
import com.nv.service.impl.BookServiceImpl;

public class BookIssueDaoImpl implements BookIssueDao {
	Scanner sc = new Scanner(System.in);
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	BookService bookService = new BookServiceImpl();
	boolean status = false;

	public void requestIssueBook() throws IOException {
		
		System.out.println("Please enter the Book ID of the book you want to issue: ");
		int bookId = sc.nextInt();
		boolean flag = false;
		boolean flag1 = false;

		Book book1 = null;
		for (Book book : BookDaoImpl.bookList) {
			if (book.getBookId() == bookId) {
				System.out.println(book);
				if (book.isAvailable()) {
					flag = true;
					book1 = book;
				}
				flag1 = true;
			}
		}
		if (!flag1) {
			System.out.println("Book with this id doesnt exist. Check the Id again!!");
			return;
		} else if (!flag) {
			System.out.println("Sorry!! The book is currently issued to someone else.");
			return;
		}
		System.out.println("Do you want the above book to be issued? (Y/N)");
		if (br.readLine().equals("y")) {
			status = true;
			bookService.issueBook(book1, status);
		} else {
			status = false;
		}
	}

	

}
