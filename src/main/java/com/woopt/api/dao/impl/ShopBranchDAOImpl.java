package com.woopt.api.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.ShopBranchDAO;
import com.woopt.api.entity.ShopBranchEntity;

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
	public ShopBranchEntity findById(long shopbranchId) {
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
		return null;
	}

}
