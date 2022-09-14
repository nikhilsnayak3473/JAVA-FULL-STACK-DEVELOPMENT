package com.nikhilsnayak3473.controller;

import com.nikhilsnayak3473.dao.CourseDao;
import com.nikhilsnayak3473.dto.Course;

public class AddCourse {
	public static void main(String[] args) {
		Course course = new Course();

		course.setName("Python");
		course.setFee(10000);

		CourseDao courseDao = new CourseDao();

		course = courseDao.addCourse(course);

		if (course != null) {
			System.out.println("Course added");
		} else {
			System.out.println("Could not add course");
		}
	}

}
