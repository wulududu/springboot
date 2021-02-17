package com.rabbit.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String routingKey) {
        String context = "this is the " + routingKey + " message";
        rabbitTemplate.convertAndSend("topicExchange", routingKey, context);
    }
}
