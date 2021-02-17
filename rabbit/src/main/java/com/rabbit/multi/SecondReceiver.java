package com.rabbit.multi;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "multi")
public class SecondReceiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("The Second Receiver: " + context);
    }
}
