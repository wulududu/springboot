package com.ribbon.controller;

import com.ribbon.client.RibbonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RibbonController {
    @Autowired
    private RibbonClient ribbonClient;

    @GetMapping("/")
    public Map<String, String> index() {
        return ribbonClient.message();
    }
}
