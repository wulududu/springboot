package com.aspect.service;

import org.springframework.stereotype.Component;

@Component
public class AspectReturnService {
    public String run() {
        System.out.println("hello aspect return service!");
        return "this is a return data";
    }
}
