package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.DeviceEntity;

public interface DeviceDAO {
	
	public void save(DeviceEntity device);
	
	public List<DeviceEntity> list();
	
	public DeviceEntity findById(long deviceId);
	
	public void  delete(long deviceId);
	
	public void  updateDevice(DeviceEntity device);
}
