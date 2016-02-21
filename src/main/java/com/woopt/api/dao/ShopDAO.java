package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.Shop;

public interface ShopDAO {
	
	public void save(Shop shop);
	
	public List<Shop> list();
	
	public Shop findById(long shopId);
	
	public void  delete(int shopId);
	
	public void  updateShopDAO(Shop shop);
}
