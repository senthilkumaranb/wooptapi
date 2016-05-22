package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.woopt.api.dao.DeviceDAO;
import com.woopt.api.entity.DeviceEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
@SuppressWarnings("unchecked")
public class DeviceDAOImpl implements DeviceDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(DeviceEntity device) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(device);
		tx.commit();
		session.close();
	}

	@Override
	public List<DeviceEntity> list() {
		Session session = this.sessionFactory.openSession();
		List<DeviceEntity> deviceList = session.createQuery("from DeviceEntity").list();
		session.close();
		return deviceList;
	}

	@Override
	public DeviceEntity findById(long deviceId) {
		Session session = this.sessionFactory.openSession();
		//TODO Change query to directly search Device by Id.
		List<DeviceEntity> deviceList = session.createQuery("from DeviceEntity").list();
		session.close();
		for (DeviceEntity device : deviceList) {
			if (device.getDeviceId() == deviceId) {
				return device;
			}
		}
		return null;
	}
	
	@Override
	public DeviceEntity findByUserId(long userId) {
		Session session = this.sessionFactory.openSession();
		//TODO Change query to directly search Device by Id.
		List<DeviceEntity> deviceList = session.createQuery("from DeviceEntity").list();
		session.close();
		for (DeviceEntity device : deviceList) {
			if (device.getUserId() == userId) {
				return device;
			}
		}
		return null;
	}

	@Override
	public void delete(long deviceId) {
		Transaction transaction = null;
		Session session = this.sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			DeviceEntity device = (DeviceEntity) session.load(DeviceEntity.class, deviceId);
			session.delete(device);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void updateDevice(DeviceEntity device) {
		Transaction transaction = null;
		Session session = this.sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.update(device);
			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}