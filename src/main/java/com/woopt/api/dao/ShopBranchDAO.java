package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopBranch;

public interface ShopBranchDAO {
	
	public void save(ShopBranch shopbranch);
	
	public List<ShopBranch> list();
	
	public ShopBranch findById(long shopbranchId);
	
	public void  delete(int shopbranchesId);
	
	public void  updateShopBranch(ShopBranch shopbranch);
}
