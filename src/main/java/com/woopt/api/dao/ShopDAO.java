package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopEntity;

public interface ShopDAO {
	
	public void save(ShopEntity shop);
	
	public List<ShopEntity> list();
	
	public ShopEntity findById(long shopId);
	
	public void  delete(int shopId);
	
	public void  updateShopDAO(ShopEntity shop);
}
