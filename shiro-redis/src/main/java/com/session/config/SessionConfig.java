package com.session.config;

import com.redis.config.RedisConfig;
import com.shiro.config.ShiroConfig;
import com.shiro.controller.ShiroController;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ShiroConfig.class, RedisConfig.class, com.redis.config.SessionConfig.class,
        ShiroController.class})
public class SessionConfig {
}
