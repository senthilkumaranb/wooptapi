package com.woopt.api.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woopt.api.dao.UserDAO;
import com.woopt.api.entity.User;

/**
 * DAO Implementation
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
@Service("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(user);
		tx.commit();
		session.close();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> list() {
		System.out.println("--------++-----------");
		Session session = this.sessionFactory.openSession();
		System.out.println("--------++****************-----------" + session);
		List<User> userList = session.createQuery("from WOOPT_USER").list();
		System.out.println("-------------------" + userList);
		session.close();
		return userList;
	}

	@Override
	@SuppressWarnings("unchecked")
	public User findById(long id) {
		Session session = this.sessionFactory.openSession();
		List<User> userList = session.createQuery("from WOOPT_USER").list();
		session.close();
		for (User user : userList) {
			if (user.getUserId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void delete(int id) {
		Transaction transaction = null;
		Session session = this.sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			User user = (User) session.load(User.class, new Integer(id));
			session.delete(user);
			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateUser(User user) {
		Transaction transaction = null;
		Session session = this.sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}

}
