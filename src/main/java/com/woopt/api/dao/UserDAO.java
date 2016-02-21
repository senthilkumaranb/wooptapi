package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.UserEntity;

public interface UserDAO {

	public void save(UserEntity user);
	
	public List<UserEntity> list();
	
	public UserEntity findById(long userId);
	
	public void  delete(int userId);
	
	public void  updateUser(UserEntity user);
	
	public UserEntity findByMobile(String mobileNo);
}