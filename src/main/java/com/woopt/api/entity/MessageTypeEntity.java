package com.woopt.api.entity;

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
@Table(name = "WOOPT_MESSAGE_TYPE")
public class MessageTypeEntity {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "MESSAGE_TYPE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int messageTypeId;
	
	//TEXT, PAY, RATE, ORDER, DELIVERED
	@Column(name = "MESSAGE_TYPE_NAME")
	private String messageTypeName;
	
	@Column(name = "MESSAGE_TYPE_DEFAULT_TEXT")
	private String messageTypeDefaultText;
	
	//shopID, UserID
	@Column(name = "MESSAGE_TYPE_SCOPE")
	private String messageTypeScope;

	public int getMessageTypeId() {
		return messageTypeId;
	}

	public void setMessageTypeId(int messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	public String getMessageTypeName() {
		return messageTypeName;
	}

	public void setMessageTypeName(String messageTypeName) {
		this.messageTypeName = messageTypeName;
	}

	public String getMessageTypeDefaultText() {
		return messageTypeDefaultText;
	}

	public void setMessageTypeDefaultText(String messageTypeDefaultText) {
		this.messageTypeDefaultText = messageTypeDefaultText;
	}

	public String getMessageTypeScope() {
		return messageTypeScope;
	}

	public void setMessageTypeScope(String messageTypeScope) {
		this.messageTypeScope = messageTypeScope;
	}
	
	

}
