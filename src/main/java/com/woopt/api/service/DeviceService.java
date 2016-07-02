package com.woopt.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woopt.api.common.WooptUtility;
import com.woopt.api.dao.DeviceDAO;
import com.woopt.api.entity.DeviceEntity;
import com.woopt.api.model.Device;

@Service
public class DeviceService {
	
	@Autowired
	DeviceDAO deviceDAO;
	
	public Device getDeviceModelById(long deviceId){
		DeviceEntity deviceEntity = deviceDAO.findById(deviceId);
		Device device = WooptUtility.getDeviceFromDeviceEntity(deviceEntity);
		return device;
	}
}
