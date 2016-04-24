package com.woopt.api.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.UserToShopLoyaltyCardStageDAO;
import com.woopt.api.entity.UserToShopLoyaltyCardStageEntity;


/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
public class UserToShopLoyaltyCardStageDAOImpl implements UserToShopLoyaltyCardStageDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(UserToShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserToShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userShopLoyaltyCardStageId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserToShopLoyaltyCardStageEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserToShopLoyaltyCardStageEntity> getbyCardId(int userShopLoyaltyCardId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ UserShopLoyaltyCardStage +-----------");
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from UserToShopLoyaltyCardStageEntity W "
				+ "where W.userToShopLoyaltyCardId=:userShopLoyaltyCardId ORDER BY W.shopLoyaltyCardStageId ASC");
		query.setParameter("userShopLoyaltyCardId",userShopLoyaltyCardId);
		@SuppressWarnings("unchecked")
		List<UserToShopLoyaltyCardStageEntity> userToShopLoyaltyCardStageEntity = query.list();
		session.close();
		return userToShopLoyaltyCardStageEntity;
	}

	@Override
	public UserToShopLoyaltyCardStageEntity findById(long userShopLoyaltyCardStageId) {
		// TODO Auto-generated method stub
		return null;
	}

}
