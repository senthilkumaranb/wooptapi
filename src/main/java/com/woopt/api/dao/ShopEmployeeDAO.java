package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopEmployeeEntity;

public interface ShopEmployeeDAO {
	
	public void save(ShopEmployeeEntity shopemployee);
	
	public void  update(ShopEmployeeEntity shopemployee);
	
	public void  delete(int shopemployeeId);
	
	public List<ShopEmployeeEntity> list();
	
	public ShopEmployeeEntity findById(long shopemployeeId);

}
