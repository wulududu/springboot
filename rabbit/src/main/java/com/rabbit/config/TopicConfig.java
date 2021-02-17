package com.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {
    public static final String NEWS = "*.news";
    public static final String USA = "usa.*";
    public static final String ALL = "#";

    @Bean
    public Queue news() {
        return new Queue(NEWS);
    }

    @Bean
    public Queue usa() {
        return new Queue(USA);
    }

    @Bean
    public Queue all() {
        return new Queue(ALL);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingNews(Queue news, TopicExchange topicExchange) {
        return BindingBuilder.bind(news).to(topicExchange).with(NEWS);
    }

    @Bean
    public Binding bindingUSA(Queue usa, TopicExchange topicExchange) {
        return BindingBuilder.bind(usa).to(topicExchange).with(USA);
    }

    @Bean
    public Binding bindingALL(Queue all, TopicExchange topicExchange) {
        return BindingBuilder.bind(all).to(topicExchange).with(ALL);
    }
}
