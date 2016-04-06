package com.woopt.api.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.DeviceDAO;
import com.woopt.api.entity.DeviceEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class DeviceDAOImpl implements DeviceDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(DeviceEntity device) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DeviceEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeviceEntity findById(long deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long deviceId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDevice(DeviceEntity device) {
		// TODO Auto-generated method stub
		
	}

}
