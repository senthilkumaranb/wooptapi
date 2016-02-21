package com.woopt.api.dao;

import java.util.List;

import com.woopt.api.entity.Device;

public interface DeviceDAO {
	
	public void save(Device device);
	
	public List<Device> list();
	
	public Device findById(long deviceId);
	
	public void  delete(long deviceId);
	
	public void  updateDevice(Device device);
}
