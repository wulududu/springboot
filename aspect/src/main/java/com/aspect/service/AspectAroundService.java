package com.aspect.service;

import org.springframework.stereotype.Component;

@Component
public class AspectAroundService {
    public void run() {
        System.out.println("the around aspect!");
    }
}
