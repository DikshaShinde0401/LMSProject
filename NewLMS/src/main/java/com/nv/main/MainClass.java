package com.nv.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.nv.bean.Book;
import com.nv.bean.Student;
import com.nv.dao.BookDao;
import com.nv.dao.BookIssueDao;
import com.nv.dao.StudentDao;
import com.nv.dao.impl.BookDaoImpl;
import com.nv.dao.impl.BookIssueDaoImpl;
import com.nv.dao.impl.StudentDaoImpl;
import com.nv.main.MainClass;
import com.nv.service.BookService;
import com.nv.service.LoginValidationService;
import com.nv.service.StudentService;
import com.nv.service.impl.BookServiceImpl;
import com.nv.service.impl.LoginValidationServiceImpl;
import com.nv.service.impl.StudentServiceImpl;

public class MainClass {

	public static int bookId = 0;
	private String bookName;
	private String bookSubject;
	private String authorName;
	private int pageNo;
	private int price;

	public static int studentId = 0;
	private String studentName;
	private String studentBranch;
	private String studentPassword;
	private String studentMobile;
	private static Scanner sc = new Scanner(System.in);
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(isr);

	ArrayList<Book> arrayList = new ArrayList<Book>();
	BookDao bookDao = new BookDaoImpl();
	StudentDao studentDao = new StudentDaoImpl();
	BookService bookService = new BookServiceImpl();
	Book book = new Book();
	Student student = new Student();
	StudentService studentService = new StudentServiceImpl();
	BookIssueDao bookIssueDao = new BookIssueDaoImpl();
	
	LoginValidationService loginValidationService = new LoginValidationServiceImpl();
	private static Logger log = Logger.getLogger(MainClass.class);

	public static void main(String[] args) throws IOException {

		LoginValidationService loginValidationService = new LoginValidationServiceImpl();
		MainClass test = new MainClass();
		int i = 4;
		log.info(".......Welcome To Library......");

		while (true) {
			i = loginValidationService.credententials();
			while (true) {
				if (i == 1) {
					test.librarianShowMenu();

				} else if (i == 2) {
					test.studentShowMenu();

				} else if (i == 3) {
					System.out.println("....Wrong credentials...");
					log.error(".......Wrong credentials......");
					System.out.println("...Please Enter Right details...");
					break;
				}
			} // inner while
		} // outer while
	}

	// Student Switch Case
	public void studentShowMenu() throws IOException {
		int choice = 0;
		boolean status;
		log.info("WelCome...");
		System.out.println("1.View All Books");
		System.out.println("2.See Available Books");
		System.out.println("3. Search By BookName");
		System.out.println("4. Issue Book");
		System.out.println("5. Return Book");
		System.out.println("6. Return to Login");
		System.out.println("7. Register Here!!");
		System.out.println("0. Exit");
		System.out.println("Enter your choice");
		choice = sc.nextInt();

		switch (choice) {
		case 1:// Get All Book List
		{
			bookDao.defaultBook(book);
			bookDao.getAllBook();
			
			break;
		}
		case 2:// See Available Book
		{
			bookDao.getAvailability();

			break;
		}
		case 3:// Search By BookName which are available
		{
			System.out.println("Enter Book Name");
			bookName = br.readLine();
			arrayList = bookDao.studentSearchByBookName(bookName);
			bookService.searchStatus(arrayList);
			break;
		}
		case 4:// Issue Book
		{
			bookIssueDao.requestIssueBook();
			break;
		}
		case 5: // Returned Book
		{
			bookIssueDao.requestIssueBook();
			
			break;
		}
		case 6:// Return to Login
		{
			System.out.println("Log out Successfully");
			log.info("Student Logged Out successfully");
			logout();
		}

		case 7: {
			student = addStudentDetails();
			status = studentDao.addStudentDetails(student);
			studentService.addStudentStatus(status);
			break;

		}
		case 0: {
			System.out.println("Exit!!!!");
			System.out.println("Visit Again");
			log.info("Exit");
			System.exit(0);
		}

		default: {
			System.out.println("Invalid Choice");
			studentShowMenu();
			break;
		}
		}
	}

