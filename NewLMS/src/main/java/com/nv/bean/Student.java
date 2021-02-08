package com.nv.bean;

public class Student extends User {
	
	private String studentName;
	private String studentBranch;
	private String studentPassword;
	private String studentMobile;
	private int studentId;
	
	
	private boolean isAvailable=false;
	

	private Address address;
		
	
	public Student() 
	{
		super();
	}

	public Student(int id, String name, String temporary, String permanent, String password)
	{	
		super(name, id, password);
		address = new Address(temporary, permanent);
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(String studentName, String studentBranch, String studentPassword, String studentMobile
			) {
		
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentPassword = studentPassword;
		this.studentMobile = studentMobile;
		
	}

	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Name=" + studentName + ", studentBranch=" + studentBranch + ", studentPassword="
				+ studentPassword + ", studentMobile=" + studentMobile + ", isAvailable=" + isAvailable + ", address="
				+ address + "]";
	}

	
	
}
