package com.nikhilsnayak3473.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.nikhilsnayak3473.dto.Person;

public class PersonDao {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("many-to-one-uni");

	public Person savePerson(Person person) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

		return entityManager.find(Person.class, person.getId());

	}

	public Person getPersonById(int id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		return entityManager.find(Person.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Person> getPersonByName(String name) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();

		Query query = entityManager.createQuery("select p from Person p where p.name=?1");

		query.setParameter(1, name);

		return query.getResultList();
	}

	public boolean deletePersonById(int id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = entityManager.find(Person.class, id);

		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

	public Person updatePersonById(int id, Person person) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (entityManager.find(Person.class, id) != null) {
			person.setId(id);
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();

			return entityManager.find(Person.class, id);
		}

		return null;
	}

}
