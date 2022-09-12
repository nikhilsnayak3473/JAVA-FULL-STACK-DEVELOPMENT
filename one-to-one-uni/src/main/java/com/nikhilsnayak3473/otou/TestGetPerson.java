package com.nikhilsnayak3473.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("one-to-one-uni");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		Pan pan = entityManager.find(Pan.class, 50);
		if (person != null) {
			System.out.println(person);
		} else {
			System.out.println("No person exist with the specified id");
		}
		if (pan != null) {
			System.out.println(pan);
		} else {
			System.out.println("No pan exist with the specified id");
		}
		
	}

}
