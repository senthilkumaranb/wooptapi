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
@Table(name = "WOOPT_MESSAGE_READ")
public class MessageReadEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "MESSAGE_READ_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int messageReadId;
	
	@Column(name = "MESSAGE_ID")
	private int messageId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_READ_DATETIME")
	private Timestamp userReadDatetime;

	public int getMessageReadId() {
		return messageReadId;
	}

	public void setMessageReadId(int messageReadId) {
		this.messageReadId = messageReadId;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getUserReadDatetime() {
		return userReadDatetime;
	}

	public void setUserReadDatetime(Timestamp userReadDatetime) {
		this.userReadDatetime = userReadDatetime;
	}
	
	

}
