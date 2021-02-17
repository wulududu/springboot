package com.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutConfig {
    @Bean
    public Queue cake() {
        return new Queue("cake");
    }

    @Bean
    public Queue chocolate() {
        return new Queue("chocolate");
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding bindingCake(Queue cake, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(cake).to(fanoutExchange);
    }

    @Bean
    public Binding bindingChocolate(Queue chocolate, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(chocolate).to(fanoutExchange);
    }
}
