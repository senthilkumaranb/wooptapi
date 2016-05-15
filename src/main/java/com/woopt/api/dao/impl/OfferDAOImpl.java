package com.woopt.api.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.OfferDAO;
import com.woopt.api.entity.OfferEntity;
import com.woopt.api.entity.ShopLoyaltyProgramEntity;


public class OfferDAOImpl implements OfferDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(OfferEntity offerEntity) {
		// TODO Auto-generated method stub
		try{
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(offerEntity);
			tx.commit();
			session.close();
		}
		catch (Exception e){
			System.out.println("----Exception offer save ---" + e.getMessage());
		}
		
	}
	
	@Override
	public void update(OfferEntity offerEntity) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(offerEntity);
		tx.commit();
		session.close();
		
	}
	
	@Override
	public void delete(int offerId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<OfferEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OfferEntity> getbyShopId(int shopId) {
		System.out.println("--------+ ShopOffers +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OfferEntity W where W.shopId=:shopID and W.offerStatus=1");
		query.setParameter("shopID",shopId);
		@SuppressWarnings("unchecked")
		List<OfferEntity> offerEntity = query.list();
		session.close();
		return offerEntity;

	}

	@Override
	public OfferEntity findById(int offerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
