package com.nv.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nv.bean.Login;
import com.nv.main.MainClass;
import com.nv.service.LoginValidationService;

public class LoginValidationServiceImpl implements LoginValidationService {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	private static Login librarian = new Login("admin", "admin");
	private static Login student = new Login("diksha", "diksha");
	private static Login student1 = new Login("shinde", "shinde");
	List<Login> list = new ArrayList<Login>();
	private static int who = 1;
	
	public int Authentication() throws IOException {

		list.add(librarian);
		list.add(student);
		list.add(student1);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name and Password");
		String userName = scan.next();
		String password = scan.next();

		for (Login login1 : list) {
			 
			if (userName.equalsIgnoreCase(login1.getsName()) && password.equalsIgnoreCase(login1.getsPassword())
					&& who == 1) {
				
				System.out.println("WELCOME Librarian");
                 
				return 1;
			} else if (userName.equalsIgnoreCase(login1.getsName()) && password.equalsIgnoreCase(login1.getsPassword())
					&& who == 2) {
				System.out.println("WELCOME " + userName);

				return 2;
			} else {
				return 2;
			}
			
		

		} // for
		
		return 2;

	}// method
		// try (Scanner scan = new Scanner(System.in)) {

}// class
/*
 * System.out.println("*****Welcome To Library******");
 * System.out.println("Enter Username:-"); String userName = br.readLine();
 * System.out.println("Enter Password:-"); String password = br.readLine();
 * 
 * if (userName.equals("admin") && (password.equals("admin"))) { //
 * log.info("Welcome "+userName+"!!!!!!!!"); System.out.println("Welcome " +
 * userName + "!!!!!!!!"); return 1; } else if (userName.equals("student") &&
 * (password.equals("student"))) { // log.info("Welcome "+userName+"!!!!!!!!");
 * System.out.println("Welcome " + userName + "!!!!!!!!"); return 2;
 * 
 * } else { return 3; }
 */
