package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyProgramStageEntity;

public interface ShopLoyaltyProgramStageDAO {
	
	public ShopLoyaltyProgramStageEntity save(ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity);
	
	public ShopLoyaltyProgramStageEntity update(ShopLoyaltyProgramStageEntity oldE, ShopLoyaltyProgramStageEntity shopLoyaltyProgramStageEntity);
	
	public void delete(int ShopLoyaltyProgramId);
	
	public List<ShopLoyaltyProgramStageEntity> list();
	
	public List<ShopLoyaltyProgramStageEntity> getbyProgramId(int shopLoyaltyProgramId);
	
	public ShopLoyaltyProgramStageEntity findById(int shopStageId);

}
