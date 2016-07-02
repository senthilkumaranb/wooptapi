package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.FamilyDAO;
import com.woopt.api.entity.FamilyEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class FamilyDAOImpl implements FamilyDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(FamilyEntity family) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(family);
		tx.commit();
	}

	@Override
	public List<FamilyEntity> list() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked") 
		List<FamilyEntity> familyEntityList = session.createQuery("from FamilyEntity").list();
		session.close();
		return familyEntityList;
	}

	@Override
	public FamilyEntity findById(long familyId) {
		Session session = sessionFactory.openSession();
		FamilyEntity familyEntity = (FamilyEntity)session.get(FamilyEntity.class, familyId);
		return familyEntity;
	}

	@Override
	public void delete(long familyId) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			FamilyEntity familyEntity = (FamilyEntity)session.get(FamilyEntity.class, familyId);
			session.delete(familyEntity);
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void updateFamily(FamilyEntity family) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(family);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (null != tx) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<FamilyEntity> findByFamilyHeadId(long familyHeadId) {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked") 
		List<FamilyEntity> familyEntityList = session.createQuery("from FamilyEntity").list();
		session.close();
		return familyEntityList;
	}

	@Override
	public List<FamilyEntity> findByFamilyMemberId(long familyMemberId) {
		//TODO filter the result by familyMemberId
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked") 
		List<FamilyEntity> familyEntityList = session.createQuery("from FamilyEntity").list();
		session.close();
		return familyEntityList;
	}
}
