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

	private int device_id;
	
	private String device_imei;
	
	private String device_mac;
	
	private String device_serial_no;
	
	private int device_status;
	
	private String device_token;
	
	private String device_phone;

	/**
	 * @return the device_id
	 */
	public int getDevice_id() {
		return device_id;
	}

	/**
	 * @param device_id the device_id to set
	 */
	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	/**
	 * @return the device_imei
	 */
	public String getDevice_imei() {
		return device_imei;
	}

	/**
	 * @param device_imei the device_imei to set
	 */
	public void setDevice_imei(String device_imei) {
		this.device_imei = device_imei;
	}

	/**
	 * @return the device_mac
	 */
	public String getDevice_mac() {
		return device_mac;
	}

	/**
	 * @param device_mac the device_mac to set
	 */
	public void setDevice_mac(String device_mac) {
		this.device_mac = device_mac;
	}

	/**
	 * @return the device_serial_no
	 */
	public String getDevice_serial_no() {
		return device_serial_no;
	}

	/**
	 * @param device_serial_no the device_serial_no to set
	 */
	public void setDevice_serial_no(String device_serial_no) {
		this.device_serial_no = device_serial_no;
	}

	/**
	 * @return the device_status
	 */
	public int getDevice_status() {
		return device_status;
	}

	/**
	 * @param device_status the device_status to set
	 */
	public void setDevice_status(int device_status) {
		this.device_status = device_status;
	}

	/**
	 * @return the device_token
	 */
	public String getDevice_token() {
		return device_token;
	}

	/**
	 * @param device_token the device_token to set
	 */
	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}

	/**
	 * @return the device_phone
	 */
	public String getDevice_phone() {
		return device_phone;
	}

	/**
	 * @param device_phone the device_phone to set
	 */
	public void setDevice_phone(String device_phone) {
		this.device_phone = device_phone;
	}

	@Override
	public String toString() {
		return "Device [device_id=" + device_id + ", device_imei=" + device_imei + ", device_mac=" + device_mac
				+ ", device_serial_no=" + device_serial_no + ", device_status=" + device_status + ", device_token="
				+ device_token + ", device_phone=" + device_phone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + device_id;
		result = prime * result + ((device_imei == null) ? 0 : device_imei.hashCode());
		result = prime * result + ((device_mac == null) ? 0 : device_mac.hashCode());
		result = prime * result + ((device_phone == null) ? 0 : device_phone.hashCode());
		result = prime * result + ((device_serial_no == null) ? 0 : device_serial_no.hashCode());
		result = prime * result + device_status;
		result = prime * result + ((device_token == null) ? 0 : device_token.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Device)) {
			return false;
		}
		Device other = (Device) obj;
		if (device_id != other.device_id) {
			return false;
		}
		if (device_imei == null) {
			if (other.device_imei != null) {
				return false;
			}
		} else if (!device_imei.equals(other.device_imei)) {
			return false;
		}
		if (device_mac == null) {
			if (other.device_mac != null) {
				return false;
			}
		} else if (!device_mac.equals(other.device_mac)) {
			return false;
		}
		if (device_phone == null) {
			if (other.device_phone != null) {
				return false;
			}
		} else if (!device_phone.equals(other.device_phone)) {
			return false;
		}
		if (device_serial_no == null) {
			if (other.device_serial_no != null) {
				return false;
			}
		} else if (!device_serial_no.equals(other.device_serial_no)) {
			return false;
		}
		if (device_status != other.device_status) {
			return false;
		}
		if (device_token == null) {
			if (other.device_token != null) {
				return false;
			}
		} else if (!device_token.equals(other.device_token)) {
			return false;
		}
		return true;
	}
}