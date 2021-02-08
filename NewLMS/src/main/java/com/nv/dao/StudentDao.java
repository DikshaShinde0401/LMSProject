package com.nv.dao;

import java.io.IOException;

import com.nv.bean.Student;

public interface StudentDao {
	public boolean addStudentDetails(Student student) throws IOException;
}
