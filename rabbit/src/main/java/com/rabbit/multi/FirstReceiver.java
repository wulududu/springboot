package com.rabbit.multi;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "multi")
public class FirstReceiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("The First Receiver: " + context);
    }
}
