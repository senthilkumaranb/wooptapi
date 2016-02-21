package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.Address;

public interface AddressDAO {

	public void save(Address address);
	
	public List<Address> list();
	
	public Address findById(long id);
	
	public void  delete(long id);
	
	public void  updateAddress(Address address);
}
