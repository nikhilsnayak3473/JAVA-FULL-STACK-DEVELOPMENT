package com.nikhilsnayak3473.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("one-to-one-bi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Pan pan = new Pan();
		pan.setPanNumber("ABCDEFG");
		pan.setAddress("wmcrijfickljsjklefsmlnkmldsm");

		Person person = new Person();
		person.setName("Nikhil");
		person.setEmail("nikhilsnayak3473@gmail.com");
		person.setAge(20);
		person.setPhone(6364470015L);
		
		person.setPan(pan);
		
		pan.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
	}

}
