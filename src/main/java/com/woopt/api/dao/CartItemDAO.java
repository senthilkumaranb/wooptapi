package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.CartItemEntity;


public interface CartItemDAO {
	
	public CartItemEntity save(CartItemEntity cartItemEntity);
	
	public void  update(CartItemEntity cartItemEntity);
	
	public void  delete(int cartItemId);
	
	public List<CartItemEntity> list();
	
	public List<CartItemEntity> getbyCartId(int cartId);
	
	public CartItemEntity findbyId(int cartItemId);

}
