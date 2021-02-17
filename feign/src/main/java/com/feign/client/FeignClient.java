package com.feign.client;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@org.springframework.cloud.openfeign.FeignClient("cake-client")
public interface FeignClient {
    @GetMapping("/")
    Map<String, String> message();
}
