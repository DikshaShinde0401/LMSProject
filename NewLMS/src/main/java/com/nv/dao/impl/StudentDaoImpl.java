package com.nv.dao.impl;

import java.util.ArrayList;

import com.nv.bean.Student;
import com.nv.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
	public static ArrayList<Student> studentList = new ArrayList<>();

	boolean status = false;

	@Override
	public boolean addStudentDetails(Student student) {
		if (student.getStudentId() != 0) {
			studentList.add(student);
			status = true;
		} else {
			status = false;
		}
		return true;
	}
}
