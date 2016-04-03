package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.woopt.api.dao.ShopInfoDAO;
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

}
