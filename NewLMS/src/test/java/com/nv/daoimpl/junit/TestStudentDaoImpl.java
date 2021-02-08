package com.nv.daoimpl.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.nv.bean.Student;
import com.nv.dao.StudentDao;
import com.nv.dao.impl.StudentDaoImpl;

public class TestStudentDaoImpl {
@Test
public void testAddStudentDetails() throws IOException {
	StudentDao studentDao=new StudentDaoImpl();
	
		boolean Excepted = true;
		Student students = new Student();
		
		boolean Actual = studentDao.addStudentDetails(students);
		assertEquals(Excepted, Actual);
	}
	


}
