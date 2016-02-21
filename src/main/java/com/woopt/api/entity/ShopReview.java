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
@Table(name = "WOOPT_SHOP_REVIEW")
public class ShopReview {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "SHOP_REVIEW_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopReviewId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "SHOP_ID")
	private int shopId;
	
	@Column(name = "SHOP_REVIEW_USER_NAME")
	private String shopReviewUserName;
	
	@Column(name = "SHOP_REVIEW_USER_PHONE")
	private String shopReviewUserPhone;
	
	@Column(name = "SHOP_REVIEW_USER_CITY")
	private String shopReviewUserCity;
	
	@Column(name = "SHOP_REVIEW_DESCRIPTION")
	private String shopReviewDescription;
	
	@Column(name = "SHOP_REVIEW_DATETIME")
	private Timestamp shopReviewDatetime;
	
	@Column(name = "SHOP_REVIEW_READS")
	private int shopReviewReads;
	
	@Column(name = "SHOP_REVIEW_SHOP_RATING")
	private int shopReviewShopRating;
	
	@Column(name = "SHOP_REVIEW_LIKES_NO")
	private int shopReviewLikesNo;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private String lastUpdatedDatetime;

	/**
	 * @return the shopReviewId
	 */
	public int getShopReviewId() {
		return shopReviewId;
	}

