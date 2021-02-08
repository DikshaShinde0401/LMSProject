package com.nv.service.impl;

import org.apache.log4j.Logger;

import com.nv.service.StudentService;

public class StudentServiceImpl implements StudentService{
	static Logger log = Logger.getLogger(StudentServiceImpl.class);
	@Override
	public void addStudentStatus(boolean status) {
		
		if (status == true) {
			log.info("...Your Registration is successfullly...");
			System.out.println("...SuccessFully Registered...");
			
		} else {
			log.info("....Not registered....");
			System.out.println("....Try again...");
			
		}
		
	}

}
