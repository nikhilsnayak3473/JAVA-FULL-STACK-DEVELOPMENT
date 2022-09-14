package com.nikhilsnayak3473.controller;

import java.util.List;

import com.nikhilsnayak3473.dao.StudentDao;
import com.nikhilsnayak3473.dto.Course;
import com.nikhilsnayak3473.dto.Student;

public class GetStudentById {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();

		Student student = studentDao.getStudentById(3);

		if (student == null) {
			System.out.println("Cannot find student with specified id");
		} else {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			System.out.println(student.getAge());
			System.out.println("==============================");

			List<Course> courses = student.getCourses();

			for (Course course : courses) {
				System.out.println(course.getId());
				System.out.println(course.getName());
				System.out.println(course.getFee());
				System.out.println("==============================");
			}
		}
	}

}
