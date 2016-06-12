package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.UserToShopLoyaltyCardStageEntity;

public interface UserToShopLoyaltyCardStageDAO {
	
	public void save(UserToShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity);
	
	public UserToShopLoyaltyCardStageEntity  update(UserToShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity);
	
	public void  delete(int userShopLoyaltyCardStageId);
	
	public List<UserToShopLoyaltyCardStageEntity> list();
	
	public List<UserToShopLoyaltyCardStageEntity> getbyCardId(int userShopLoyaltyCardId);
	
	public UserToShopLoyaltyCardStageEntity findById(int userShopLoyaltyCardStageId);

}