	public void librarianShowMenu() throws IOException {
		boolean status;
		int choice;
		System.out.println("1. Add Book");
		System.out.println("2. Get All Books Information");
		System.out.println("3. Search By BookName ");
		System.out.println("4. Search By AuthorName");
		System.out.println("5. Issued books by Students");
		System.out.println("6. Book Count In Library");
		System.out.println("7. Return to Login");
		System.out.println("0. Exit");
		System.out.println("Enter Your Choice");
		choice = sc.nextInt();

		switch (choice) {
		case 1: {

			book = addBookDetails();
			status = bookDao.addBook(book);
			bookService.addBookStatus(status);
			break;
		} // case 1

		case 2: {
			// Display All Book
			bookDao.defaultBook(book);
			bookDao.getAllBook();
			break;
		} // case 2 Get all book Information

		case 3: {
			// 3.searchByName--Librarian
			System.out.println("******Searching Book By Name******");
			System.out.println("Enter Book Name");
			bookName = br.readLine();
			arrayList = bookDao.searchByBookName(bookName);
			bookService.searchStatus(arrayList);
			break;
		} // searchByName

		case 4: {
			// 3.SearchByAuthor
			System.out.println("Enter Book Author Name");
			authorName = br.readLine();
			arrayList = bookDao.searchByAuthorName(authorName);
			bookService.searchStatus(arrayList);
			break;
		} // searchByAuthorName
		case 5: {
			// librarian----loaned Books to student
			bookDao.issuedBooks();
			break;
		} // List of Books Issued By Students

		case 6: {
			bookDao.getBookCount();
			break;
		} // Books Count in Library

		case 7:// Return to Login
		{
			System.out.println("**You Logged out Successfully**");
			log.info("successfully LogOut");
			logout();
		} // case 7

		case 0: {
			System.out.println("Exit!!!!");
			// log.info("Exit");
			System.exit(0);
		}
		default: {
			System.out.println("Wrongchoice");
			librarianShowMenu();
			break;
		}

		}// switch
	}// librarianShowMenu

	public Book addBookDetails() throws IOException {
		System.out.println("Adding Book Details------------");

		System.out.println("Enter Book name");
		bookName = br.readLine();

		System.out.println("Enter Book Subject");
		bookSubject = br.readLine();

		System.out.println("Enter author Name");
		authorName = br.readLine();

		System.out.println("Enter page number");
		pageNo = sc.nextInt();

		System.out.println("Enter Price ");
		price = sc.nextInt();

		bookId++;

		Book book = new Book(bookName, bookSubject, authorName, pageNo, price);
		book.setBookId(bookId);
		book.setBookName(bookName);
		book.setAuthorName(authorName);
		book.setBookSubject(bookSubject);
		book.setPageNo(pageNo);
		book.setPrice(price);
		return book;
	}

	private Student addStudentDetails() throws IOException {
		System.out.println("Fill your Details");

		System.out.println("Enter Your Name");
		studentName = br.readLine();

		System.out.println("Enter your Branch");
		studentBranch = br.readLine();

		System.out.println("Enter your Password");
		studentPassword = br.readLine();

		System.out.println("Enter your Mobile");
		studentMobile = br.readLine();

		studentId++;

		Student student = new Student(studentName, studentBranch, studentPassword, studentMobile);
		return student;
	}

	private void logout() throws IOException {
		while (true) {
			int i;
			i = loginValidationService.credententials();
			while (true) {
				if (i == 1) {
					librarianShowMenu();

				} else if (i == 2) {
					studentShowMenu();

				} else if (i == 3) {
					System.out.println("*****Wrong credentials******");
					System.out.println("***Please Enter Right Credentials***");
					break;
				}
			} // inner--while
		} // outer--while

	}

}// class
