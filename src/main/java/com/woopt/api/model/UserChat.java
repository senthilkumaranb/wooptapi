package com.woopt.api.model;

import java.security.Timestamp;

public class UserChat {
	
	private int chat_id;
	private String chat_title;
	private int chat_orginator_user_id;
	private int chat_receiver_group_id;
	private int chat_action_toberead;
	private int chat_action_isactionpresent;
	private Timestamp createddatetime;

	private ChatParticipants[] chatParticipants;
	
	private UserChatMessage[] userChatMessages;
	

}
