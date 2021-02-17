package com.mybatis.controller;

import com.mybatis.entity.Cake;
import com.mybatis.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CakeController {
    @Autowired
    private CakeService cakeService;

    @GetMapping("/")
    public String index() {
        return "hello";
    }

    @GetMapping("/cakes")
    public List<Cake> cakes() {
        return cakeService.queryCakes();
    }

    @GetMapping("/insert")
    public List<Cake> insertCake() {
        return cakeService.insertCake();
    }

    @GetMapping("/delete")
    public List<Cake> deleteCake() {
        return cakeService.deleteCake();
    }
}
