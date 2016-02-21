package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopInfoEntity;

public interface ShopInfoDAO {
	
	public void save(ShopInfoEntity shopinfo);
	
	public List<ShopInfoEntity> list();
	
	public ShopInfoEntity findById(long shopinfoId);
	
	public void  delete(int shopinfoId);
	
	public void  updateShopInfo(ShopInfoEntity shopinfo);
}
