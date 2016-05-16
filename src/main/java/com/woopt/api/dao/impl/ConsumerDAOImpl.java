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

import com.woopt.api.dao.ConsumerDAO;
import com.woopt.api.entity.ConsumerEntity;
import com.woopt.api.entity.ShopEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Senthil
 *
 */
public class ConsumerDAOImpl implements ConsumerDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public int save(ConsumerEntity consumer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(ConsumerEntity consumer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int consumerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ConsumerEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConsumerEntity> getFavShops(int userId) {
		System.out.println("--------+ ConsumerEntity +-----------");
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from ConsumerEntity W where W.userId=:userId Order by W.shopId");
		query.setParameter("userId",userId);
		List<ConsumerEntity> consumerList = query.list();
		session.close();
		return consumerList;
	}

	@Override
	public List<ConsumerEntity> getShopConsumers(int shopId) {
		System.out.println("--------+ ConsumerEntity +-----------");
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from ConsumerEntity W where W.shopId=:shopId");
		query.setParameter("shopId",shopId);
		List<ConsumerEntity> consumerList = query.list();
		session.close();
		return consumerList;
	}

	@Override
	public ConsumerEntity findById(int consumerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
