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

import com.woopt.api.dao.ShopDAO;
import com.woopt.api.entity.ShopEntity;
import com.woopt.api.entity.UserInfoEntity;
import com.woopt.api.model.UserModel;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopDAOImpl implements ShopDAO {

	private static final Logger LOGGER = Logger.getLogger(UserDAOImpl.class.getName());
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopEntity shop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopEntity findById(int shopId) {
		// TODO Auto-generated method stub
		System.out.println("--------++-----------");
		Session session = this.sessionFactory.openSession();
		System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopEntity W where W.shopId=:shopID");
		query.setParameter("shopID",shopId);
		@SuppressWarnings("unchecked")
		List<ShopEntity> shopEntity = query.list();
		session.close();
		return shopEntity.get(0);
	}

	@Override
	public void delete(int shopId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShopDAO(ShopEntity shop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopEntity> list(UserModel userModel) {
		// TODO Auto-generated method stub
		System.out.println("--------++-----------");
		Session session = this.sessionFactory.openSession();
		System.out.println("--------++****************-----------" + session);
		List<ShopEntity> shopList = session.createQuery("from WOOPT_SHOP").list();
		System.out.println("-------------------" + shopList);
		session.close();
		return shopList;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ShopEntity> getUserShops(int userId) {
		// TODO Auto-generated method stub

		System.out.println("--------+ getUserShops +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++*******getUserShops*********-----------" + session);
		Query query = session.createQuery("from ShopEntity W where W.shopProprietorId=:userID");
		query.setParameter("userID",userId);
		List<ShopEntity> shopList = query.list();
		session.close();
		return shopList;
	}
	
	//@SuppressWarnings("unchecked")
	@Override
	public List<ShopEntity> getShopBranches(int shopId) {
		// TODO Auto-generated method stub

		System.out.println("--------+ getShopBranches +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopEntity W where W.shopParentId=:shopID and W.shopIsparent=0");
		query.setParameter("shopID",shopId);
		List<ShopEntity> shopList = query.list();
		session.close();
		return shopList;

	}

	@Override
	public String getShopName(int shopId) {
		// TODO Auto-generated method stub
		System.out.println("--------+ getShopName +-----------");
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from WOOPT_SHOP W where W.shop_id=:shopId");
		query.setInteger(shopId, shopId);
		List result = query.list();
		String shopName=null;
        Iterator iterator = result.iterator();
        while(iterator.hasNext()){
            shopName = (String) iterator.next();
        }
            
		session.close();
		return shopName;
	}

}
