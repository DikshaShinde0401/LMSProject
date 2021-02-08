package com.nv.daoimpl.junit;

import java.io.IOException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.nv.dao.BookIssueDao;
import com.nv.dao.impl.BookIssueDaoImpl;

public class TestBookIssueDaoImpl {
	private BookIssueDao bookIssueImpl=null;
	@Test
	@Before
	public void setUp() {
		bookIssueImpl=new BookIssueDaoImpl();
	}
	
	@Test
	public void testRequestBookIssue() throws IOException {
		bookIssueImpl.requestIssueBook();
	}
}
