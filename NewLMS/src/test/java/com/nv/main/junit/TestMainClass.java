package com.nv.main.junit;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.nv.bean.Book;
import com.nv.main.MainClass;

public class TestMainClass {
	MainClass mainClass = new MainClass();
	Book book = new Book();
	Object Excepted = book;

	@Test
	public void testAddBook() throws IOException {
		
	}

}
