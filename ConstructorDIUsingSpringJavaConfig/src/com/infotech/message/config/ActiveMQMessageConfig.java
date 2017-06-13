package com.infotech.message.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infotech.messge.ActiveMQMessage;
import com.infotech.messge.Messaging;
import com.infotech.service.Communication;

@Configuration
public class ActiveMQMessageConfig {

	@Bean
	public Communication communication(){
		return new Communication(messaging());
	}
	
	@Bean
	public Messaging messaging(){
		return new ActiveMQMessage();
	}
}
