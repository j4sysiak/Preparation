package com.company.withdirector;

import org.junit.Test;

public class Client {

    @Test
    public void testCar1() {
        MotocycleBuilder motocycleBuilder =  MotocycleBuilder.builder()
                .idbuild(1)
                .brandbuild("Kawasaki")
                .modelbuild("900R")
                .build();
        Motocycle motocycle = motocycleBuilder.create();
        System.out.println(motocycle);
    }
}
