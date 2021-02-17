package com.rabbit.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String context = "just a simple example";
		System.out.println("Sender: " + context);
		this.rabbitTemplate.convertAndSend("hello", context);
	}
}