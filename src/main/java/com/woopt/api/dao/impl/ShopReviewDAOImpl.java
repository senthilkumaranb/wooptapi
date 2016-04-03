package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.woopt.api.dao.ShopReviewDAO;
import com.woopt.api.entity.ShopReviewEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopReviewDAOImpl implements ShopReviewDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopReviewEntity shopreview) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopReviewEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopReviewEntity findById(long shopreviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int shopreviewId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShopReview(ShopReviewEntity shopreview) {
		// TODO Auto-generated method stub
		
	}

}
