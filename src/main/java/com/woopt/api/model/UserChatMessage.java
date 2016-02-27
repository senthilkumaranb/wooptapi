package com.woopt.api.model;

import java.security.Timestamp;

public class UserChatMessage {
	
	private int chat_sequence_id;
	private int user_id;
	private String messages_type_name;
	private String messages_type_default_text;
	private int message_type_scope;
	private Timestamp messages_fromdatetime;
	private String messages_text;
	private int messages_id_status;

}
