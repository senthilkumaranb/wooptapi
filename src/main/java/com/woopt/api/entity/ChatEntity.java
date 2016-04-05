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
@Table(name = "WOOPT_CHAT")
public class ChatEntity {
	

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CHAT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int chatId;
	
	@Column(name = "CHAT_TITLE")
	private String chatTitle;
	
	@Column(name = "CHAT_ORIGINATOR_USER_ID")
	private int chatOriginatorUserId;
	
	@Column(name = "CHAT_IS_GROUPCHAT")
	private int chatIsGroupChat;
	
	@Column(name = "CHAT_RECEIVER_ID")
	private int chatReceiverGroupId;
	
	@Column(name = "CHAT_TOBEREAD")
	private int chatToberead;
	
	@Column(name = "CHAT_ACTION_ISPRESENT")
	private int chatActionIsPresent;
	
	@Column(name = "CHAT_STATUS")
	private int chatStatus;
	
	@Column(name = "CHAT_SHOP_ID")
	private int chatShopId;
	
	@Column(name = "CREATED_DATETIME")
	private Timestamp createdDatetime;
	
	@Column(name = "LAST_UPDATED_DATETIME")
	private Timestamp lastUpdatedDatetime;

	public int getChatId() {
		return chatId;
	}

	public void setChatId(int chatId) {
		this.chatId = chatId;
	}

	public String getChatTitle() {
		return chatTitle;
	}

	public void setChatTitle(String chatTitle) {
		this.chatTitle = chatTitle;
	}

	public int getChatOriginatorUserId() {
		return chatOriginatorUserId;
	}

	public void setChatOriginatorUserId(int chatOriginatorUserId) {
		this.chatOriginatorUserId = chatOriginatorUserId;
	}

	public int getChatIsGroupChat() {
		return chatIsGroupChat;
	}

	public void setChatIsGroupChat(int chatIsGroupChat) {
		this.chatIsGroupChat = chatIsGroupChat;
	}

	public int getChatReceiverGroupId() {
		return chatReceiverGroupId;
	}

	public void setChatReceiverGroupId(int chatReceiverGroupId) {
		this.chatReceiverGroupId = chatReceiverGroupId;
	}

	public int getChatToberead() {
		return chatToberead;
	}

	public void setChatToberead(int chatToberead) {
		this.chatToberead = chatToberead;
	}

	public int getChatActionIsPresent() {
		return chatActionIsPresent;
	}

	public void setChatActionIsPresent(int chatActionIsPresent) {
		this.chatActionIsPresent = chatActionIsPresent;
	}

	public int getChatStatus() {
		return chatStatus;
	}

	public void setChatStatus(int chatStatus) {
		this.chatStatus = chatStatus;
	}

	public int getChatShopId() {
		return chatShopId;
	}

	public void setChatShopId(int chatShopId) {
		this.chatShopId = chatShopId;
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
