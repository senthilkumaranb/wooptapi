package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ConsumerEntity;

public interface ConsumerDAO {
	
	public int save(ConsumerEntity consumer);
		
	public void  update(ConsumerEntity consumer);
	
	public void  delete(int consumerId);
	
	public List<ConsumerEntity> list();
	
	public List<ConsumerEntity> getFavShops(int userId);
	
	public List<ConsumerEntity> getShopConsumers(int shopId);
	
	public ConsumerEntity findById(int consumerId);
	
}
