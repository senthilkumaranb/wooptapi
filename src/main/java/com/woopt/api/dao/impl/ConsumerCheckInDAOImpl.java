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

import com.woopt.api.common.WooptCode;
import com.woopt.api.dao.ConsumerCheckInDAO;
import com.woopt.api.entity.ConsumerCheckInEntity;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
public class ConsumerCheckInDAOImpl implements ConsumerCheckInDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ConsumerCheckInEntity save(ConsumerCheckInEntity consumerCheckInEntity) {
		ConsumerCheckInEntity rc = new ConsumerCheckInEntity();
		try{
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(consumerCheckInEntity);
			rc = consumerCheckInEntity;
			tx.commit();
			session.close();
			return consumerCheckInEntity;
		}
		catch (Exception e){
			System.out.println("----Exception offer save ---" + e.getMessage());
			return null;
		}
	}

	@Override
	public ConsumerCheckInEntity update(ConsumerCheckInEntity consumerCheckInEntity) {
		ConsumerCheckInEntity rc = new ConsumerCheckInEntity();
		try{
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(consumerCheckInEntity);
			rc = consumerCheckInEntity;
			tx.commit();
			session.close();
			return consumerCheckInEntity;
		}
		catch (Exception e){
			System.out.println("----Exception offer save ---" + e.getMessage());
			return null;
		}
	}

	@Override
	public void delete(int consumerCheckInEntityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ConsumerCheckInEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsumerCheckInEntity getConsumerCheckInbyUser(int consumerId) {
		System.out.println("--------+ ConsumerCheckInEntity +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ConsumerCheckInEntity W where W.consumerId=:consumerId and W.consumerCheckInStatus=:consumerCheckInStatus");
		query.setParameter("consumerId",consumerId);
		query.setParameter("consumerCheckInStatus",WooptCode.USER_CHECKIN_STATUS_ACTIVE);
		@SuppressWarnings("unchecked")
		List<ConsumerCheckInEntity> consumerCheckInEntity = query.list();
		session.close();
		if (consumerCheckInEntity.size()!=0)
			return consumerCheckInEntity.get(0);
		return null;
	}

	@Override
	public ConsumerCheckInEntity getConsumerCheckInbyShop(int shopId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsumerCheckInEntity findById(int consumerCheckInEntityId) {
		// TODO Auto-generated method stub
		return null;
	}

}
