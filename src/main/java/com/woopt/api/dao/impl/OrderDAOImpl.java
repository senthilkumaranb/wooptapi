package com.woopt.api.dao.impl;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.OrderDAO;
import com.woopt.api.entity.OfferEntity;
import com.woopt.api.entity.OrderEntity;

public class OrderDAOImpl implements OrderDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public OrderEntity save(OrderEntity orderEntity) {
		// Save Order Entity
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(orderEntity);
		tx.commit();
		session.close();
		
		return orderEntity;
		
	}

	@Override
	public void update(OrderEntity orderEntity) {
		// Update Order Entity
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(orderEntity);
		tx.commit();
		session.close();
	}

	@Override
	public void delete(int orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderEntity> getbyConsumerId(int consumerId) {
		System.out.println("--------+ Order +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OrderEntity W where W.consumerId=:consumerId and W.orderStatus=1");
		query.setParameter("consumerId",consumerId);
		@SuppressWarnings("unchecked")
		List<OrderEntity> orderEntity = query.list();
		session.close();
		return orderEntity;
	}
	
	@Override
	public OrderEntity getActiveOrder(int consumerId) {
		System.out.println("--------+ Order +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OrderEntity W where W.consumerId=:consumerId and W.orderStatus=1");
		query.setParameter("consumerId",consumerId);
		@SuppressWarnings("unchecked")
		List<OrderEntity> orderEntity = query.list();
		session.close();
		if(orderEntity.size()!=0)
			return orderEntity.get(0);
		return null;
	}

	@Override
	public List<OrderEntity> getbyShopId(int shopId) {
		System.out.println("--------+ Order +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OrderEntity W where W.shopId=:shopId and W.orderStatus=1");
		query.setParameter("shopId",shopId);
		@SuppressWarnings("unchecked")
		List<OrderEntity> orderEntity = query.list();
		session.close();
		return orderEntity;
	}

	@Override
	public OrderEntity findById(int orderId) {
		System.out.println("--------+ Order +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from OrderEntity W where W.orderId=:orderId");
		query.setParameter("orderId",orderId);
		@SuppressWarnings("unchecked")
		List<OrderEntity> orderEntity = query.list();
		session.close();
		if(orderEntity.size()!=0)
			return orderEntity.get(0);
		return null;
	}

}
