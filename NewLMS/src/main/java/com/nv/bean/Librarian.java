package com.nv.bean;

import java.io.Serializable;

import com.nv.bean.User;

public class Librarian extends User implements Serializable 
{ 
	private int id; 
	private String name;
	private String password;
	
	public Librarian() {
		// TODO Auto-generated constructor stub
	}

	public Librarian(int id, String name, String password)
	{
		super(name, id, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return "Librarian [id=" + id + ", name=" + name +  ", getStudentName()="
				+ getStudentName() + ", getStudentId()=" + getStudentId() + ", getPassword()=" + getPassword()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	}
