package com.rabbit.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "cake")
public class CakeReceiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("Cake Receiver: " + context);
    }
}
