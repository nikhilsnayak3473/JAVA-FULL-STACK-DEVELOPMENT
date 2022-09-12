package com.nikhilsnayak3473.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nikhilsnayak3473.dto.CustomerDto;

public class CustomerController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-example1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
//		CustomerDto customer = new CustomerDto();
//		
//		customer.setAge(20);
//		customer.setEmail("abc@xyz.com");
//		customer.setName("abc");
//		
//		
//		entityTransaction.begin();
//		entityManager.persist(customer);
//		entityTransaction.commit();
//		
		
	
		
	}
}
