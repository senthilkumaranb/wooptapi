package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.common.Updater;
import com.woopt.api.dao.ShopLoyaltyProgramStageDAO;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;
import com.woopt.api.entity.ShopLoyaltyProgramStageEntity;

public class ShopLoyaltyProgramStageDAOImpl implements ShopLoyaltyProgramStageDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public ShopLoyaltyProgramStageEntity save(ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity) {
		// TODO Auto-generated method stub
		ShopLoyaltyProgramStageEntity rc = new ShopLoyaltyProgramStageEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(shopLoyaltyProgramStageEntity);
		rc=shopLoyaltyProgramStageEntity;
		tx.commit();
		session.close();
		return rc;
	}

	@Override
	public ShopLoyaltyProgramStageEntity update(ShopLoyaltyProgramStageEntity oldE,ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity) {
		// TODO Auto-generated method stub
		try{
			ShopLoyaltyProgramStageEntity rc = new ShopLoyaltyProgramStageEntity();
			Session session = this.sessionFactory.openSession();
			System.out.println("----- Original -----" + oldE);
			System.out.println("----- New -----" + shopLoyaltyProgramStageEntity);
			shopLoyaltyProgramStageEntity = Updater.updater(oldE, shopLoyaltyProgramStageEntity);
			System.out.println("----- After update -----" + shopLoyaltyProgramStageEntity);
			Transaction tx = session.beginTransaction();
			session.update(shopLoyaltyProgramStageEntity);
			rc=shopLoyaltyProgramStageEntity;
			tx.commit();
			session.close();
			return rc;
		}
		catch (Exception e){
			System.out.println("----- Exception -----" + e);
			return null;
		}
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
	public ShopLoyaltyProgramStageEntity findById(int shopStageId) {
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
