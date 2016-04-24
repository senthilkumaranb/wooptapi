package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopToCategoryEntity;

public interface ShopToCategoryDAO {

	public void save(ShopToCategoryEntity shoptoCategory);
	
	public void update(ShopToCategoryEntity shoptoCategory);
	
	public void delete(int shoptoCategoryId);
	
	public List<ShopToCategoryEntity> list();
	
	public ShopToCategoryEntity findById(int shoptocategoryId);

}
