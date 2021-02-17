package com.mybatis;

import com.mybatis.entity.Cake;
import com.mybatis.mapper.CakeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class CakeTests {
    @Autowired
    private CakeMapper cakeMapper;

    @Test
    void queryCakes() {
        List<Cake> cakes = cakeMapper.queryCakes();
        for (Cake cake : cakes) {
            System.out.println(cake);
        }
    }

    @Test
    void insertCake() {
        Cake cake = new Cake("Mousse Cake", 75.3, "blueberry");
        cakeMapper.insertCake(cake);
        int i = 0 / 0;
        queryCakes();
    }

    @Test
    void deleteCake() {
        cakeMapper.deleteCake("Mousse Cake");
        queryCakes();
    }
}
