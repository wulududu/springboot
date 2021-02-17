package com.rabbit.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "chocolate")
public class ChocolateReceiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("Chocolate Receiver: " + context);
    }
}
