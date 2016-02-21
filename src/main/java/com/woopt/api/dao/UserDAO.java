package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.User;

public interface UserDAO {

	public void save(User user);
	
	public List<User> list();
	
	public User findById(long userId);
	
	public void  delete(int userId);
	
	public void  updateUser(User user);
}