package com.mybatis.service;

import com.mybatis.entity.Cake;
import com.mybatis.mapper.CakeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    private CakeMapper cakeMapper;

    public List<Cake> queryCakes() {
        return cakeMapper.queryCakes();
    }

    public List<Cake> insertCake() {
        Cake cake = new Cake("Mousse Cake", 75.3, "blueberry");
        cakeMapper.insertCake(cake);
        int i = 0 / 0;
        return queryCakes();
    }

    public List<Cake> deleteCake() {
        cakeMapper.deleteCake("Mousse Cake");
        return queryCakes();
    }
}
