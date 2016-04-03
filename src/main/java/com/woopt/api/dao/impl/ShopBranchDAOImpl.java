package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.woopt.api.dao.ShopBranchDAO;
import com.woopt.api.entity.ShopBranchEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopBranchDAOImpl implements ShopBranchDAO {

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

}
