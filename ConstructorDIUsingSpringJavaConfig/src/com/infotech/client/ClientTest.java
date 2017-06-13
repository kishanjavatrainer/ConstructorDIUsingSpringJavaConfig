package com.infotech.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infotech.message.config.ActiveMQMessageConfig;
import com.infotech.service.Communication;

public class ClientTest {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = null;
		
		try {
			ctx = new AnnotationConfigApplicationContext(ActiveMQMessageConfig.class);
			Communication communication = ctx.getBean("communication", Communication.class);
			communication.comminicate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(ctx != null)
				ctx.close();
		}
	}

}
