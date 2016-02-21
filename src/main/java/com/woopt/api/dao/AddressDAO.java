package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.AddressEntity;

public interface AddressDAO {

	public void save(AddressEntity address);
	
	public List<AddressEntity> list();
	
	public AddressEntity findById(long id);
	
	public void  delete(long id);
	
	public void  updateAddress(AddressEntity address);
}
