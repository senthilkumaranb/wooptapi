package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopEmployee;

public interface ShopEmployeeDAO {
	
	public void save(ShopEmployee shopemployee);
	
	public List<ShopEmployee> list();
	
	public ShopEmployee findById(long shopemployeeId);
	
	public void  delete(int shopemployeeId);
	
	public void  updateShopEmployee(ShopEmployee shopemployee);
}
