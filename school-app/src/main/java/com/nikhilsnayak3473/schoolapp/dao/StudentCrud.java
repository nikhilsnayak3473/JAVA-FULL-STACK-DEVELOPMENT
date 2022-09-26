package com.nikhilsnayak3473.schoolapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.nikhilsnayak3473.schoolapp.dto.Student;

public class StudentCrud {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("school-app");

	public Student addStudent(Student student) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		return entityManager.find(Student.class, student.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudnets() {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();

		Query query = entityManager.createQuery("select student from Student student");

		return query.getResultList();
	}

	public boolean removeStudent(int id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);

		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

	public Student updateStudent(int id, Student student) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (entityManager.find(Student.class, id) != null) {
			student.setId(id);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return entityManager.find(Student.class, id);
		}

		return null;
	}

	public Student getStudentById(int id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		return entityManager.find(Student.class, id);
	}

}
