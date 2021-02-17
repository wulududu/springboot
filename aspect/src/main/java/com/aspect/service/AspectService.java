package com.aspect.service;

import org.springframework.stereotype.Component;

@Component
public class AspectService {
    public void run() {
        System.out.println("hello aspect!");
    }
}
