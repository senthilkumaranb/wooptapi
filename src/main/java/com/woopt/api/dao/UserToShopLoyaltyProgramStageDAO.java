package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.UserToShopLoyaltyProgramStageEntity;


public interface UserToShopLoyaltyProgramStageDAO {
	
	public void save(UserToShopLoyaltyProgramStageEntity userShopLoyaltyProgramStageEntity);
	
	public void  update(UserToShopLoyaltyProgramStageEntity userShopLoyaltyProgramStageEntity);
	
	public void  delete(int userShopLoyaltyProgramStageId);
	
	public List<UserToShopLoyaltyProgramStageEntity> list();
	
	public List<UserToShopLoyaltyProgramStageEntity> getbyCardId(int userShopLoyaltyProgramId);
	
	public UserToShopLoyaltyProgramStageEntity findById(int userShopLoyaltyProgramStageId);

}
