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
@Table(name = "WOOPT_MESSAGE")
public class MessageEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "MESSAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int messageId;
	
	@Column(name = "CHAT_ID")
	private int chatId;
	
	@Column(name = "CHAT_SEQUENCE_ID")
	private int chatSequenceId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "MESSAGE_TYPE_ID")
	private int messageTypeId;
	
	@Column(name = "MESSAGE_FROMDATETIME")
	private Timestamp messageFromDatTime;
	
	@Column(name = "MESSAGE_TEXT")
	private String messageText;
	
	@Column(name = "MESSAGE_ID_STATUS")
	private int messageIdStatus;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getChatId() {
		return chatId;
	}

	public void setChatId(int chatId) {
		this.chatId = chatId;
	}

	public int getChatSequenceId() {
		return chatSequenceId;
	}

	public void setChatSequenceId(int chatSequenceId) {
		this.chatSequenceId = chatSequenceId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMessageTypeId() {
		return messageTypeId;
	}

	public void setMessageTypeId(int messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	public Timestamp getMessageFromDatTime() {
		return messageFromDatTime;
	}

	public void setMessageFromDatTime(Timestamp messageFromDatTime) {
		this.messageFromDatTime = messageFromDatTime;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public int getMessageIdStatus() {
		return messageIdStatus;
	}

	public void setMessageIdStatus(int messageIdStatus) {
		this.messageIdStatus = messageIdStatus;
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
	
	

}
