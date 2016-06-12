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

import com.woopt.api.common.Updater;
import com.woopt.api.dao.UserToShopLoyaltyCardStageDAO;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;
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
	public UserToShopLoyaltyCardStageEntity update(UserToShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity) {

		try{
			System.out.println("--------+ getShopLoyaltyCardStageId +-----------" + shopLoyaltyCardStageEntity.getUserToShopLoyaltyCardStageId());
			
			UserToShopLoyaltyCardStageEntity oldE = this.findById(shopLoyaltyCardStageEntity.getUserToShopLoyaltyCardStageId());
			System.out.println("--------+ UserToShopLoyaltyCardStageEntity +-----------" + oldE);
			
			UserToShopLoyaltyCardStageEntity rc = new UserToShopLoyaltyCardStageEntity();	
			
			Session session = this.sessionFactory.openSession();
			shopLoyaltyCardStageEntity = Updater.updater(oldE, shopLoyaltyCardStageEntity);
			Transaction tx = session.beginTransaction();
			session.update(shopLoyaltyCardStageEntity);
			rc=shopLoyaltyCardStageEntity;
			tx.commit();
			session.close();
			return rc;
		}
		catch (Exception e){
			System.out.println("--------+ exception +-----------" + e);
			return null;
		}
		
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
	public UserToShopLoyaltyCardStageEntity findById(int userShopLoyaltyCardStageId) {

		System.out.println("--------+ UserShopLoyaltyCardStage +-----------");
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from UserToShopLoyaltyCardStageEntity W "
				+ "where W.userToShopLoyaltyCardStageId=:userShopLoyaltyCardStageId");
		query.setParameter("userShopLoyaltyCardStageId",userShopLoyaltyCardStageId);
		@SuppressWarnings("unchecked")
		List<UserToShopLoyaltyCardStageEntity> userToShopLoyaltyCardStageEntity = query.list();
		session.close();
		if (userToShopLoyaltyCardStageEntity.size()!=0)
			return userToShopLoyaltyCardStageEntity.get(0);
		return null;
	}

}
