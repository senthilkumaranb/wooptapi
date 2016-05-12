package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.ShopEmployeeDAO;
import com.woopt.api.entity.ShopBranchEntity;
import com.woopt.api.entity.ShopEmployeeEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class ShopEmployeeDAOImpl implements ShopEmployeeDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public ShopEmployeeEntity save(ShopEmployeeEntity shopEmployee) {
		// TODO Auto-generated method stub
		ShopEmployeeEntity rc = new ShopEmployeeEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(shopEmployee);
		rc = shopEmployee;
		tx.commit();
		session.close();	
		return rc;
	}

	@Override
	public ShopEmployeeEntity update(ShopEmployeeEntity shopEmployee) {
		// TODO Auto-generated method stub
		ShopEmployeeEntity rc = new ShopEmployeeEntity();
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(shopEmployee);
		rc = shopEmployee;
		tx.commit();
		session.close();
		return rc;
	}
	
	@Override
	public void delete(int shopemployeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopEmployeeEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<ShopEmployeeEntity> getEmployeesbyShopId(int shopId){
		//get all shop employees
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopEmployeeEntity W where W.shopId=:shopId");
		query.setParameter("shopId",shopId);
		@SuppressWarnings("unchecked")
		List<ShopEmployeeEntity> shopEmployeesList = query.list();
		session.close();
		return shopEmployeesList;
	}

	@Override
	public ShopEmployeeEntity findById(long shopemployeeId) {
		//get all shop employees
		Session session = this.sessionFactory.openSession();
		//System.out.println("--------++****************-----------" + session);
		Query query = session.createQuery("from ShopEmployee W where W.shopEmployeeId=:shopEmployeeId");
		query.setParameter("shopEmployeeId",shopemployeeId);
		@SuppressWarnings("unchecked")
		List<ShopEmployeeEntity> shopEmployeesList = query.list();
		session.close();
		if (shopEmployeesList.size()!=0)
			return shopEmployeesList.get(0);
		return null;
	}

}
