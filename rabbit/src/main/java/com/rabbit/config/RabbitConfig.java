package com.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Bean
    public Queue multi() {
        return new Queue("multi");
    }

    @Bean
    public Queue object() {
        return new Queue("object");
    }
}