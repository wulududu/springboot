package com.rabbit;

import com.rabbit.topic.TopicSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TopicMessageTests {
    @Autowired
    private TopicSender topicSender;

    @Test
    public void send() {
        topicSender.send("usa.news");
        topicSender.send("usa.weather");
        topicSender.send("europe.news");
        topicSender.send("europe.weather");
        sleep();
    }

    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
