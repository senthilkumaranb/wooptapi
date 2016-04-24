package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.ShopLoyaltyCardStageDAO;
import com.woopt.api.entity.ShopLoyaltyCardEntity;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;

public class ShopLoyaltyCardStageDAOImpl implements ShopLoyaltyCardStageDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(shopLoyaltyCardStageEntity);
		tx.commit();
		session.close();
		
	}
	
	@Override
	public void update(ShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(shopLoyaltyCardStageEntity);
		tx.commit();
		session.close();
		
	}
	
	@Override
	public void delete(int ShopLoyaltyCardId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopLoyaltyCardStageEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShopLoyaltyCardStageEntity> getbyId(int shopLoyaltyCardId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ ShopLoyaltyCard +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopLoyaltyCardStageEntity W where W.shopLoyaltyCardId=:shopLoyaltyCardId ORDER BY W.shopLoyaltyCardStageId ASC");
		query.setParameter("shopLoyaltyCardId",shopLoyaltyCardId);
		@SuppressWarnings("unchecked")
		List<ShopLoyaltyCardStageEntity> shopLoyaltyCardStageEntity = query.list();
		session.close();
		return shopLoyaltyCardStageEntity;
	}

	@Override
	public ShopLoyaltyCardStageEntity findById(int shopStageId) {
		// TODO Auto-generated method stub
		return null;
	}

}
