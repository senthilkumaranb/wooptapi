package com.woopt.api.model;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
public class Device {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	private int deviceId;
	private String deviceImei;
	private String deviceMac;
	private String deviceSerialNo;
	private int deviceStatus;
	private String deviceToken;
	private String devicePhone;

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceImei() {
		return deviceImei;
	}

	public void setDeviceImei(String deviceImei) {
		this.deviceImei = deviceImei;
	}

	public String getDeviceMac() {
		return deviceMac;
	}

	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}

	public String getDeviceSerialNo() {
		return deviceSerialNo;
	}

	public void setDeviceSerialNo(String deviceSerialNo) {
		this.deviceSerialNo = deviceSerialNo;
	}

	public int getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(int deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getDevicePhone() {
		return devicePhone;
	}

	public void setDevicePhone(String devicePhone) {
		this.devicePhone = devicePhone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deviceId;
		result = prime * result + ((deviceImei == null) ? 0 : deviceImei.hashCode());
		result = prime * result + ((deviceMac == null) ? 0 : deviceMac.hashCode());
		result = prime * result + ((devicePhone == null) ? 0 : devicePhone.hashCode());
		result = prime * result + ((deviceSerialNo == null) ? 0 : deviceSerialNo.hashCode());
		result = prime * result + deviceStatus;
		result = prime * result + ((deviceToken == null) ? 0 : deviceToken.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (deviceId != other.deviceId)
			return false;
		if (deviceImei == null) {
			if (other.deviceImei != null)
				return false;
		} else if (!deviceImei.equals(other.deviceImei))
			return false;
		if (deviceMac == null) {
			if (other.deviceMac != null)
				return false;
		} else if (!deviceMac.equals(other.deviceMac))
			return false;
		if (devicePhone == null) {
			if (other.devicePhone != null)
				return false;
		} else if (!devicePhone.equals(other.devicePhone))
			return false;
		if (deviceSerialNo == null) {
			if (other.deviceSerialNo != null)
				return false;
		} else if (!deviceSerialNo.equals(other.deviceSerialNo))
			return false;
		if (deviceStatus != other.deviceStatus)
			return false;
		if (deviceToken == null) {
			if (other.deviceToken != null)
				return false;
		} else if (!deviceToken.equals(other.deviceToken))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", deviceImei=" + deviceImei + ", deviceMac=" + deviceMac
				+ ", deviceSerialNo=" + deviceSerialNo + ", deviceStatus=" + deviceStatus + ", deviceToken="
				+ deviceToken + ", devicePhone=" + devicePhone + "]";
	}

	
}