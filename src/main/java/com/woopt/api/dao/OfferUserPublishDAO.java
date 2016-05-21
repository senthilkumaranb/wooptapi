package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.OfferUserPublishEntity;

public interface OfferUserPublishDAO {
	
	public OfferUserPublishEntity save(OfferUserPublishEntity offerUserPublishEntity);
	
	public OfferUserPublishEntity  update(OfferUserPublishEntity offerUserPublishEntity);
	
	public void  delete(int offerUserPublishId);
	
	public List<OfferUserPublishEntity> list();
	
	public List<OfferUserPublishEntity> getbyOfferId(int offerId);
	
	public List<OfferUserPublishEntity> getbyUserId(int userId);
	
	public List<OfferUserPublishEntity> getbyShopId(int shopId);
	
	public List<OfferUserPublishEntity> getPublishedShopOffersbyUserId(int userId, int shopId);
	
	public OfferUserPublishEntity findById(int offerUserPublishId);

}
