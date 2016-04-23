package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.UserToShopLoyaltyCardEntity;


public interface UserToShopLoyaltyCardDAO {
	
	public void save(UserToShopLoyaltyCardEntity userShopLoyaltyCardEntity);
	
	public void  update(UserToShopLoyaltyCardEntity userShopLoyaltyCardEntity);
	
	public void  delete(int userShopLoyaltyCardId);
	
	public List<UserToShopLoyaltyCardEntity> list();
	
	public UserToShopLoyaltyCardEntity getbyConsumerId(int consumerId);
	
	public UserToShopLoyaltyCardEntity findById(int userShopLoyaltyCardId);

}
