package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopEntity;
import com.woopt.api.model.UserModel;

public interface ShopDAO {
	
	public void save(ShopEntity shop);
	
	public List<ShopEntity> list();
	
	public List<ShopEntity> list(UserModel userModel);
	
	public List<ShopEntity> getUserShops(int userId);
	
	public ShopEntity findById(long shopId);
	
	public void  delete(int shopId);
	
	public void  updateShopDAO(ShopEntity shop);
	
	public String getShopName(int shopId);
	
	public List<ShopEntity> getShopBranches(int shopId);
	
}
