package com.infotech.service;

import com.infotech.messge.Messaging;

public class Communication {

	private Messaging message;

	public Communication(Messaging message) {
		super();
		this.message = message;
	}

	public void comminicate(){
		message.sendMessage();
	}
}
