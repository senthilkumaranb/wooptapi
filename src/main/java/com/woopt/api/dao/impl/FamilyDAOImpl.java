package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.woopt.api.dao.FamilyDAO;
import com.woopt.api.entity.FamilyEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class FamilyDAOImpl implements FamilyDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(FamilyEntity family) {
		
	}

	@Override
	public List<FamilyEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FamilyEntity findById(long familyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long familyId) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateFamily(FamilyEntity family) {
		// TODO Auto-generated method stub
	}

}
