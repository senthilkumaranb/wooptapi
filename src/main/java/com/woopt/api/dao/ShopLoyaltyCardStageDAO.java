package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopLoyaltyCardEntity;
import com.woopt.api.entity.ShopLoyaltyCardStageEntity;

public interface ShopLoyaltyCardStageDAO {
	
	public void save(ShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity);
	
	public void  update(ShopLoyaltyCardStageEntity shopLoyaltyCardStageEntity);
	
	public void  delete(int ShopLoyaltyCardId);
	
	public List<ShopLoyaltyCardStageEntity> list();
	
	public List<ShopLoyaltyCardStageEntity> getbyId(int shopLoyaltyCardId);
	
	public ShopLoyaltyCardStageEntity findById(long shopStageId);

}
