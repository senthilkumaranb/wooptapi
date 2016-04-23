package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.UserToShopLoyaltyProgramEntity;


public interface UserToShopLoyaltyProgramDAO {
	
	public void save(UserToShopLoyaltyProgramEntity userShopLoyaltyProgramEntity);
	
	public void  update(UserToShopLoyaltyProgramEntity userShopLoyaltyProgramEntity);
	
	public void  delete(int userShopLoyaltyProgramId);
	
	public List<UserToShopLoyaltyProgramEntity> list();
	
	public UserToShopLoyaltyProgramEntity getbyConsumerId(int consumerId);
	
	public UserToShopLoyaltyProgramEntity findById(int userShopLoyaltyProgramId);

}
