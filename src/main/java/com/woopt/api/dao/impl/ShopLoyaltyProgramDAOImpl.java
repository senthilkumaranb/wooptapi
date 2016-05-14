package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.ShopLoyaltyProgramDAO;
import com.woopt.api.entity.ShopLoyaltyProgramEntity;

public class ShopLoyaltyProgramDAOImpl implements ShopLoyaltyProgramDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ShopLoyaltyProgramEntity save(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity) {
		// TODO Auto-generated method stub
		ShopLoyaltyProgramEntity rc = new ShopLoyaltyProgramEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(shopLoyaltyProgramEntity);
		rc = shopLoyaltyProgramEntity;
		tx.commit();
		session.close();
		return rc;
	}

	@Override
	public ShopLoyaltyProgramEntity update(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity) {
		// TODO Auto-generated method stub
		ShopLoyaltyProgramEntity rc = new ShopLoyaltyProgramEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(shopLoyaltyProgramEntity);
		rc = shopLoyaltyProgramEntity;
		tx.commit();
		session.close();
		return rc;
	}
	
	@Override
	public void delete(int ShopLoyaltyCardId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopLoyaltyProgramEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopLoyaltyProgramEntity getbyShopId(int shopId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ ShopLoyaltyProgram +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		//Query query = session.createQuery("Select new ShopLoyaltyProgramEntity(shopLoyaltyProgramId,shopLoyaltyProgramName,shopLoyaltyProgramStatus, shopLoyaltyProgramTypeId,shopLoyaltyProgramNoOfStages) from ShopLoyaltyProgramEntity W where W.shopId=:shopID and W.shopLoyaltyProgramStatus=1");
		Query query = session.createQuery("from ShopLoyaltyProgramEntity W where W.shopId=:shopID and W.shopLoyaltyProgramStatus=1");

		query.setParameter("shopID",shopId);
		@SuppressWarnings("unchecked")
		List<ShopLoyaltyProgramEntity> shopLoyaltyProgramEntity = query.list();
		session.close();
		//System.out.println("+++++shop loyalty card record+++++"+shopLoyaltyCardEntity.get(0));
		if (shopLoyaltyProgramEntity.size()!=0)
			return shopLoyaltyProgramEntity.get(0);
		else
			return null;
	}

	@Override
	public ShopLoyaltyProgramEntity findById(int shopProgramId) {
		// TODO Auto-generated method stub
		return null;
	}

}
