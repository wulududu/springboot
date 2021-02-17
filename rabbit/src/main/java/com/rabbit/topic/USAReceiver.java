package com.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.rabbit.config.TopicConfig.USA;

@Component
@RabbitListener(queues = USA)
public class USAReceiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("USA Receiver: " + context);
    }
}
