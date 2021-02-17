package com.rabbit.multi;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "this is the " + i + " message";
//        System.out.println("The First Sender: " + context);
        rabbitTemplate.convertAndSend("multi", context);
    }
}
