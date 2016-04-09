package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopReviewEntity;

public interface ShopReviewDAO {
	
	public void save(ShopReviewEntity shopreview);
	
	public List<ShopReviewEntity> list();
	
	public List<ShopReviewEntity> list(int shopId);
	
	public ShopReviewEntity findById(long shopreviewId);
	
	public void  delete(int shopreviewId);
	
	public void  updateShopReview(ShopReviewEntity shopreview);
}
