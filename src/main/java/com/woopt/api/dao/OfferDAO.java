package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.OfferEntity;


public interface OfferDAO {
	
	public void save(OfferEntity offerEntity);
	
	public void  update(OfferEntity offerEntity);
	
	public void  delete(int offerId);
	
	public List<OfferEntity> list();
	
	public List<OfferEntity> getbyShopId(int shopId);
	
	public OfferEntity findById(int offerId);

}
