package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.OrderEntity;


public interface OrderDAO {
	
	public OrderEntity save(OrderEntity orderEntity);
	
	public void  update(OrderEntity orderEntity);
	
	public void  delete(int orderId);
	
	public List<OrderEntity> list();
	
	public List<OrderEntity> getbyConsumerId(int consumerId);
	
	public OrderEntity getActiveOrder(int consumerId);
	
	public List<OrderEntity> getbyShopId(int shopId);
	
	public OrderEntity findById(int orderId);

}
