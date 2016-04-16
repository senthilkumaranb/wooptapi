package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyProgramEntity;


public interface ShopLoyaltyProgramDAO {
	
	public void save(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity);
	
	public List<ShopLoyaltyProgramEntity> list();
	
	public ShopLoyaltyProgramEntity getbyShopId(int shopId);
	
	public ShopLoyaltyProgramEntity findById(int shopProgramId);
	
	public void  delete(int ShopLoyaltyCardId);
	
	public void  updateLoyaltyCard(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity);

}
