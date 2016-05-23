package com.woopt.api.dao.impl;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.CartItemDAO;
import com.woopt.api.entity.CartEntity;
import com.woopt.api.entity.CartItemEntity;

public class CartItemDAOImpl implements CartItemDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public CartItemEntity save(CartItemEntity cartItemEntity) {
		// Save Cart Item Entity
		CartItemEntity rc = new CartItemEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(cartItemEntity);
		rc=cartItemEntity;
		tx.commit();
		session.close();
		
		return rc;
		
	}

	@Override
	public CartItemEntity update(CartItemEntity cartItemEntity) {
		// Update Cart Item Entity
		CartItemEntity rc = new CartItemEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(cartItemEntity);
		rc=cartItemEntity;
		tx.commit();
		session.close();
		
		return rc;
		
	}

	@Override
	public void delete(int cartItemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CartItemEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartItemEntity> getbyCartId(int cartId) {
		System.out.println("--------+ CartItems +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from CartItemEntity W where W.cartId=:cartId and W.cartItemStatus=1");
		query.setParameter("cartId",cartId);
		@SuppressWarnings("unchecked")
		List<CartItemEntity> cartItemEntity = query.list();
		session.close();
		return cartItemEntity;
	}

	@Override
	public CartItemEntity findbyId(int cartItemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
