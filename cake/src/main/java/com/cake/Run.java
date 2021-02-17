package com.cake;

public class Run {
    private static CakeUtils<CakeService> utils = new CakeUtils();

    public static void main(String[] args) {
        CakeService cake = utils.getBean(CakeService.class);
        cake.taste();
    }
}
