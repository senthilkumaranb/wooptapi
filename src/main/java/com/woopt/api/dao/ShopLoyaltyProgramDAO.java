package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyProgramEntity;


public interface ShopLoyaltyProgramDAO {
	
	public void save(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity);
	
	public void  update(ShopLoyaltyProgramEntity shopLoyaltyProgramEntity);
	
	public void  delete(int ShopLoyaltyProgramId);
	
	public List<ShopLoyaltyProgramEntity> list();
	
	public ShopLoyaltyProgramEntity getbyShopId(int shopId);
	
	public ShopLoyaltyProgramEntity findById(int ShopLoyaltyProgramId);
	
}
