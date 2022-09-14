package com.nikhilsnayak3473.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nikhilsnayak3473.dto.BankAccount;
import com.nikhilsnayak3473.dto.Person;

public class BankAccountDao {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("many-to-one-uni");

	public BankAccount createAccount(int id, BankAccount bankAccount) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = entityManager.find(Person.class, id);

		bankAccount.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(bankAccount);
		entityTransaction.commit();

		return entityManager.find(BankAccount.class, bankAccount.getAccountNumber());

	}

	public BankAccount getBankAccount(long accountNumber) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		return entityManager.find(BankAccount.class, accountNumber);
	}

	public boolean deleteBankAccount(long accountNumber) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		BankAccount bankAccount = entityManager.find(BankAccount.class, accountNumber);

		if (bankAccount != null) {
			entityTransaction.begin();
			entityManager.remove(bankAccount);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

	public BankAccount updateBankAccount(long accountNumber, BankAccount bankAccount) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (entityManager.find(BankAccount.class, accountNumber) != null) {
			bankAccount.setAccountNumber(accountNumber);
			entityTransaction.begin();
			entityManager.merge(bankAccount);
			entityTransaction.commit();

			return entityManager.find(BankAccount.class, accountNumber);
		}

		return null;
	}

}
