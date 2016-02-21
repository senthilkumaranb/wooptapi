package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopToCategory;

public interface ShopToCategoryDAO {

	public void save(ShopToCategory shoptocategory);
	
	public List<ShopToCategory> list();
	
	public ShopToCategory findById(long shoptocategoryId);
	
	public void  delete(int shoptocategoryId);
	
	public void  updateshoptocategory(ShopToCategory shoptocategory);
}
