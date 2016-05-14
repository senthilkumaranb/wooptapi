package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyProgramEntity;


public interface ShopLoyaltyProgramDAO {
	
	public ShopLoyaltyProgramEntity save(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity);
	
	public ShopLoyaltyProgramEntity  update(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity);
	
	public void  delete(int ShopLoyaltyProgramId);
	
	public List<ShopLoyaltyProgramEntity> list();
	
	public ShopLoyaltyProgramEntity getbyShopId(int shopId);
	
	public ShopLoyaltyProgramEntity findById(int ShopLoyaltyProgramId);
	
}
