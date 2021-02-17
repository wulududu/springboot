package com.client.controller;

import com.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public Map<String, String> index() {
        return clientService.message();
    }
}
