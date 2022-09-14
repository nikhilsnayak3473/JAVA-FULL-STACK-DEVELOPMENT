package com.nikhilsnayak3473.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nikhilsnayak3473.dto.Course;
import com.nikhilsnayak3473.dto.Student;

public class StudentDao {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("many-to-many-uni");

	public Student addStudent(Student student, int[] courseIds) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Course> courses = new ArrayList<Course>();
		for (int courseId : courseIds) {
			Course course = entityManager.find(Course.class, courseId);
			if (course == null) {
				return null;
			} 
			courses.add(course);

		}

		student.setCourses(courses);

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		return entityManager.find(Student.class, student.getId());

	}
	
	public Student getStudentById(int id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		return entityManager.find(Student.class, id);
	}

}
