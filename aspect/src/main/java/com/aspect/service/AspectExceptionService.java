package com.aspect.service;

import org.springframework.stereotype.Component;

@Component
public class AspectExceptionService {
    public void run() {
        throw new RuntimeException("sorry, there is a error!");
    }
}
