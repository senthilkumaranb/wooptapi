package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.ShopLoyaltyProgramStageDAO;
import com.woopt.api.entity.ShopLoyaltyProgramStageEntity;

public class ShopLoyaltyProgramStageDAOImpl implements ShopLoyaltyProgramStageDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(shopLoyaltyProgramStageEntity);
		tx.commit();
		session.close();
	}

	@Override
	public void update(ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(shopLoyaltyProgramStageEntity);
		tx.commit();
		session.close();
	}
	
	@Override
	public void delete(int ShopLoyaltyCardId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopLoyaltyProgramStageEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShopLoyaltyProgramStageEntity> getbyProgramId(int shopLoyaltyProgramId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ ShopLoyaltyProgram +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		//Query query = session.createQuery("select new ShopLoyaltyProgramStageEntity(shopLoyaltyProgramStageNo,shopLoyaltyProgramStageName,shopLoyaltyProgramStagePromotionEligibility,shopLoyaltyProgramStageDiscount) from ShopLoyaltyProgramStageEntity W where W.shopLoyaltyProgramId=:shopLoyaltyProgramId ORDER BY W.shopLoyaltyProgramStageId ASC");
		Query query = session.createQuery("from ShopLoyaltyProgramStageEntity W where W.shopLoyaltyProgramId=:shopLoyaltyProgramId ORDER BY W.shopLoyaltyProgramStageId ASC");
		query.setParameter("shopLoyaltyProgramId",shopLoyaltyProgramId);
		@SuppressWarnings("unchecked")
		List<ShopLoyaltyProgramStageEntity> shopLoyaltyProgramStageEntity = query.list();
		session.close();
		return shopLoyaltyProgramStageEntity;
	}

	@Override
	public ShopLoyaltyProgramStageEntity findById(long shopStageId) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from ShopLoyaltyProgramStageEntity W where W.shopLoyaltyProgramStageId=:shopLoyaltyProgramStageId ORDER BY W.shopLoyaltyProgramStageId ASC");
		query.setParameter("shopLoyaltyProgramStageId",shopStageId);
		@SuppressWarnings("unchecked")
		List<ShopLoyaltyProgramStageEntity> shopLoyaltyProgramStageEntity = query.list();
		session.close();
		if (shopLoyaltyProgramStageEntity.size()!=0)	
			return shopLoyaltyProgramStageEntity.get(0);
		else
			return null;
	}

}
