package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

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
	public void save(ShopEmployeeEntity shopemployee) {
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

	@Override
	public void delete(int shopemployeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShopEmployee(ShopEmployeeEntity shopemployee) {
		// TODO Auto-generated method stub
		
	}

}
