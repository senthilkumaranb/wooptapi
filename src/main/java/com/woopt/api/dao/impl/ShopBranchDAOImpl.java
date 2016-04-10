package com.woopt.api.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.ShopBranchDAO;
import com.woopt.api.entity.ShopBranchEntity;
import com.woopt.api.entity.ShopEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopBranchDAOImpl implements ShopBranchDAO {

	private static final Logger LOGGER = Logger.getLogger(UserDAOImpl.class.getName());
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(ShopBranchEntity shopbranch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopBranchEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopBranchEntity findById(long shopBranchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int shopbranchesId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateShopBranch(ShopBranchEntity shopbranch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopBranchEntity> list(int shopId) {
		// TODO Auto-generated method stub
		System.out.println("--------++-----------");
		Session session = this.sessionFactory.openSession();
		System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopBranchEntity W where W.shopId=:shopID");
		query.setParameter("shopID",shopId);
		@SuppressWarnings("unchecked")
		List<ShopBranchEntity> shopBranchesList = query.list();
		session.close();
		return shopBranchesList;
	}

}
