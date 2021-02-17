package com.cake;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class ServiceBean<T> implements FactoryBean<T> {
    private Class<T> classType;

    public ServiceBean(Class<T> classType) {
        this.classType = classType;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(
            CakeService.class.getClassLoader(),
            new Class[]{CakeService.class},
            (proxy, method, params) -> {
                Object result = null;
                if ("taste".equals(method.getName())) {
                    System.out.println("good taste");
                    result = "good taste!";
                }
                return result;
            });
    }

    @Override
    public Class<T> getObjectType() {
        return classType;
    }
}
