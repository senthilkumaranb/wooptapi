package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopBranchEntity;

public interface ShopBranchDAO {
	
	public void save(ShopBranchEntity shopbranch);
	
	public List<ShopBranchEntity> list();
	
	public ShopBranchEntity findById(long shopbranchId);
	
	public void  delete(int shopbranchesId);
	
	public void  updateShopBranch(ShopBranchEntity shopbranch);
}
