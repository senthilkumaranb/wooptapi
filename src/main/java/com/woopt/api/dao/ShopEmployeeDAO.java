package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopEmployeeEntity;

public interface ShopEmployeeDAO {
	
	public void save(ShopEmployeeEntity shopemployee);
	
	public List<ShopEmployeeEntity> list();
	
	public ShopEmployeeEntity findById(long shopemployeeId);
	
	public void  delete(int shopemployeeId);
	
	public void  updateShopEmployee(ShopEmployeeEntity shopemployee);
}
