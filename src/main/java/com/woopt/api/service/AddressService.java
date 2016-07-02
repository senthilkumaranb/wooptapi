package com.woopt.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woopt.api.common.WooptUtility;
import com.woopt.api.dao.AddressDAO;
import com.woopt.api.entity.AddressEntity;
import com.woopt.api.model.Address;

@Service
public class AddressService {
	
	@Autowired
	AddressDAO addressDAO;
	
	public Address getAddressModelByUserId(int userId){
		AddressEntity addressEntity = addressDAO.findByUserId(userId);
		Address address = WooptUtility.getAddressFromAddressEntity(addressEntity);
		return address;
	}	
}