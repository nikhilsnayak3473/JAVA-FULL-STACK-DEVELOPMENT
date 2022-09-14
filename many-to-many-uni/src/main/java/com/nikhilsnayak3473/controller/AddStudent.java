package com.nikhilsnayak3473.controller;

import com.nikhilsnayak3473.dao.StudentDao;
import com.nikhilsnayak3473.dto.Student;

public class AddStudent {
	public static void main(String[] args) {
		Student student = new Student();

		student.setName("Pavitra");
		student.setEmail("pavitrakambar7@gmail.com");
		student.setAge(20);
		int[] courseIds = { 1, 2, 3 };

		StudentDao studentDao = new StudentDao();

		student = studentDao.addStudent(student, courseIds);

		if (student == null) {
			System.out.println("Cannot find courses with specified ids");
		} else {
			System.out.println("Student saved");
		}
	}

}
