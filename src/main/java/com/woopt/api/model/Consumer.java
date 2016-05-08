package com.woopt.api.model;

import java.sql.Timestamp;

public class Consumer {

	private Integer consumerId;
	
	private Integer userId;
	
	private Integer shopId;
	
	private String userFirstname;
	
	private String userLastname;
	
	private String userDOB;
	
	private String userGender;
	
	private String userPhone;
	
	private String userMobile;
	
	private String userProfilePhoto;
	
	private String userEmail;
	
	private Integer consumerStatus;
	
	private Integer consumerIsFavourite;
	
	private Integer consumerTotalVisits;
	
	private Timestamp consumerFirstVisited;
	
	private Timestamp consumerLastVisited;
	
	private Double consumerTotalTransaction;
	
	private Double consumerTotalRedeemed;
	
	private Integer consumerShopRating;

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getUserFirstname() {
		return userFirstname;
	}

	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}

	public String getUserLastname() {
		return userLastname;
	}

	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	public String getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserProfilePhoto() {
		return userProfilePhoto;
	}

	public void setUserProfilePhoto(String userProfilePhoto) {
		this.userProfilePhoto = userProfilePhoto;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getConsumerStatus() {
		return consumerStatus;
	}

	public void setConsumerStatus(Integer consumerStatus) {
		this.consumerStatus = consumerStatus;
	}

	public Integer getConsumerIsFavourite() {
		return consumerIsFavourite;
	}

	public void setConsumerIsFavourite(Integer consumerIsFavourite) {
		this.consumerIsFavourite = consumerIsFavourite;
	}

	public Integer getConsumerTotalVisits() {
		return consumerTotalVisits;
	}

	public void setConsumerTotalVisits(Integer consumerTotalVisits) {
		this.consumerTotalVisits = consumerTotalVisits;
	}

	public Timestamp getConsumerFirstVisited() {
		return consumerFirstVisited;
	}

	public void setConsumerFirstVisited(Timestamp consumerFirstVisited) {
		this.consumerFirstVisited = consumerFirstVisited;
	}

	public Timestamp getConsumerLastVisited() {
		return consumerLastVisited;
	}

	public void setConsumerLastVisited(Timestamp consumerLastVisited) {
		this.consumerLastVisited = consumerLastVisited;
	}

	public Double getConsumerTotalTransaction() {
		return consumerTotalTransaction;
	}

	public void setConsumerTotalTransaction(Double consumerTotalTransaction) {
		this.consumerTotalTransaction = consumerTotalTransaction;
	}

	public Double getConsumerTotalRedeemed() {
		return consumerTotalRedeemed;
	}

	public void setConsumerTotalRedeemed(Double consumerTotalRedeemed) {
		this.consumerTotalRedeemed = consumerTotalRedeemed;
	}

	public Integer getConsumerShopRating() {
		return consumerShopRating;
	}

	public void setConsumerShopRating(Integer consumerShopRating) {
		this.consumerShopRating = consumerShopRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consumerFirstVisited == null) ? 0 : consumerFirstVisited.hashCode());
		result = prime * result + ((consumerId == null) ? 0 : consumerId.hashCode());
		result = prime * result + ((consumerIsFavourite == null) ? 0 : consumerIsFavourite.hashCode());
		result = prime * result + ((consumerLastVisited == null) ? 0 : consumerLastVisited.hashCode());
		result = prime * result + ((consumerShopRating == null) ? 0 : consumerShopRating.hashCode());
		result = prime * result + ((consumerStatus == null) ? 0 : consumerStatus.hashCode());
		result = prime * result + ((consumerTotalRedeemed == null) ? 0 : consumerTotalRedeemed.hashCode());
		result = prime * result + ((consumerTotalTransaction == null) ? 0 : consumerTotalTransaction.hashCode());
		result = prime * result + ((consumerTotalVisits == null) ? 0 : consumerTotalVisits.hashCode());
		result = prime * result + ((shopId == null) ? 0 : shopId.hashCode());
		result = prime * result + ((userDOB == null) ? 0 : userDOB.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userFirstname == null) ? 0 : userFirstname.hashCode());
		result = prime * result + ((userGender == null) ? 0 : userGender.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userLastname == null) ? 0 : userLastname.hashCode());
		result = prime * result + ((userMobile == null) ? 0 : userMobile.hashCode());
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		result = prime * result + ((userProfilePhoto == null) ? 0 : userProfilePhoto.hashCode());
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
		Consumer other = (Consumer) obj;
		if (consumerFirstVisited == null) {
			if (other.consumerFirstVisited != null)
				return false;
		} else if (!consumerFirstVisited.equals(other.consumerFirstVisited))
			return false;
		if (consumerId == null) {
			if (other.consumerId != null)
				return false;
		} else if (!consumerId.equals(other.consumerId))
			return false;
		if (consumerIsFavourite == null) {
			if (other.consumerIsFavourite != null)
				return false;
		} else if (!consumerIsFavourite.equals(other.consumerIsFavourite))
			return false;
		if (consumerLastVisited == null) {
			if (other.consumerLastVisited != null)
				return false;
		} else if (!consumerLastVisited.equals(other.consumerLastVisited))
			return false;
		if (consumerShopRating == null) {
			if (other.consumerShopRating != null)
				return false;
		} else if (!consumerShopRating.equals(other.consumerShopRating))
			return false;
		if (consumerStatus == null) {
			if (other.consumerStatus != null)
				return false;
		} else if (!consumerStatus.equals(other.consumerStatus))
			return false;
		if (consumerTotalRedeemed == null) {
			if (other.consumerTotalRedeemed != null)
				return false;
		} else if (!consumerTotalRedeemed.equals(other.consumerTotalRedeemed))
			return false;
		if (consumerTotalTransaction == null) {
			if (other.consumerTotalTransaction != null)
				return false;
		} else if (!consumerTotalTransaction.equals(other.consumerTotalTransaction))
			return false;
		if (consumerTotalVisits == null) {
			if (other.consumerTotalVisits != null)
				return false;
		} else if (!consumerTotalVisits.equals(other.consumerTotalVisits))
			return false;
		if (shopId == null) {
			if (other.shopId != null)
				return false;
		} else if (!shopId.equals(other.shopId))
			return false;
		if (userDOB == null) {
			if (other.userDOB != null)
				return false;
		} else if (!userDOB.equals(other.userDOB))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userFirstname == null) {
			if (other.userFirstname != null)
				return false;
		} else if (!userFirstname.equals(other.userFirstname))
			return false;
		if (userGender == null) {
			if (other.userGender != null)
				return false;
		} else if (!userGender.equals(other.userGender))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userLastname == null) {
			if (other.userLastname != null)
				return false;
		} else if (!userLastname.equals(other.userLastname))
			return false;
		if (userMobile == null) {
			if (other.userMobile != null)
				return false;
		} else if (!userMobile.equals(other.userMobile))
			return false;
		if (userPhone == null) {
			if (other.userPhone != null)
				return false;
		} else if (!userPhone.equals(other.userPhone))
			return false;
		if (userProfilePhoto == null) {
			if (other.userProfilePhoto != null)
				return false;
		} else if (!userProfilePhoto.equals(other.userProfilePhoto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Consumer [consumerId=" + consumerId + ", userId=" + userId + ", shopId=" + shopId + ", userFirstname="
				+ userFirstname + ", userLastname=" + userLastname + ", userDOB=" + userDOB + ", userGender="
				+ userGender + ", userPhone=" + userPhone + ", userMobile=" + userMobile + ", userProfilePhoto="
				+ userProfilePhoto + ", userEmail=" + userEmail + ", consumerStatus=" + consumerStatus
				+ ", consumerIsFavourite=" + consumerIsFavourite + ", consumerTotalVisits=" + consumerTotalVisits
				+ ", consumerFirstVisited=" + consumerFirstVisited + ", consumerLastVisited=" + consumerLastVisited
				+ ", consumerTotalTransaction=" + consumerTotalTransaction + ", consumerTotalRedeemed="
				+ consumerTotalRedeemed + ", consumerShopRating=" + consumerShopRating + "]";
	}

}