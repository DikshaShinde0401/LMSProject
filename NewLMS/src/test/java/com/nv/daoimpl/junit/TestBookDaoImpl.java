package com.nv.daoimpl.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nv.bean.Book;
import com.nv.dao.BookDao;
import com.nv.dao.impl.BookDaoImpl;

public class TestBookDaoImpl {
	BookDao bookDao = new BookDaoImpl();

	@Test
	public void testDefaultBooks() {
		boolean Excepted = true;
		Book books = new Book("Computer", "Networking", "Ketty", 100, 200);
		boolean Actual = bookDao.defaultBook(books);
		assertEquals(Excepted, Actual);
		
	}

	

}
