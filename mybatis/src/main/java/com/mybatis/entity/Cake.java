package com.mybatis.entity;

public class Cake {
    private Integer id;
    private String name;
    private Double price;
    private String taste;

    public Cake() {
    }

    public Cake(String name, Double price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cake{");
        sb.append("cakeId=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append(", taste='").append(taste).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
