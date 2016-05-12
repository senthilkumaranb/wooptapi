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

import com.woopt.api.dao.ShopLoyaltyCardDAO;
import com.woopt.api.entity.ShopLoyaltyCardEntity;


/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
public class ShopLoyaltyCardDAOImpl implements ShopLoyaltyCardDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public ShopLoyaltyCardEntity save(ShopLoyaltyCardEntity shopLoyaltyCardEntity) {
		// TODO Auto-generated method stub
		ShopLoyaltyCardEntity rc = new ShopLoyaltyCardEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(shopLoyaltyCardEntity);
		rc=shopLoyaltyCardEntity;
		tx.commit();
		session.close();
		return rc;
	}
	
	@Override
	public ShopLoyaltyCardEntity update(ShopLoyaltyCardEntity shopLoyaltyCardEntity) {
		//  Function to add shoployaltycard entity
		System.out.println("--------+ shopLoyaltyCardEntity +-----------" + shopLoyaltyCardEntity);
		ShopLoyaltyCardEntity rc = new ShopLoyaltyCardEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(shopLoyaltyCardEntity);
		rc=shopLoyaltyCardEntity;
		tx.commit();
		session.close();
		return rc;
		
	}
	
	@Override
	public void delete(int ShopLoyaltyCardId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopLoyaltyCardEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopLoyaltyCardEntity getbyShopId(int shopId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ ShopLoyaltyCard +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopLoyaltyCardEntity W where W.shopId=:shopID and W.shopLoyaltyCardStatus=1");
		query.setParameter("shopID",shopId);
		@SuppressWarnings("unchecked")
		List<ShopLoyaltyCardEntity> shopLoyaltyCardEntity = query.list();
		session.close();
		//System.out.println("+++++shop loyalty card record+++++"+shopLoyaltyCardEntity.get(0));
		if (shopLoyaltyCardEntity.size()!=0)
			return shopLoyaltyCardEntity.get(0);
		else
			return null;
	}

	@Override
	public ShopLoyaltyCardEntity findById(int shopLoyaltyCardEntityId) {
		// TODO Auto-generated method stub
		return null;
	}

}
