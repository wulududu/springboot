package com.transaction.config;

import com.mybatis.service.CakeService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@MapperScan("com.mybatis.mapper")
@Import(CakeService.class)
public class TransActionConfig {
    @Bean
    public Queue cake() {
        return new Queue("cake");
    }
}