	/**
	 * @param shopReviewId the shopReviewId to set
	 */
	public void setShopReviewId(int shopReviewId) {
		this.shopReviewId = shopReviewId;
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
	 * @return the shopId
	 */
	public int getShopId() {
		return shopId;
	}

	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the shopReviewUserName
	 */
	public String getShopReviewUserName() {
		return shopReviewUserName;
	}

	/**
	 * @param shopReviewUserName the shopReviewUserName to set
	 */
	public void setShopReviewUserName(String shopReviewUserName) {
		this.shopReviewUserName = shopReviewUserName;
	}

	/**
	 * @return the shopReviewUserPhone
	 */
	public String getShopReviewUserPhone() {
		return shopReviewUserPhone;
	}

	/**
	 * @param shopReviewUserPhone the shopReviewUserPhone to set
	 */
	public void setShopReviewUserPhone(String shopReviewUserPhone) {
		this.shopReviewUserPhone = shopReviewUserPhone;
	}

	/**
	 * @return the shopReviewUserCity
	 */
	public String getShopReviewUserCity() {
		return shopReviewUserCity;
	}

	/**
	 * @param shopReviewUserCity the shopReviewUserCity to set
	 */
	public void setShopReviewUserCity(String shopReviewUserCity) {
		this.shopReviewUserCity = shopReviewUserCity;
	}

	/**
	 * @return the shopReviewDescription
	 */
	public String getShopReviewDescription() {
		return shopReviewDescription;
	}

	/**
	 * @param shopReviewDescription the shopReviewDescription to set
	 */
	public void setShopReviewDescription(String shopReviewDescription) {
		this.shopReviewDescription = shopReviewDescription;
	}

	/**
	 * @return the shopReviewDatetime
	 */
	public Timestamp getShopReviewDatetime() {
		return shopReviewDatetime;
	}

	/**
	 * @param shopReviewDatetime the shopReviewDatetime to set
	 */
	public void setShopReviewDatetime(Timestamp shopReviewDatetime) {
		this.shopReviewDatetime = shopReviewDatetime;
	}

	/**
	 * @return the shopReviewReads
	 */
	public int getShopReviewReads() {
		return shopReviewReads;
	}

	/**
	 * @param shopReviewReads the shopReviewReads to set
	 */
	public void setShopReviewReads(int shopReviewReads) {
		this.shopReviewReads = shopReviewReads;
	}

	/**
	 * @return the shopReviewShopRating
	 */
	public int getShopReviewShopRating() {
		return shopReviewShopRating;
	}

	/**
	 * @param shopReviewShopRating the shopReviewShopRating to set
	 */
	public void setShopReviewShopRating(int shopReviewShopRating) {
		this.shopReviewShopRating = shopReviewShopRating;
	}

	/**
	 * @return the shopReviewLikesNo
	 */
	public int getShopReviewLikesNo() {
		return shopReviewLikesNo;
	}

	/**
	 * @param shopReviewLikesNo the shopReviewLikesNo to set
	 */
	public void setShopReviewLikesNo(int shopReviewLikesNo) {
		this.shopReviewLikesNo = shopReviewLikesNo;
	}

	/**
	 * @return the lastUpdatedDatetime
	 */
	public String getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	/**
	 * @param lastUpdatedDatetime the lastUpdatedDatetime to set
	 */
	public void setLastUpdatedDatetime(String lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "ShopReview [shopReviewId=" + shopReviewId + ", userId=" + userId + ", shopId=" + shopId
				+ ", shopReviewUserName=" + shopReviewUserName + ", shopReviewUserPhone=" + shopReviewUserPhone
				+ ", shopReviewUserCity=" + shopReviewUserCity + ", shopReviewDescription=" + shopReviewDescription
				+ ", shopReviewDatetime=" + shopReviewDatetime + ", shopReviewReads=" + shopReviewReads
				+ ", shopReviewShopRating=" + shopReviewShopRating + ", shopReviewLikesNo=" + shopReviewLikesNo
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastUpdatedDatetime == null) ? 0 : lastUpdatedDatetime.hashCode());
		result = prime * result + shopId;
		result = prime * result + ((shopReviewDatetime == null) ? 0 : shopReviewDatetime.hashCode());
		result = prime * result + ((shopReviewDescription == null) ? 0 : shopReviewDescription.hashCode());
		result = prime * result + shopReviewId;
		result = prime * result + shopReviewLikesNo;
		result = prime * result + shopReviewReads;
		result = prime * result + shopReviewShopRating;
		result = prime * result + ((shopReviewUserCity == null) ? 0 : shopReviewUserCity.hashCode());
		result = prime * result + ((shopReviewUserName == null) ? 0 : shopReviewUserName.hashCode());
		result = prime * result + ((shopReviewUserPhone == null) ? 0 : shopReviewUserPhone.hashCode());
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
		if (!(obj instanceof ShopReview)) {
			return false;
		}
		ShopReview other = (ShopReview) obj;
		if (lastUpdatedDatetime == null) {
			if (other.lastUpdatedDatetime != null) {
				return false;
			}
		} else if (!lastUpdatedDatetime.equals(other.lastUpdatedDatetime)) {
			return false;
		}
		if (shopId != other.shopId) {
			return false;
		}
		if (shopReviewDatetime == null) {
			if (other.shopReviewDatetime != null) {
				return false;
			}
		} else if (!shopReviewDatetime.equals(other.shopReviewDatetime)) {
			return false;
		}
		if (shopReviewDescription == null) {
			if (other.shopReviewDescription != null) {
				return false;
			}
		} else if (!shopReviewDescription.equals(other.shopReviewDescription)) {
			return false;
		}
		if (shopReviewId != other.shopReviewId) {
			return false;
		}
		if (shopReviewLikesNo != other.shopReviewLikesNo) {
			return false;
		}
		if (shopReviewReads != other.shopReviewReads) {
			return false;
		}
		if (shopReviewShopRating != other.shopReviewShopRating) {
			return false;
		}
		if (shopReviewUserCity == null) {
			if (other.shopReviewUserCity != null) {
				return false;
			}
		} else if (!shopReviewUserCity.equals(other.shopReviewUserCity)) {
			return false;
		}
		if (shopReviewUserName == null) {
			if (other.shopReviewUserName != null) {
				return false;
			}
		} else if (!shopReviewUserName.equals(other.shopReviewUserName)) {
			return false;
		}
		if (shopReviewUserPhone == null) {
			if (other.shopReviewUserPhone != null) {
				return false;
			}
		} else if (!shopReviewUserPhone.equals(other.shopReviewUserPhone)) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}
}