package com.aspect.service;

import org.springframework.stereotype.Component;

@Component
public class AnotherAspectService {
    public void run() {
        System.out.println("hello, the another aspect!");
    }
}
