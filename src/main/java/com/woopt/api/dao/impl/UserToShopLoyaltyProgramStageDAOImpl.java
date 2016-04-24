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

import com.woopt.api.dao.UserToShopLoyaltyProgramStageDAO;
import com.woopt.api.entity.UserToShopLoyaltyCardStageEntity;
import com.woopt.api.entity.UserToShopLoyaltyProgramStageEntity;


/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
public class UserToShopLoyaltyProgramStageDAOImpl implements UserToShopLoyaltyProgramStageDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(UserToShopLoyaltyProgramStageEntity userShopLoyaltyProgramStageEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserToShopLoyaltyProgramStageEntity userShopLoyaltyProgramStageEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userShopLoyaltyProgramStageId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserToShopLoyaltyProgramStageEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserToShopLoyaltyProgramStageEntity> getbyCardId(int userShopLoyaltyProgramId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ UserShopLoyaltyCardStage +-----------");
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from UserToShopLoyaltyProgramStageEntity W "
				+ "where W.userToShopLoyaltyProgramId=:userShopLoyaltyProgramId ORDER BY W.shopLoyaltyProgamStageId ASC");
		query.setParameter("userShopLoyaltyProgramId",userShopLoyaltyProgramId);
		@SuppressWarnings("unchecked")
		List<UserToShopLoyaltyProgramStageEntity> userShopLoyaltyProgramStageEntity = query.list();
		session.close();
		return userShopLoyaltyProgramStageEntity;
	}

	@Override
	public UserToShopLoyaltyProgramStageEntity findById(long userShopLoyaltyProgramStageId) {
		// TODO Auto-generated method stub
		return null;
	}

}
