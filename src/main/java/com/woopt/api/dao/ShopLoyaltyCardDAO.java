package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyCardEntity;


public interface ShopLoyaltyCardDAO {
	
	public void save(ShopLoyaltyCardEntity shopLoyaltyCardEntity);
	
	public void  update(ShopLoyaltyCardEntity shopLoyaltyCardEntity);
	
	public void  delete(int ShopLoyaltyCardId);
	
	public List<ShopLoyaltyCardEntity> list();
	
	public ShopLoyaltyCardEntity getbyShopId(int shopId);
	
	public ShopLoyaltyCardEntity findById(int shopcardId);

}
