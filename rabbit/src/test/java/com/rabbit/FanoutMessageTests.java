package com.rabbit;

import com.rabbit.fanout.FanoutSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FanoutMessageTests {
    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void send() {
        fanoutSender.send();
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
