package com.feign.controller;

import com.feign.client.FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FeignController {
    @Autowired
    private FeignClient feignClient;

    @GetMapping("/")
    public Map<String, String> index() {
        return feignClient.message();
    }
}
