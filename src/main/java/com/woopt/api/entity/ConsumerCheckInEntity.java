package com.woopt.api.entity;

import java.sql.Timestamp;

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
@Table(name = "WOOPT_CONSUMER_CHECKIN")
public class ConsumerCheckInEntity {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CONSUMER_CHECKIN_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consumerCheckInId;
	
	@Column(name = "CONSUMER_ID")
	private Integer consumerId;
	
	@Column(name = "CONSUMER_CHECKIN_DATETIME")
	private Timestamp consumerCheckInDatetime;
	
	@Column(name = "CONSUMER_CHECKIN_METHOD")
	private String consumerCheckInMethod;
	
	@Column(name = "CONSUMER_CHECKIN_STATUS")
	private Integer consumerCheckInStatus;
	
	@Column(name = "CONSUMER_CHECKIN_SOURCEPAGE")
	private String consumerCheckInSourcePage;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public ConsumerCheckInEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getConsumerCheckInId() {
		return consumerCheckInId;
	}

	public void setConsumerCheckInId(Integer consumerCheckInId) {
		this.consumerCheckInId = consumerCheckInId;
	}

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public Timestamp getConsumerCheckInDatetime() {
		return consumerCheckInDatetime;
	}

	public void setConsumerCheckInDatetime(Timestamp consumerCheckInDatetime) {
		this.consumerCheckInDatetime = consumerCheckInDatetime;
	}

	public String getConsumerCheckInMethod() {
		return consumerCheckInMethod;
	}

	public void setConsumerCheckInMethod(String consumerCheckInMethod) {
		this.consumerCheckInMethod = consumerCheckInMethod;
	}

	public Integer getConsumerCheckInStatus() {
		return consumerCheckInStatus;
	}

	public void setConsumerCheckInStatus(Integer consumerCheckInStatus) {
		this.consumerCheckInStatus = consumerCheckInStatus;
	}

	public String getConsumerCheckInSourcePage() {
		return consumerCheckInSourcePage;
	}

	public void setConsumerCheckInSourcePage(String consumerCheckInSourcePage) {
		this.consumerCheckInSourcePage = consumerCheckInSourcePage;
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
		return "ConsumerCheckInEntity [consumerCheckInId=" + consumerCheckInId + ", consumerId=" + consumerId
				+ ", consumerCheckInDatetime=" + consumerCheckInDatetime + ", consumerCheckInMethod="
				+ consumerCheckInMethod + ", consumerCheckInStatus=" + consumerCheckInStatus
				+ ", consumerCheckInSourcePage=" + consumerCheckInSourcePage + ", createdDatetime=" + createdDatetime
				+ ", lastUpdatedDatetime=" + lastUpdatedDatetime + "]";
	}
	
		
}
