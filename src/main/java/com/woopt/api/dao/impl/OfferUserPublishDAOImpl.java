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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OfferUserPublishEntity> getbyUserId(int shopId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OfferUserPublishEntity findById(int offerUserPublishId) {
		// TODO Auto-generated method stub
		return null;
	}

}
