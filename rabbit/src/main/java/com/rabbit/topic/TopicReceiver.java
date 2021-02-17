package com.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.rabbit.config.TopicConfig.ALL;

@Component
@RabbitListener(queues = ALL)
public class TopicReceiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("All Receiver: " + context);
    }
}
