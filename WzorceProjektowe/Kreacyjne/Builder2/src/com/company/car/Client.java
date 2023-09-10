package com.company.car;

import org.junit.Test;

public class Client {

    @Test
    public void testCar1() {
        CarBuilder carBuilder =  CarBuilder.builder()
                .idbuild(1)
                .brandbuild("Audi")
                .modelbuild("B80")
                .build();
        Auto auto = carBuilder.create();
        System.out.println(auto);
    }

//    @Test
//    public void testCar1( ) {
//        CarBuilder carBuilder = new CarBuilder();
//        Auto car = carBuilder.setId(1)
//                .setBrand("TOYOTA")
//                .setModel("Yaris")
//                .build();
//        System.out.println(car);
//    }
}
