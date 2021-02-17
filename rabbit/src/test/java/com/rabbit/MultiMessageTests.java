package com.rabbit;

import com.rabbit.multi.FirstSender;
import com.rabbit.multi.SecondSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultiMessageTests {
    @Autowired
    private FirstSender firstSender;

    @Autowired
    private SecondSender secondSender;

    @Test
    public void oneToMany() {
        for (int i = 1; i <= 10; i++) {
            firstSender.send(i);
        }
    }

    @Test
    public void manyToMany() {
        for (int i = 1; i <= 10; i += 2) {
            firstSender.send(i);
            secondSender.send(i + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
