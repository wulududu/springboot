package com.transaction;

import com.transaction.cake.CakeSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransactionTests {
    @Autowired
    private CakeSender cakeSender;

    @Test
    void send() {
        cakeSender.send();
        sleep();
    }

    void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
