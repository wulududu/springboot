package com.rabbit;

import com.rabbit.hello.HelloSender;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloMessageTests {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello(){
        helloSender.send();
    }
}
