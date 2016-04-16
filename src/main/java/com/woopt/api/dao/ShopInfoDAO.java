package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopInfoEntity;

public interface ShopInfoDAO {
	
	public void save(ShopInfoEntity shopinfo);
	
	public void  update(ShopInfoEntity shopinfo);
	
	public void  delete(int shopinfoId);
	
	public List<ShopInfoEntity> list();
	
	public ShopInfoEntity list(int shopId);
	
	public ShopInfoEntity findById(long shopinfoId);

}
