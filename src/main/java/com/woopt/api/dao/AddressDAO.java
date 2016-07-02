package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.AddressEntity;

public interface AddressDAO {

	public void save(AddressEntity address);
	
	public List<AddressEntity> list();
	
	public AddressEntity findByAddressId(long addressId);
	
	public AddressEntity findByUserId(int userid);
	
	public AddressEntity findByShopId(long shopId);
	
	public void  delete(long id);
	
	public void  updateAddress(AddressEntity address);
}
