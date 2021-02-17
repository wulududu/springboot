package com.cake;

import org.springframework.beans.factory.annotation.Value;

//@Configuration
public class Cake {
    @Value("${cake.taste}")
    private String taste;
    @Value("${cake.name}")
    private String name;
    @Value("${cake.price}")
    private String price;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cake{");
        sb.append("taste='").append(taste).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
