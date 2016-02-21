package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.UserInfo;

public interface UserInfoDAO {

	public void save(UserInfo userinfo);
	
	public List<UserInfo> list();
	
	public UserInfo findById(long userinfoId);
	
	public void  delete(int userinfoId);
	
	public void  updateUserInfo(UserInfo userinfo);
}
