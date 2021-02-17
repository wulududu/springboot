package com.cake;

import com.config.autoconfig.CakeProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CakeApplicationTests {
    @Autowired
    private CakeService cakeService;

    @Autowired
    private CakeProperties properties;

    @Test
    void contextLoads() {
//        cakeService.taste();
        System.out.println(properties);
    }
}
