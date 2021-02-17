package com.aspect;

import com.aspect.service.AspectAroundService;
import com.aspect.service.AspectExceptionService;
import com.aspect.service.AspectReturnService;
import com.aspect.service.AspectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AspectTest {
    @Autowired
    private AspectService aspectService;

    @Autowired
    private AspectExceptionService aspectExceptionService;

    @Autowired
    private AspectReturnService aspectReturnService;

    @Autowired
    private AspectAroundService aspectAroundService;

    @Test
    void test() {
        aspectService.run();
    }

    @Test
    void errorTest() {
        aspectExceptionService.run();
    }

    @Test
    void returningTest(){
        aspectReturnService.run();
    }

    @Test
    void aroundTest() {
        aspectAroundService.run();
    }
}
