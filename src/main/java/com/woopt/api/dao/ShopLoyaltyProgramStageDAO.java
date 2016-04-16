package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyProgramStageEntity;

public interface ShopLoyaltyProgramStageDAO {
	
	public void save(ShopLoyaltyProgramStageEntity shopLoyaltyCardStageEntity);
	
	public List<ShopLoyaltyProgramStageEntity> list();
	
	public List<ShopLoyaltyProgramStageEntity> getbyId(int shopLoyaltyProgramId);
	
	public ShopLoyaltyProgramStageEntity findById(long shopStageId);
	
	public void  delete(int ShopLoyaltyCardId);
	
	public void  update(ShopLoyaltyProgramStageEntity shopLoyaltyCardEntity);

}
