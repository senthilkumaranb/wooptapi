package com.woopt.api.model;

import java.security.Timestamp;

public class ChatMessage {

	private int chatSequenceId;
	private int userId;
	private String messagesTypeName;
	private String messagesTypeDefaultText;
	private int messageTypeScope;
	private String messagesFromdatetime;
	private String messagesText;
	private int messagesIdStatus;

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

	public String getMessagesTypeName() {
		return messagesTypeName;
	}

	public void setMessagesTypeName(String messagesTypeName) {
		this.messagesTypeName = messagesTypeName;
	}

	public String getMessagesTypeDefaultText() {
		return messagesTypeDefaultText;
	}

	public void setMessagesTypeDefaultText(String messagesTypeDefaultText) {
		this.messagesTypeDefaultText = messagesTypeDefaultText;
	}

	public int getMessageTypeScope() {
		return messageTypeScope;
	}

	public void setMessageTypeScope(int messageTypeScope) {
		this.messageTypeScope = messageTypeScope;
	}

	public String getMessagesFromdatetime() {
		return messagesFromdatetime;
	}

	public void setMessagesFromdatetime(String messagesFromdatetime) {
		this.messagesFromdatetime = messagesFromdatetime;
	}

	public String getMessagesText() {
		return messagesText;
	}

	public void setMessagesText(String messagesText) {
		this.messagesText = messagesText;
	}

	public int getMessagesIdStatus() {
		return messagesIdStatus;
	}

	public void setMessagesIdStatus(int messagesIdStatus) {
		this.messagesIdStatus = messagesIdStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chatSequenceId;
		result = prime * result + messageTypeScope;
		result = prime * result + ((messagesFromdatetime == null) ? 0 : messagesFromdatetime.hashCode());
		result = prime * result + messagesIdStatus;
		result = prime * result + ((messagesText == null) ? 0 : messagesText.hashCode());
		result = prime * result + ((messagesTypeDefaultText == null) ? 0 : messagesTypeDefaultText.hashCode());
		result = prime * result + ((messagesTypeName == null) ? 0 : messagesTypeName.hashCode());
		result = prime * result + userId;
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
		ChatMessage other = (ChatMessage) obj;
		if (chatSequenceId != other.chatSequenceId)
			return false;
		if (messageTypeScope != other.messageTypeScope)
			return false;
		if (messagesFromdatetime == null) {
			if (other.messagesFromdatetime != null)
				return false;
		} else if (!messagesFromdatetime.equals(other.messagesFromdatetime))
			return false;
		if (messagesIdStatus != other.messagesIdStatus)
			return false;
		if (messagesText == null) {
			if (other.messagesText != null)
				return false;
		} else if (!messagesText.equals(other.messagesText))
			return false;
		if (messagesTypeDefaultText == null) {
			if (other.messagesTypeDefaultText != null)
				return false;
		} else if (!messagesTypeDefaultText.equals(other.messagesTypeDefaultText))
			return false;
		if (messagesTypeName == null) {
			if (other.messagesTypeName != null)
				return false;
		} else if (!messagesTypeName.equals(other.messagesTypeName))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChatMessage [chatSequenceId=" + chatSequenceId + ", userId=" + userId + ", messagesTypeName="
				+ messagesTypeName + ", messagesTypeDefaultText=" + messagesTypeDefaultText + ", messageTypeScope="
				+ messageTypeScope + ", messagesFromdatetime=" + messagesFromdatetime + ", messagesText=" + messagesText
				+ ", messagesIdStatus=" + messagesIdStatus + "]";
	}
}