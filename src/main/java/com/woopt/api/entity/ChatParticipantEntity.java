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
@Table(name = "WOOPT_CHAT_PARTICIPANT")
public class ChatParticipantEntity {
	

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CHAT_PARTICIPANT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int chatParticipantId;
	
	@Column(name = "CHAT_ID")
	private int chatId;
	
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_MOBILE")
	private int userMobile;

	public int getChatParticipantId() {
		return chatParticipantId;
	}

	public void setChatParticipantId(int chatParticipantId) {
		this.chatParticipantId = chatParticipantId;
	}

	public int getChatId() {
		return chatId;
	}

	public void setChatId(int chatId) {
		this.chatId = chatId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(int userMobile) {
		this.userMobile = userMobile;
	}
	

}
