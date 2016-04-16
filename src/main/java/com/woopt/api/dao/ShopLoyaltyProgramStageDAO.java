package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyProgramStageEntity;

public interface ShopLoyaltyProgramStageDAO {
	
	public void save(ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity);
	
	public void update(ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity);
	
	public void delete(int ShopLoyaltyProgramId);
	
	public List<ShopLoyaltyProgramStageEntity> list();
	
	public List<ShopLoyaltyProgramStageEntity> getbyId(int shopLoyaltyProgramId);
	
	public ShopLoyaltyProgramStageEntity findById(long shopStageId);

}
