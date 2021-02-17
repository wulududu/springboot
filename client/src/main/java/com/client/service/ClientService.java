package com.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClientService {
    @Value("${server.port}")
    private String port;

    public Map<String, String> message() {
        HashMap<String, String> result = new HashMap<>();
        result.put("port", port);
        return result;
    }
}
