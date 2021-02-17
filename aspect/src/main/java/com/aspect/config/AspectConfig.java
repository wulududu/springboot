package com.aspect.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectConfig {
    @Before("execution(* run())")
    public void before() {
        System.out.println("========前置通知========");
    }

    @After("execution(* *..service..*(..))")
    public void after() {
        System.out.println("========最终通知========:");
    }

    @AfterThrowing(value = "execution(* *..AspectExceptionService.*(..))", throwing = "e")
    public void afterThrowing(Exception e) {
        System.out.println("========异常通知========:" + e);
    }

    @AfterReturning(value = "execution(* com.aspect.service.*.*())", returning = "result")
    public void afterReturning(String result) {
        System.out.println("========后置通知========:" + result);
    }

    @Around(value = "execution(* *..AspectAroundService.run())")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("========环绕通知:前========:");
        Object proceed = point.proceed();
        System.out.println("========环绕通知:后========:");
        return proceed;
    }
}
