package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.ShopEmployeeDAO;
import com.woopt.api.entity.ShopEmployeeEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopEmployeeDAOImpl implements ShopEmployeeDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopEmployeeEntity shopEmployee) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(shopEmployee);
		tx.commit();
		session.close();	
	}

	@Override
	public void update(ShopEmployeeEntity shopEmployee) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(shopEmployee);
		tx.commit();
		session.close();	
	}
	
	@Override
	public void delete(int shopemployeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopEmployeeEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopEmployeeEntity findById(long shopemployeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
