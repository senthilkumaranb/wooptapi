package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.woopt.api.dao.ShopToCategoryDAO;
import com.woopt.api.entity.ShopToCategoryEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopToCategoryDAOImpl implements ShopToCategoryDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(ShopToCategoryEntity shoptoCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ShopToCategoryEntity shoptoCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int shoptoCategoryId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopToCategoryEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopToCategoryEntity findById(int shoptocategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
