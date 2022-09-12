package com.nikhilsnayak3473.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nikhilsnayak3473.dto.Mobile;
import com.nikhilsnayak3473.dto.Sim;

public class MobileDao {
	private static final EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("one-to-many-uni");

	public Mobile saveMobileSim(Mobile mobile) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Sim> sims = mobile.getSims();

		entityTransaction.begin();
		for (Sim sim : sims) {
			entityManager.persist(sim);
		}

		entityManager.persist(mobile);

		entityTransaction.commit();

		return entityManager.find(Mobile.class, mobile.getmId());
	}

	public Mobile getMobileSimBymId(int mId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, mId);

		return mobile;
	}

	public boolean deleteMobileSimBymId(int mId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = entityManager.find(Mobile.class, mId);

		if (mobile != null) {
			entityTransaction.begin();
			entityManager.remove(mobile);
			List<Sim> sims = mobile.getSims();
			for (Sim sim : sims) {
				entityManager.remove(sim);
			}
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public boolean updateMobileSimBymId(int mId, Mobile mobile) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (entityManager.find(Mobile.class, mId) != null) {
			mobile.setmId(mId);
			entityTransaction.begin();
			entityManager.merge(mobile);
			entityTransaction.commit();
			return true;
		}

		return false;
	}

}
