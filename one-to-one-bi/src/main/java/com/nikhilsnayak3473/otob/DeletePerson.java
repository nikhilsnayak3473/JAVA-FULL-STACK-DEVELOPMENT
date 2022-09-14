package com.nikhilsnayak3473.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("one-to-one-bi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = entityManager.find(Person.class, 1);

		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();

		}

	}

}
