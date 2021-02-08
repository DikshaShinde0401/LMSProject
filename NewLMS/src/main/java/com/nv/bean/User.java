package com.nv.bean;

import java.io.Serializable;

public class User  implements Serializable
{
	private String studentName;
	private int studentId;
	private String password;
	
	public User()
	{
		// TODO Auto-generated constructor stub
	}

	public User(String studentName, int studentId, String password) 
	{
		
		this.studentName = studentName;
		this.studentId = studentId;
		this.password = password;
		
	}

	
	public String getStudentName() 
	{
		return studentName;
	}

	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}

	public int getStudentId() 
	{
		return studentId;
	}

	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	

	

	@Override
	public String toString() 
	{
		return "User [studentName=" + studentName + ", studentId=" + studentId + ", password=" + password + "]";
	}
	
	
	
}
