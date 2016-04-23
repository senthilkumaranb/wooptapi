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

import com.woopt.api.dao.UserToShopLoyaltyProgramDAO;
import com.woopt.api.entity.ShopLoyaltyProgramEntity;
import com.woopt.api.entity.UserToShopLoyaltyProgramEntity;


/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
public class UserToShopLoyaltyProgramDAOImpl implements UserToShopLoyaltyProgramDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(UserToShopLoyaltyProgramEntity userShopLoyaltyProgramEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserToShopLoyaltyProgramEntity userShopLoyaltyProgramEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userShopLoyaltyProgramId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserToShopLoyaltyProgramEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserToShopLoyaltyProgramEntity getbyConsumerId(int consumerId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ UserShopLoyaltyProgram +-----------");
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from UserToShopLoyaltyProgramEntity W "
				+ "where W.consumerId=:consumerId and W.userToShopLoyaltyProgramStatus=1");

		query.setParameter("consumerId",consumerId);
		@SuppressWarnings("unchecked")
		List<UserToShopLoyaltyProgramEntity> userShopLoyaltyProgramEntity = query.list();
		session.close();

		if (userShopLoyaltyProgramEntity.size()!=0)
			return userShopLoyaltyProgramEntity.get(0);
		else
			return null;
	}

	@Override
	public UserToShopLoyaltyProgramEntity findById(int userShopLoyaltyProgramId) {
		// TODO Auto-generated method stub
		return null;
	}

}
