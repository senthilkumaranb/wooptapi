package com.woopt.api.model;

import java.security.Timestamp;

public class Chat {
	
	private int chatId;
	private String chatTitle;
	private int chatOrginatorUserId;
	private int chatReceiverGroupId;
	private int chatActionTobeRead;
	private int chatActionIsActionPresent;
	private Timestamp createdDateTime;

	private String[] chatParticipants;
	
	private ChatMessage[] userChatMessages;
	

}
