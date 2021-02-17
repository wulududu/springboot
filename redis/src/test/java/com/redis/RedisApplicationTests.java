package com.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.awt.*;

@SpringBootTest
class RedisApplicationTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void stringTemplate() {
        ValueOperations operations = stringRedisTemplate.opsForValue();
        operations.set("name", "chocolate");
        System.out.println(operations.get("name"));
    }

    @Test
    void template() {
        ValueOperations operations = redisTemplate.opsForValue();
//        operations.set("name", "chocolate");
//        System.out.println(operations.get("name"));
        operations.set("point", new Point(2, 3));
        Point point = (Point) operations.get("point");
        System.out.println(point);
//        redisTemplate.delete("name");
//        System.out.println(operations.get("name"));
    }
}
