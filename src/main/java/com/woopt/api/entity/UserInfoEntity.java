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
@Table(name = "WOOPT_USER_INFO")
public class UserInfoEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_INFO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userInfoId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_INFO_LAST_LOGON")
	private Timestamp userInfoLastLogon;
	
	@Column(name = "USER_INFO_NO_OF_LOGONS")
	private int userInfoNoOfLogons;
	
	@Column(name = "USER_INFO_STATUS")
	private String userInfoStatus;
	
	@Column(name = "USER_INFO_NOTIFICATION_FLAG")
	private int userInfoNotificationFlag;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;
	
	@Column(name = "USER_INFO_LASTLOGON_LATITUDE")
	private String userInfoLastLogonLatitude;
	
	@Column(name = "USER_INFO_LASTLOGON_LONGITUDE")
	private String userInfoLastLogonLongitude;
	
	@Column(name = "USER_INFO_CURRENT_LATITUDE")
	private String userInfoCurrentLatitude;
	
	@Column(name = "USER_INFO_CURRENT_LONGITUDE")
	private String userInfoCurrentLongitude;
	
	/**
	 * @return the userInfoId
	 */
	public int getUserInfoId() {
		return userInfoId;
	}

	/**
	 * @param userInfoId the userInfoId to set
	 */
	public void setUserInfoId(int userInfoId) {
		this.userInfoId = userInfoId;
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
	 * @return the userInfoLastLogon
	 */
	public Timestamp getUserInfoLastLogon() {
		return userInfoLastLogon;
	}

	/**
	 * @param userInfoLastLogon the userInfoLastLogon to set
	 */
	public void setUserInfoLastLogon(Timestamp userInfoLastLogon) {
		this.userInfoLastLogon = userInfoLastLogon;
	}

	/**
	 * @return the userInfoNoOfLogons
	 */
	public int getUserInfoNoOfLogons() {
		return userInfoNoOfLogons;
	}

	/**
	 * @param userInfoNoOfLogons the userInfoNoOfLogons to set
	 */
	public void setUserInfoNoOfLogons(int userInfoNoOfLogons) {
		this.userInfoNoOfLogons = userInfoNoOfLogons;
	}

	/**
	 * @return the userInfoStatus
	 */
	public String getUserInfoStatus() {
		return userInfoStatus;
	}

	/**
	 * @param userInfoStatus the userInfoStatus to set
	 */
	public void setUserInfoStatus(String userInfoStatus) {
		this.userInfoStatus = userInfoStatus;
	}

	/**
	 * @return the userInfoNotificationFlag
	 */
	public int getUserInfoNotificationFlag() {
		return userInfoNotificationFlag;
	}

	/**
	 * @param userInfoNotificationFlag the userInfoNotificationFlag to set
	 */
	public void setUserInfoNotificationFlag(int userInfoNotificationFlag) {
		this.userInfoNotificationFlag = userInfoNotificationFlag;
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

	/**
	 * @return the userInfoLastLogonLatitude
	 */
	public String getUserInfoLastLogonLatitude() {
		return userInfoLastLogonLatitude;
	}

	/**
	 * @param userInfoLastLogonLatitude the userInfoLastLogonLatitude to set
	 */
	public void setUserInfoLastLogonLatitude(String userInfoLastLogonLatitude) {
		this.userInfoLastLogonLatitude = userInfoLastLogonLatitude;
	}

	/**
	 * @return the userInfoLastLogonLongitude
	 */
	public String getUserInfoLastLogonLongitude() {
		return userInfoLastLogonLongitude;
	}

	/**
	 * @param userInfoLastLogonLongitude the userInfoLastLogonLongitude to set
	 */
	public void setUserInfoLastLogonLongitude(String userInfoLastLogonLongitude) {
		this.userInfoLastLogonLongitude = userInfoLastLogonLongitude;
	}

	/**
	 * @return the userInfoCurrentLatitude
	 */
	public String getUserInfoCurrentLatitude() {
		return userInfoCurrentLatitude;
	}

	/**
	 * @param userInfoCurrentLatitude the userInfoCurrentLatitude to set
	 */
	public void setUserInfoCurrentLatitude(String userInfoCurrentLatitude) {
		this.userInfoCurrentLatitude = userInfoCurrentLatitude;
	}

	/**
	 * @return the userInfoCurrentLongitude
	 */
	public String getUserInfoCurrentLongitude() {
		return userInfoCurrentLongitude;
	}

	/**
	 * @param userInfoCurrentLongitude the userInfoCurrentLongitude to set
	 */
	public void setUserInfoCurrentLongitude(String userInfoCurrentLongitude) {
		this.userInfoCurrentLongitude = userInfoCurrentLongitude;
	}

	@Override
	public String toString() {
		return "UserInfo [userInfoId=" + userInfoId + ", userId=" + userId + ", userInfoLastLogon=" + userInfoLastLogon
				+ ", userInfoNoOfLogons=" + userInfoNoOfLogons + ", userInfoStatus=" + userInfoStatus
				+ ", userInfoNotificationFlag=" + userInfoNotificationFlag + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + ", userInfoLastLogonLatitude="
				+ userInfoLastLogonLatitude + ", userInfoLastLogonLongitude=" + userInfoLastLogonLongitude
				+ ", userInfoCurrentLatitude=" + userInfoCurrentLatitude + ", userInfoCurrentLongitude="
				+ userInfoCurrentLongitude + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userInfoCurrentLatitude == null) ? 0 : userInfoCurrentLatitude.hashCode());
		result = prime * result + ((userInfoCurrentLongitude == null) ? 0 : userInfoCurrentLongitude.hashCode());
		result = prime * result + userInfoId;
		result = prime * result + ((userInfoLastLogon == null) ? 0 : userInfoLastLogon.hashCode());
		result = prime * result + ((userInfoLastLogonLatitude == null) ? 0 : userInfoLastLogonLatitude.hashCode());
		result = prime * result + ((userInfoLastLogonLongitude == null) ? 0 : userInfoLastLogonLongitude.hashCode());
		result = prime * result + userInfoNoOfLogons;
		result = prime * result + userInfoNotificationFlag;
		result = prime * result + ((userInfoStatus == null) ? 0 : userInfoStatus.hashCode());
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
		if (!(obj instanceof UserInfoEntity)) {
			return false;
		}
		UserInfoEntity other = (UserInfoEntity) obj;
		if (createdDatetime == null) {
			if (other.createdDatetime != null) {
				return false;
			}
		} else if (!createdDatetime.equals(other.createdDatetime)) {
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
		if (userInfoCurrentLatitude == null) {
			if (other.userInfoCurrentLatitude != null) {
				return false;
			}
		} else if (!userInfoCurrentLatitude.equals(other.userInfoCurrentLatitude)) {
			return false;
		}
		if (userInfoCurrentLongitude == null) {
			if (other.userInfoCurrentLongitude != null) {
				return false;
			}
		} else if (!userInfoCurrentLongitude.equals(other.userInfoCurrentLongitude)) {
			return false;
		}
		if (userInfoId != other.userInfoId) {
			return false;
		}
		if (userInfoLastLogon == null) {
			if (other.userInfoLastLogon != null) {
				return false;
			}
		} else if (!userInfoLastLogon.equals(other.userInfoLastLogon)) {
			return false;
		}
		if (userInfoLastLogonLatitude == null) {
			if (other.userInfoLastLogonLatitude != null) {
				return false;
			}
		} else if (!userInfoLastLogonLatitude.equals(other.userInfoLastLogonLatitude)) {
			return false;
		}
		if (userInfoLastLogonLongitude == null) {
			if (other.userInfoLastLogonLongitude != null) {
				return false;
			}
		} else if (!userInfoLastLogonLongitude.equals(other.userInfoLastLogonLongitude)) {
			return false;
		}
		if (userInfoNoOfLogons != other.userInfoNoOfLogons) {
			return false;
		}
		if (userInfoNotificationFlag != other.userInfoNotificationFlag) {
			return false;
		}
		if (userInfoStatus == null) {
			if (other.userInfoStatus != null) {
				return false;
			}
		} else if (!userInfoStatus.equals(other.userInfoStatus)) {
			return false;
		}
		return true;
	}
}