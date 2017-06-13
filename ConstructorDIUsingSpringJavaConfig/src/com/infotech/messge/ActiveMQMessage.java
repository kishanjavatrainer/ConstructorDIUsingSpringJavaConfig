package com.infotech.messge;

public class ActiveMQMessage implements Messaging {

	/* (non-Javadoc)
	 * @see com.infotech.messge.Messaging#sendMessage()
	 */
	@Override
	public void sendMessage(){
		System.out.println("Sending message Via Active MQ..");
	}
}
