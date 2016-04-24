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

import com.woopt.api.dao.UserToShopLoyaltyCardDAO;
import com.woopt.api.entity.UserToShopLoyaltyCardEntity;


/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
public class UserToShopLoyaltyCardDAOImpl implements UserToShopLoyaltyCardDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(UserToShopLoyaltyCardEntity userShopLoyaltyCardEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserToShopLoyaltyCardEntity userShopLoyaltyCardEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userShopLoyaltyCardId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserToShopLoyaltyCardEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserToShopLoyaltyCardEntity getbyConsumerId(int consumerId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ UserShopLoyaltyCard +-----------");
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from UserToShopLoyaltyCardEntity W "
				+ "where W.consumerId=:consumerId and W.userToShopLoyaltyCardStatus=1");
		query.setParameter("consumerId",consumerId);
		@SuppressWarnings("unchecked")
		List<UserToShopLoyaltyCardEntity> userShopLoyaltyCardEntity = query.list();
		session.close();
		if (userShopLoyaltyCardEntity.size()!=0)
			return userShopLoyaltyCardEntity.get(0);
		else
			return null;
	}

	@Override
	public UserToShopLoyaltyCardEntity findById(int userShopLoyaltyCardId) {
		// TODO Auto-generated method stub
		return null;
	}

}
