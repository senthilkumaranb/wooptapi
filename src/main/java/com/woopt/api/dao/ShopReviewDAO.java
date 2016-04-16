package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopReviewEntity;

public interface ShopReviewDAO {
	
	public void save(ShopReviewEntity shopReview);
	
	public void update(ShopReviewEntity shopReview);
	
	public void delete(int shopReviewId);

	public List<ShopReviewEntity> list();
	
	public List<ShopReviewEntity> list(int shopId);
	
	public ShopReviewEntity findById(int shopReviewId);

}
