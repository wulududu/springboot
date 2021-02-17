package com.cake;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CakeUtils<T> {
    public T getBean(String bean) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CakeApplication.class);
        return (T) context.getBean(bean);
    }

    public T getBean(Class<T> bean) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CakeApplication.class);
        return  (T) context.getBean(bean);
    }

    @Bean
    public CakeService cakeBean() {
        return new CakeService() {
            @Override
            public void taste() {
                System.out.println("hello");
            }
        };
    }
}
