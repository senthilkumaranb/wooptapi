package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.CartEntity;
import com.woopt.api.entity.CartItemEntity;

public interface CartDAO {
	
	public CartEntity save(CartEntity cartEntity);
	
	public CartEntity  update(CartEntity cartEntity);
	
	public void  delete(int cartId);
	
	public List<CartEntity> list();
	
	public CartEntity getActiveCartbyConsumerId(int consumerId);
		
	public List<CartEntity> getbyConsumerId(int consumerId);
	
	public CartEntity findById(int cartId);

}
