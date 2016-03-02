package com.woopt.api.model;

import java.security.Timestamp;

public class Chat {
	
	private int chat_id;
	private String chat_title;
	private int chat_orginator_user_id;
	private int chat_receiver_group_id;
	private int chat_action_toberead;
	private int chat_action_isactionpresent;
	private Timestamp createddatetime;

	private String[] chatParticipants;
	
	private ChatMessage[] userChatMessages;
	

}
