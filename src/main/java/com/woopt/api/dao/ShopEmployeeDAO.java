package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopEmployeeEntity;

public interface ShopEmployeeDAO {
	
	public ShopEmployeeEntity save(ShopEmployeeEntity shopemployee);
	
	public ShopEmployeeEntity  update(ShopEmployeeEntity shopemployee);
	
	public void  delete(int shopemployeeId);
	
	public List<ShopEmployeeEntity> list();
	
	public List<ShopEmployeeEntity> getEmployeesbyShopId(int shopId);
	
	public ShopEmployeeEntity findById(long shopemployeeId);

}
