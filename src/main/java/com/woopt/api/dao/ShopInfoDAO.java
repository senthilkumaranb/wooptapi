package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopInfo;

public interface ShopInfoDAO {
	
	public void save(ShopInfo shopinfo);
	
	public List<ShopInfo> list();
	
	public ShopInfo findById(long shopinfoId);
	
	public void  delete(int shopinfoId);
	
	public void  updateShopInfo(ShopInfo shopinfo);
}
