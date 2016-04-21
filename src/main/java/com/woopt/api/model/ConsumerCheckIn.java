package com.woopt.api.model;

import java.security.Timestamp;

public class ConsumerCheckIn {

	private Integer consumerCheckInId;
	private Timestamp consumerCheckInDatetime;
	private Integer consumerCheckInStatus;
	
	public Integer getConsumerCheckInId() {
		return consumerCheckInId;
	}
	public void setConsumerCheckInId(Integer consumerCheckInId) {
		this.consumerCheckInId = consumerCheckInId;
	}
	public Timestamp getConsumerCheckInDatetime() {
		return consumerCheckInDatetime;
	}
	public void setConsumerCheckInDatetime(Timestamp consumerCheckInDatetime) {
		this.consumerCheckInDatetime = consumerCheckInDatetime;
	}
	public Integer getConsumerCheckInStatus() {
		return consumerCheckInStatus;
	}
	public void setConsumerCheckInStatus(Integer consumerCheckInStatus) {
		this.consumerCheckInStatus = consumerCheckInStatus;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consumerCheckInDatetime == null) ? 0 : consumerCheckInDatetime.hashCode());
		result = prime * result + ((consumerCheckInId == null) ? 0 : consumerCheckInId.hashCode());
		result = prime * result + ((consumerCheckInStatus == null) ? 0 : consumerCheckInStatus.hashCode());
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
		ConsumerCheckIn other = (ConsumerCheckIn) obj;
		if (consumerCheckInDatetime == null) {
			if (other.consumerCheckInDatetime != null)
				return false;
		} else if (!consumerCheckInDatetime.equals(other.consumerCheckInDatetime))
			return false;
		if (consumerCheckInId == null) {
			if (other.consumerCheckInId != null)
				return false;
		} else if (!consumerCheckInId.equals(other.consumerCheckInId))
			return false;
		if (consumerCheckInStatus == null) {
			if (other.consumerCheckInStatus != null)
				return false;
		} else if (!consumerCheckInStatus.equals(other.consumerCheckInStatus))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ConsumerCheckIn [consumerCheckInId=" + consumerCheckInId + ", consumerCheckInDatetime="
				+ consumerCheckInDatetime + ", consumerCheckInStatus=" + consumerCheckInStatus + "]";
	}
	
}