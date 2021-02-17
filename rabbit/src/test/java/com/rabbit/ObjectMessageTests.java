package com.rabbit;

import com.rabbit.entity.User;
import com.rabbit.hello.HelloSender;
import com.rabbit.object.ObjectSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMessageTests {
    @Autowired
    private ObjectSender objectSender;

    @Test
    public void test(){
        User user = new User();
        user.setUsername("cake");
        user.setPassword("123456");
        objectSender.send(user);
    }
}
