package com.nikhilsnayak3473.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("one-to-one-bi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		Pan pan = entityManager.find(Pan.class, 1);
		if (person != null) {
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getEmail());
			System.out.println(person.getAge());
			System.out.println(person.getPhone());
			Pan pan2 = person.getPan();
			System.out.println(pan2.getPanId());
			System.out.println(pan2.getPanNumber());
			System.out.println(pan2.getAddress());
			System.out.println("=================================================");
		} else {
			System.out.println("No person exist with the specified id");
		}
		if (pan != null) {
			System.out.println(pan.getPanId());
			System.out.println(pan.getPanNumber());
			System.out.println(pan.getAddress());
			Person person2 = pan.getPerson();
			System.out.println(person2.getId());
			System.out.println(person2.getName());
			System.out.println(person2.getEmail());
			System.out.println(person2.getAge());
			System.out.println(person2.getPhone());
		} else {
			System.out.println("No pan exist with the specified id");
		}

	}

}
