package com.nv.bean;

import java.io.Serializable;

public class Login implements Serializable {
	private String sName;
	private String sPassword;

	public Login() {
		super();
	}
	
	

	public Login(String sName, String sPassword) {
		super();
		this.sName = sName;
		this.sPassword = sPassword;
	}



	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

}
