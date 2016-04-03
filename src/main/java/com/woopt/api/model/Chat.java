package com.woopt.api.model;

import java.sql.Timestamp;
import java.util.Arrays;

public class Chat {
	
	private int chatId;
	private String chatTitle;
	private int chatOrginatorUserId;
	private int chatReceiverGroupId;
	private int chatActionTobeRead;
	private int chatActionIsActionPresent;
	private String createdDateTime;

	private String[] chatParticipants;
	
	private ChatMessage[] userChatMessages;

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

	public int getChatOrginatorUserId() {
		return chatOrginatorUserId;
	}

	public void setChatOrginatorUserId(int chatOrginatorUserId) {
		this.chatOrginatorUserId = chatOrginatorUserId;
	}

	public int getChatReceiverGroupId() {
		return chatReceiverGroupId;
	}

	public void setChatReceiverGroupId(int chatReceiverGroupId) {
		this.chatReceiverGroupId = chatReceiverGroupId;
	}

	public int getChatActionTobeRead() {
		return chatActionTobeRead;
	}

	public void setChatActionTobeRead(int chatActionTobeRead) {
		this.chatActionTobeRead = chatActionTobeRead;
	}

	public int getChatActionIsActionPresent() {
		return chatActionIsActionPresent;
	}

	public void setChatActionIsActionPresent(int chatActionIsActionPresent) {
		this.chatActionIsActionPresent = chatActionIsActionPresent;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String[] getChatParticipants() {
		return chatParticipants;
	}

	public void setChatParticipants(String[] chatParticipants) {
		this.chatParticipants = chatParticipants;
	}

	public ChatMessage[] getUserChatMessages() {
		return userChatMessages;
	}

	public void setUserChatMessages(ChatMessage[] userChatMessages) {
		this.userChatMessages = userChatMessages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chatActionIsActionPresent;
		result = prime * result + chatActionTobeRead;
		result = prime * result + chatId;
		result = prime * result + chatOrginatorUserId;
		result = prime * result + Arrays.hashCode(chatParticipants);
		result = prime * result + chatReceiverGroupId;
		result = prime * result + ((chatTitle == null) ? 0 : chatTitle.hashCode());
		result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
		result = prime * result + Arrays.hashCode(userChatMessages);
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
		Chat other = (Chat) obj;
		if (chatActionIsActionPresent != other.chatActionIsActionPresent)
			return false;
		if (chatActionTobeRead != other.chatActionTobeRead)
			return false;
		if (chatId != other.chatId)
			return false;
		if (chatOrginatorUserId != other.chatOrginatorUserId)
			return false;
		if (!Arrays.equals(chatParticipants, other.chatParticipants))
			return false;
		if (chatReceiverGroupId != other.chatReceiverGroupId)
			return false;
		if (chatTitle == null) {
			if (other.chatTitle != null)
				return false;
		} else if (!chatTitle.equals(other.chatTitle))
			return false;
		if (createdDateTime == null) {
			if (other.createdDateTime != null)
				return false;
		} else if (!createdDateTime.equals(other.createdDateTime))
			return false;
		if (!Arrays.equals(userChatMessages, other.userChatMessages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chat [chatId=" + chatId + ", chatTitle=" + chatTitle + ", chatOrginatorUserId=" + chatOrginatorUserId
				+ ", chatReceiverGroupId=" + chatReceiverGroupId + ", chatActionTobeRead=" + chatActionTobeRead
				+ ", chatActionIsActionPresent=" + chatActionIsActionPresent + ", createdDateTime=" + createdDateTime
				+ ", chatParticipants=" + Arrays.toString(chatParticipants) + ", userChatMessages="
				+ Arrays.toString(userChatMessages) + "]";
	}
}
