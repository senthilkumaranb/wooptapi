package com.woopt.api.dao.impl;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.CartDAO;
import com.woopt.api.entity.CartEntity;

public class CartDAOImpl implements CartDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public CartEntity save(CartEntity cartEntity) {
		// Save Cart Entity
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(cartEntity);
		tx.commit();
		session.close();
		return cartEntity;
		
	}

	@Override
	public void update(CartEntity cartEntity) {
		// Update Cart Entity
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(cartEntity);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(int cartId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CartEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartEntity getActiveCartbyConsumerId(int consumerId) {
		System.out.println("--------+ Order +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from CartEntity W where W.consumerId=:consumerId and W.cartStatus=1");
		query.setParameter("consumerId",consumerId);
		@SuppressWarnings("unchecked")
		List<CartEntity> cartEntity = query.list();
		session.close();
		if(cartEntity.size()!=0)
			return cartEntity.get(0);
		return null;
	}

	@Override
	public List<CartEntity> getbyConsumerId(int consumerId) {
		System.out.println("--------+ Order +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from CartEntity W where W.consumerId=:consumerId and W.cartStatus=1");
		query.setParameter("consumerId",consumerId);
		@SuppressWarnings("unchecked")
		List<CartEntity> cartEntity = query.list();
		session.close();
		return cartEntity;
	}

	@Override
	public CartEntity findById(int cartId) {
		System.out.println("--------+ Cart +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from CartEntity W where W.cartId=:cartId");
		query.setParameter("cartId",cartId);
		@SuppressWarnings("unchecked")
		List<CartEntity> cartEntity = query.list();
		session.close();
		if(cartEntity.size()!=0)
			return cartEntity.get(0);
		return null;
	}

}
