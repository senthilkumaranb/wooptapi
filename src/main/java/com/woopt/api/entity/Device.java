package com.woopt.api.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Sushil
 *
 */
@Entity
@Table(name = "WOOPT_DEVICE")
public class Device {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "DEVICE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deviceId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "DEVICE_IMEA")
	private String deviceIMEA;
	
	@Column(name = "DEVICE_MAC")
	private String deviceMAC;
	
	@Column(name = "DEVICE_SERIAL_NO")
	private String deviceSerialNo;
	
	@Column(name = "DEVICE_STATUS")
	private int deviceStatus;
	
	@Column(name = "DEVICE_TOKEN")
	private String deviceToken;
	
	@Column(name = "DEVICE_PHONE")
	private String devicePhone;
	
	@Column(name = "DEVICE_OTP")
	private String deviceOTP;
	
	@Column(name = "DEVICE_OTP_STATUS")
	private int deviceOTPStatus;
	
	@Column(name = "DEVICE_OTP_TIMESTAMP")
	private Timestamp deviceOTPTimestamp;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	/**
	 * @return the deviceId
	 */
	public int getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the deviceIMEA
	 */
	public String getDeviceIMEA() {
		return deviceIMEA;
	}

	/**
	 * @param deviceIMEA the deviceIMEA to set
	 */
	public void setDeviceIMEA(String deviceIMEA) {
		this.deviceIMEA = deviceIMEA;
	}

	/**
	 * @return the deviceMAC
	 */
	public String getDeviceMAC() {
		return deviceMAC;
	}

	/**
	 * @param deviceMAC the deviceMAC to set
	 */
	public void setDeviceMAC(String deviceMAC) {
		this.deviceMAC = deviceMAC;
	}

	/**
	 * @return the deviceSerialNo
	 */
	public String getDeviceSerialNo() {
		return deviceSerialNo;
	}

	/**
	 * @param deviceSerialNo the deviceSerialNo to set
	 */
	public void setDeviceSerialNo(String deviceSerialNo) {
		this.deviceSerialNo = deviceSerialNo;
	}

	/**
	 * @return the deviceStatus
	 */
	public int getDeviceStatus() {
		return deviceStatus;
	}

