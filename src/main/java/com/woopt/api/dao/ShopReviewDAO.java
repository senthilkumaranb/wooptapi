package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ShopReview;

public interface ShopReviewDAO {
	
	public void save(ShopReview shopreview);
	
	public List<ShopReview> list();
	
	public ShopReview findById(long shopreviewId);
	
	public void  delete(int shopreviewId);
	
	public void  updateShopReview(ShopReview shopreview);
}
