package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.OfferEntity;


public interface OfferDAO {
	
	public void save(OfferEntity offerEntity);
	
	public List<OfferEntity> list();
	
	public List<OfferEntity> getbyShopId(int shopId);
	
	public OfferEntity findById(int offerId);
	
	public void  delete(int offerId);
	
	public void  update(OfferEntity offerId);

}