	/**
	 * @param deviceStatus the deviceStatus to set
	 */
	public void setDeviceStatus(int deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	/**
	 * @return the deviceToken
	 */
	public String getDeviceToken() {
		return deviceToken;
	}

	/**
	 * @param deviceToken the deviceToken to set
	 */
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	/**
	 * @return the devicePhone
	 */
	public String getDevicePhone() {
		return devicePhone;
	}

	/**
	 * @param devicePhone the devicePhone to set
	 */
	public void setDevicePhone(String devicePhone) {
		this.devicePhone = devicePhone;
	}

	/**
	 * @return the deviceOTP
	 */
	public String getDeviceOTP() {
		return deviceOTP;
	}

	/**
	 * @param deviceOTP the deviceOTP to set
	 */
	public void setDeviceOTP(String deviceOTP) {
		this.deviceOTP = deviceOTP;
	}

	/**
	 * @return the deviceOTPStatus
	 */
	public int getDeviceOTPStatus() {
		return deviceOTPStatus;
	}

	/**
	 * @param deviceOTPStatus the deviceOTPStatus to set
	 */
	public void setDeviceOTPStatus(int deviceOTPStatus) {
		this.deviceOTPStatus = deviceOTPStatus;
	}

	/**
	 * @return the deviceOTPTimestamp
	 */
	public Timestamp getDeviceOTPTimestamp() {
		return deviceOTPTimestamp;
	}

	/**
	 * @param deviceOTPTimestamp the deviceOTPTimestamp to set
	 */
	public void setDeviceOTPTimestamp(Timestamp deviceOTPTimestamp) {
		this.deviceOTPTimestamp = deviceOTPTimestamp;
	}

	/**
	 * @return the createdDatetime
	 */
	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	/**
	 * @param createdDatetime the createdDatetime to set
	 */
	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	/**
	 * @return the lastUpdatedDatetime
	 */
	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	/**
	 * @param lastUpdatedDatetime the lastUpdatedDatetime to set
	 */
	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((deviceIMEA == null) ? 0 : deviceIMEA.hashCode());
		result = prime * result + deviceId;
		result = prime * result + ((deviceMAC == null) ? 0 : deviceMAC.hashCode());
		result = prime * result + ((deviceOTP == null) ? 0 : deviceOTP.hashCode());
		result = prime * result + deviceOTPStatus;
		result = prime * result + ((deviceOTPTimestamp == null) ? 0 : deviceOTPTimestamp.hashCode());
		result = prime * result + ((devicePhone == null) ? 0 : devicePhone.hashCode());
		result = prime * result + ((deviceSerialNo == null) ? 0 : deviceSerialNo.hashCode());
		result = prime * result + deviceStatus;
		result = prime * result + ((deviceToken == null) ? 0 : deviceToken.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + userId;
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
		if (createdDatetime == null) {
			if (other.createdDatetime != null) {
				return false;
			}
		} else if (!createdDatetime.equals(other.createdDatetime)) {
			return false;
		}
		if (deviceIMEA == null) {
			if (other.deviceIMEA != null) {
				return false;
			}
		} else if (!deviceIMEA.equals(other.deviceIMEA)) {
			return false;
		}
		if (deviceId != other.deviceId) {
			return false;
		}
		if (deviceMAC == null) {
			if (other.deviceMAC != null) {
				return false;
			}
		} else if (!deviceMAC.equals(other.deviceMAC)) {
			return false;
		}
		if (deviceOTP == null) {
			if (other.deviceOTP != null) {
				return false;
			}
		} else if (!deviceOTP.equals(other.deviceOTP)) {
			return false;
		}
		if (deviceOTPStatus != other.deviceOTPStatus) {
			return false;
		}
		if (deviceOTPTimestamp == null) {
			if (other.deviceOTPTimestamp != null) {
				return false;
			}
		} else if (!deviceOTPTimestamp.equals(other.deviceOTPTimestamp)) {
			return false;
		}
		if (devicePhone == null) {
			if (other.devicePhone != null) {
				return false;
			}
		} else if (!devicePhone.equals(other.devicePhone)) {
			return false;
		}
		if (deviceSerialNo == null) {
			if (other.deviceSerialNo != null) {
				return false;
			}
		} else if (!deviceSerialNo.equals(other.deviceSerialNo)) {
			return false;
		}
		if (deviceStatus != other.deviceStatus) {
			return false;
		}
		if (deviceToken == null) {
			if (other.deviceToken != null) {
				return false;
			}
		} else if (!deviceToken.equals(other.deviceToken)) {
			return false;
		}
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null) {
				return false;
			}
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime)) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}

	/*
	@Override
	public String toString() {
		return String.format(
				"Device [deviceId=%s, userId=%s, deviceIMEA=%s, deviceMAC=%s, deviceSerialNo=%s, deviceStatus=%s, deviceToken=%s, devicePhone=%s, deviceOTP=%s, deviceOTPStatus=%s, deviceOTPTimestamp=%s, createdDatetime=%s, lastUpdatedDatetime=%s]",
				deviceId, userId, deviceIMEA, deviceMAC, deviceSerialNo, deviceStatus, deviceToken, devicePhone,
				deviceOTP, deviceOTPStatus, deviceOTPTimestamp, createdDatetime, lastUpdatedDatetime);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Device [deviceId=").append(deviceId).append(", userId=").append(userId).append(", deviceIMEA=")
				.append(deviceIMEA).append(", deviceMAC=").append(deviceMAC).append(", deviceSerialNo=")
				.append(deviceSerialNo).append(", deviceStatus=").append(deviceStatus).append(", deviceToken=")
				.append(deviceToken).append(", devicePhone=").append(devicePhone).append(", deviceOTP=")
				.append(deviceOTP).append(", deviceOTPStatus=").append(deviceOTPStatus).append(", deviceOTPTimestamp=")
				.append(deviceOTPTimestamp).append(", createdDatetime=").append(createdDatetime)
				.append(", lastUpdatedDatetime=").append(lastUpdatedDatetime).append("]");
		return builder.toString();
	}
	
	/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Device [deviceId=");
		builder.append(deviceId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", deviceIMEA=");
		builder.append(deviceIMEA);
		builder.append(", deviceMAC=");
		builder.append(deviceMAC);
		builder.append(", deviceSerialNo=");
		builder.append(deviceSerialNo);
		builder.append(", deviceStatus=");
		builder.append(deviceStatus);
		builder.append(", deviceToken=");
		builder.append(deviceToken);
		builder.append(", devicePhone=");
		builder.append(devicePhone);
		builder.append(", deviceOTP=");
		builder.append(deviceOTP);
		builder.append(", deviceOTPStatus=");
		builder.append(deviceOTPStatus);
		builder.append(", deviceOTPTimestamp=");
		builder.append(deviceOTPTimestamp);
		builder.append(", createdDatetime=");
		builder.append(createdDatetime);
		builder.append(", lastUpdatedDatetime=");
		builder.append(lastUpdatedDatetime);
		builder.append("]");
		return builder.toString();
	}

	/*
	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", userId=" + userId + ", deviceIMEA=" + deviceIMEA + ", deviceMAC="
				+ deviceMAC + ", deviceSerialNo=" + deviceSerialNo + ", deviceStatus=" + deviceStatus + ", deviceToken="
				+ deviceToken + ", devicePhone=" + devicePhone + ", deviceOTP=" + deviceOTP + ", deviceOTPStatus="
				+ deviceOTPStatus + ", deviceOTPTimestamp=" + deviceOTPTimestamp + ", createdDatetime="
				+ createdDatetime + ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}*/
	
}