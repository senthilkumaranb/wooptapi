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
 * @author Senthil
 *
 */
@Entity
@Table(name = "WOOPT_USER_SHOP_ORDER")
public class UserShopOrderEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_SHOP_ORDER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userShopOrderId;
	
	@Column(name = "USER_SHOP_ORDER_METHOD")
	private String userShopOrderMethod;
	
	@Column(name = "USER_SHOP_CHECKIN_ID")
	private int userShopCheckInId;

	@Column(name = "USER_SHOP_ORDER_TOTAL_TRANSACTION")
	private int userShopOrderTotalTransaction;
		
	@Column(name = "USER_SHOP_ORDER_TOTAL_REDEEMED")
	private int userShopOrderTotalRedeemed;
	
	@Column(name = "USER_SHOP_ORDER_NET_TRANSACTION")
	private int userShopOrderNetTransaction;
	
	@Column(name = "USER_SHOP_ORDER_STATUS")
	private int userShopOrderStatus;

	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getUserShopOrderId() {
		return userShopOrderId;
	}

	public void setUserShopOrderId(int userShopOrderId) {
		this.userShopOrderId = userShopOrderId;
	}

	public String getUserShopOrderMethod() {
		return userShopOrderMethod;
	}

	public void setUserShopOrderMethod(String userShopOrderMethod) {
		this.userShopOrderMethod = userShopOrderMethod;
	}

	public int getUserShopCheckInId() {
		return userShopCheckInId;
	}

	public void setUserShopCheckInId(int userShopCheckInId) {
		this.userShopCheckInId = userShopCheckInId;
	}

	public int getUserShopOrderTotalTransaction() {
		return userShopOrderTotalTransaction;
	}

	public void setUserShopOrderTotalTransaction(int userShopOrderTotalTransaction) {
		this.userShopOrderTotalTransaction = userShopOrderTotalTransaction;
	}

	public int getUserShopOrderTotalRedeemed() {
		return userShopOrderTotalRedeemed;
	}

	public void setUserShopOrderTotalRedeemed(int userShopOrderTotalRedeemed) {
		this.userShopOrderTotalRedeemed = userShopOrderTotalRedeemed;
	}

	public int getUserShopOrderNetTransaction() {
		return userShopOrderNetTransaction;
	}

	public void setUserShopOrderNetTransaction(int userShopOrderNetTransaction) {
		this.userShopOrderNetTransaction = userShopOrderNetTransaction;
	}

	public int getUserShopOrderStatus() {
		return userShopOrderStatus;
	}

	public void setUserShopOrderStatus(int userShopOrderStatus) {
		this.userShopOrderStatus = userShopOrderStatus;
	}

	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "UserShopOrderEntity [userShopOrderId=" + userShopOrderId + ", userShopOrderMethod="
				+ userShopOrderMethod + ", userShopCheckInId=" + userShopCheckInId + ", userShopOrderTotalTransaction="
				+ userShopOrderTotalTransaction + ", userShopOrderTotalRedeemed=" + userShopOrderTotalRedeemed
				+ ", userShopOrderNetTransaction=" + userShopOrderNetTransaction + ", userShopOrderStatus="
				+ userShopOrderStatus + ", createdDatetime=" + createdDatetime + ", lastUpdatedDatetime="
				+ lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDatetime == null) ? 0 : createdDatetime.hashCode());
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + userShopCheckInId;
		result = prime * result + userShopOrderId;
		result = prime * result + ((userShopOrderMethod == null) ? 0 : userShopOrderMethod.hashCode());
		result = prime * result + userShopOrderNetTransaction;
		result = prime * result + userShopOrderStatus;
		result = prime * result + userShopOrderTotalRedeemed;
		result = prime * result + userShopOrderTotalTransaction;
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
		UserShopOrderEntity other = (UserShopOrderEntity) obj;
		if (createdDatetime == null) {
			if (other.createdDatetime != null)
				return false;
		} else if (!createdDatetime.equals(other.createdDatetime))
			return false;
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null)
				return false;
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime))
			return false;
		if (userShopCheckInId != other.userShopCheckInId)
			return false;
		if (userShopOrderId != other.userShopOrderId)
			return false;
		if (userShopOrderMethod == null) {
			if (other.userShopOrderMethod != null)
				return false;
		} else if (!userShopOrderMethod.equals(other.userShopOrderMethod))
			return false;
		if (userShopOrderNetTransaction != other.userShopOrderNetTransaction)
			return false;
		if (userShopOrderStatus != other.userShopOrderStatus)
			return false;
		if (userShopOrderTotalRedeemed != other.userShopOrderTotalRedeemed)
			return false;
		if (userShopOrderTotalTransaction != other.userShopOrderTotalTransaction)
			return false;
		return true;
	}
	
	
}
