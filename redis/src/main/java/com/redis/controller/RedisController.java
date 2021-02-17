package com.redis.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.awt.*;
import java.util.UUID;

@RestController
public class RedisController {
//    @GetMapping("/")
//    public String home() {
//        System.out.println("----- home -----");
//        return "hello";
//    }

    @GetMapping("/point")
    @Cacheable("dot")
    public Point point() {
        System.out.println("----- point -----");
        return new Point(1,2);
    }

    @GetMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
