package com.nv.serviceimpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nv.service.impl.LoginValidationServiceImpl;

public class LoginValidationServiceImplTest {

	private LoginValidationServiceImpl obj;
	private int Excepted;
	private int Actual;

	@BeforeEach
	public void setUpforAdmin() {
		obj = new LoginValidationServiceImpl();
		Excepted = 1;
		Actual = 0;
	}

	@Test
	public void testAuthenticationAdmin() throws IOException {
		Actual = obj.Authentication();
		Assertions.assertEquals(Excepted, Actual, "Only admin can Login");

	}

	@Test
	public void testAuthenticationStudent() throws IOException {
		int Actual = 0;
		int Excepted = 2;
		Actual = obj.Authentication();

	}

	@Test
	@AfterEach
	public void cleanUp() {
		obj = null;
		Excepted = Actual = 0;
	}

}
