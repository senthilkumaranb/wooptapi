package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.UserInfoEntity;

public interface UserInfoDAO {

	public void save(UserInfoEntity userinfo);
	
	public List<UserInfoEntity> list();
	
	public UserInfoEntity findById(int userinfoId);
	
	public void  delete(int userinfoId);
	
	public void  updateUserInfo(UserInfoEntity userinfo);
}
