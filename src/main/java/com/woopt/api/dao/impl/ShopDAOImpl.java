package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.woopt.api.dao.ShopDAO;
import com.woopt.api.entity.ShopEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopDAOImpl implements ShopDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopEntity shop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopEntity findById(long shopId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int shopId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShopDAO(ShopEntity shop) {
		// TODO Auto-generated method stub
		
	}

}
