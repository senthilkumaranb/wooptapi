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

import com.woopt.api.dao.ShopInfoDAO;
import com.woopt.api.entity.ShopEntity;
import com.woopt.api.entity.ShopInfoEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopInfoDAOImpl implements ShopInfoDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopInfoEntity shopinfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopInfoEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopInfoEntity findById(long shopinfoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int shopinfoId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShopInfo(ShopInfoEntity shopinfo) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public ShopInfoEntity list(int shopId) {
		// TODO Auto-generated method stub
		System.out.println("--------++-----------");
		Session session = this.sessionFactory.openSession();
		System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopInfoEntity W where W.shopId=:shopID");
		query.setParameter("shopID",shopId);
		List<ShopInfoEntity> shopInfoList = query.list();
		session.close();
		return shopInfoList.get(0);
	}

}
