package com.woopt.api.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.AddressDAO;
import com.woopt.api.entity.AddressEntity;
import com.woopt.api.entity.ShopEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class AddressDAOImpl implements AddressDAO {
	
	private static final Logger LOGGER = Logger.getLogger(AddressDAOImpl.class.getName());
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(AddressEntity address) {
		LOGGER.info("Inside AddressDAOImpl save method:" + address);
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(address);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AddressEntity> list() {
		Session session = this.sessionFactory.openSession();
		List<AddressEntity> addressList = null;
		try {
			addressList = session.createQuery("from AddressEntity").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return addressList;
	}

	@Override
	public AddressEntity findByAddressId(long addressId) {
		LOGGER.info("Inside findByAddressId - addressId:" + addressId);
		Session session = this.sessionFactory.openSession();
		AddressEntity addressEntity = (AddressEntity) session.load(AddressEntity.class, addressId);
		LOGGER.info("addressEntity:" + addressEntity);
		return addressEntity;
	}

	@Override
	public AddressEntity findByUserId(int userId) {
		LOGGER.info("Inside findByUserId - userid:" + userId);
		AddressEntity addressEntity = null;
		
		try {
			Session session = this.sessionFactory.openSession();
			Query query = session.createQuery("from AddressEntity AE where AE.userId=:userId");
			query.setParameter("userId", userId);
			@SuppressWarnings("unchecked")
			List<AddressEntity> addressEntityList = query.list();
			session.close();
			LOGGER.info("addressEntityList:" + addressEntityList);
			
			if (null != addressEntityList && addressEntityList.size() != 0){
				LOGGER.info("addressEntityList.size():" + addressEntityList.size());
				return addressEntityList.get(0);
			}
		} catch (Exception e) {
			System.out.println(">>>>>>>>>>>" + e.getMessage());
		}
		return addressEntity;
	}
	
	@Override
	public AddressEntity findByShopId(long shopId) {
		LOGGER.info("Inside findByShopId - shopId:" + shopId);
		Session session = this.sessionFactory.openSession();
		AddressEntity addressEntity = (AddressEntity) session.load(AddressEntity.class, shopId);
		LOGGER.info("addressEntity:" + addressEntity);
		return addressEntity;
	}

	@Override
	public void delete(long addressId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			AddressEntity addressEntity = (AddressEntity)session.load(AddressEntity.class, addressId);
			session.delete(addressEntity);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}
	}

	@Override
	public void updateAddress(AddressEntity addressEntity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = this.sessionFactory.openSession();
			tx = session.beginTransaction();
			if (null != addressEntity && null != tx) {
				session.update(addressEntity);
				tx.commit();
			}
		} catch (Exception e) {
			if (null != tx) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
}
