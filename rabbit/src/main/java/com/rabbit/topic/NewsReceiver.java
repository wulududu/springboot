package com.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.rabbit.config.TopicConfig.NEWS;

@Component
@RabbitListener(queues = NEWS)
public class NewsReceiver {
    @RabbitHandler
    public void process(String context) {
        System.out.println("News Receiver: " + context);
    }
}
