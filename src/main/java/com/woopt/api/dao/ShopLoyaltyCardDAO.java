package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyCardEntity;


public interface ShopLoyaltyCardDAO {
	
	public void save(ShopLoyaltyCardEntity shopLoyaltyCardEntity);
	
	public List<ShopLoyaltyCardEntity> list();
	
	public ShopLoyaltyCardEntity findById(long shopId);
	
	public void  delete(int ShopLoyaltyCardId);
	
	public void  updateLoyaltyCard(ShopLoyaltyCardEntity shopLoyaltyCardEntity);

}
