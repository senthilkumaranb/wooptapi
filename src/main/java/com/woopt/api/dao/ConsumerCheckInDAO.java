package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.ConsumerCheckInEntity;

public interface ConsumerCheckInDAO {
	
	public ConsumerCheckInEntity save(ConsumerCheckInEntity consumerCheckInEntity);
	
	public ConsumerCheckInEntity  update(ConsumerCheckInEntity consumerCheckInEntity);
	
	public void  delete(int consumerCheckInEntityId);
	
	public List<ConsumerCheckInEntity> list();
	
	public ConsumerCheckInEntity getConsumerCheckInbyUser(int consumerId);
	
	public ConsumerCheckInEntity getConsumerCheckInbyShop(int shopId);
	
	public ConsumerCheckInEntity findById(int consumerCheckInEntityId);

}
