package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.UserInfoDAO;
import com.woopt.api.entity.UserInfoEntity;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
@Service("userInfoDAO")
@Transactional
public class UserInfoDAOImpl implements UserInfoDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(UserInfoEntity userinfo) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(userinfo);
		tx.commit();
		session.close();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UserInfoEntity> list() {
		System.out.println("--------++-----------");
		Session session = this.sessionFactory.openSession();
		System.out.println("--------++****************-----------" + session);
		List<UserInfoEntity> userInfoList = session.createQuery("from WOOPT_USER_INFO").list();
		System.out.println("-------------------" + userInfoList);
		session.close();
		return userInfoList;
	}

	@Override
	public UserInfoEntity findById(int userinfoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int userinfoId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserInfo(UserInfoEntity userinfo) {
		// TODO Auto-generated method stub
		
	}

}
