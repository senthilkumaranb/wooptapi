package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopToCategoryEntity;

public interface ShopToCategoryDAO {

	public void save(ShopToCategoryEntity shoptocategory);
	
	public List<ShopToCategoryEntity> list();
	
	public ShopToCategoryEntity findById(long shoptocategoryId);
	
	public void  delete(int shoptocategoryId);
	
	public void  updateshoptocategory(ShopToCategoryEntity shoptocategory);
}
