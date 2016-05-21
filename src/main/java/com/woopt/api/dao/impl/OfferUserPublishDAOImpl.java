package com.woopt.api.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.OfferUserPublishDAO;
import com.woopt.api.entity.OfferEntity;
import com.woopt.api.entity.OfferUserPublishEntity;

public class OfferUserPublishDAOImpl implements OfferUserPublishDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public OfferUserPublishEntity save(OfferUserPublishEntity offerUserPublishEntity) {
		OfferUserPublishEntity rc = new OfferUserPublishEntity();
		try{
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(offerUserPublishEntity);
			rc = offerUserPublishEntity;
			tx.commit();
			session.close();
			return rc;
		}
		catch (Exception e){
			System.out.println("----Exception offer publish save ---" + e.getMessage());
			return null;
		}
	}

	@Override
	public OfferUserPublishEntity update(OfferUserPublishEntity offerUserPublishEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int offerUserPublishId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OfferUserPublishEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OfferUserPublishEntity> getbyOfferId(int offerId) {
		System.out.println("--------+ PublishedOffer +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OfferUserPublishEntity W where W.offerId=:offerId and W.offer_user_publish_status=1 ORDER BY offerId, shopId");
		query.setParameter("offerId",offerId);
		@SuppressWarnings("unchecked")
		List<OfferUserPublishEntity> offerUserPublishEntity = query.list();
		session.close();
		return offerUserPublishEntity;
	}

	@Override
	public List<OfferUserPublishEntity> getbyUserId(int userId) {
		System.out.println("--------+ PublishedOffer +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OfferUserPublishEntity W where W.userId=:userId and W.offer_user_publish_status=1 ORDER BY userId, offerId");
		query.setParameter("userId",userId);
		@SuppressWarnings("unchecked")
		List<OfferUserPublishEntity> offerUserPublishEntity = query.list();
		session.close();
		return offerUserPublishEntity;
	}

	@Override
	public List<OfferUserPublishEntity> getbyShopId(int shopId) {
		System.out.println("--------+ PublishedOffer +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OfferUserPublishEntity W where W.offerId in (SELECT offerId in OfferEntity O where O.shopId=:shopId) ORDER BY offerId");
		query.setParameter("shopId",shopId);
		@SuppressWarnings("unchecked")
		List<OfferUserPublishEntity> offerUserPublishEntity = query.list();
		session.close();
		return offerUserPublishEntity;
	}

	@Override
	public List<OfferUserPublishEntity> getPublishedShopOffersbyUserId(int userId, int shopId) {
		System.out.println("--------+ PublishedOffer +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OfferUserPublishEntity W where W.offerId in (SELECT O.offerId from OfferEntity O where O.shopId=:shopId) AND W.userId=:userId ORDER BY userId");
		query.setParameter("shopId",shopId);
		query.setParameter("userId",userId);
		@SuppressWarnings("unchecked")
		List<OfferUserPublishEntity> offerUserPublishEntity = query.list();
		session.close();
		return offerUserPublishEntity;
	}
	
	@Override
	public OfferUserPublishEntity findById(int offerUserPublishId) {
		// TODO Auto-generated method stub
		return null;
	}

}
