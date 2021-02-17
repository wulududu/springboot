package com.transaction.cake;

import com.mybatis.entity.Cake;
import com.mybatis.service.CakeService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
@RabbitListener(queues = "cake")
public class CakeReceiver {
    @Autowired
    private CakeService cakeService;

    @RabbitHandler
    public void process(String context) {
        System.out.println("ok");
//        int i = 0 / 0;
//        System.out.println("bye~");
//        cakeService.insertCake();
//        List<Cake> cakes = cakeService.queryCakes();
//        for (Cake cake : cakes) {
//            System.out.println(cake);
//        }
    }
}
