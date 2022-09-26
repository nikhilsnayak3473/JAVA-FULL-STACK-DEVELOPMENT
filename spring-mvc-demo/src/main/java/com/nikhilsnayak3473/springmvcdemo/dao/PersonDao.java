package com.nikhilsnayak3473.springmvcdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nikhilsnayak3473.springmvcdemo.dto.Person;

@Component
public class PersonDao {
	@Autowired
	private EntityManagerFactory ENTITY_MANAGER_FACTORY;

	public Boolean addPerson(Person person) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

		return entityManager.find(Person.class, person.getId()) != null;
	}

	@SuppressWarnings("unchecked")
	public List<Person> getAllPersons() {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();

		Query query = entityManager.createQuery("select person from Person person");

		return query.getResultList();
	}

	public Person getPersonById(int id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();

		return entityManager.find(Person.class, id);
	}

	public Boolean removePerson(int id) {

		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = entityManager.find(Person.class, id);

		if (person == null)
			return null;

		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();

		return entityManager.find(Person.class, id)==null;

	}

	public Person updatePerson(Person person) {

		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		
		
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();

		return entityManager.find(Person.class, person.getId());

	}

}
