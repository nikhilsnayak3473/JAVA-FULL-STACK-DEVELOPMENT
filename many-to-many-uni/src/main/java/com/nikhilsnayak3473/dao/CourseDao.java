package com.nikhilsnayak3473.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nikhilsnayak3473.dto.Course;

public class CourseDao {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("many-to-many-uni");

	public Course addCourse(Course course) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();

		return entityManager.find(Course.class, course.getId());
	}
}
