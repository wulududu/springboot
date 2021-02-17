package com.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class RibbonClient {
    @Autowired
    private RestTemplate restTemplate;

    public Map<String, String> message() {
        return restTemplate.getForObject("http://cake-client/", Map.class);
    }
}
