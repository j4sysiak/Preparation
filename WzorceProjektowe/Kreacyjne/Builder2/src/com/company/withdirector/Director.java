package com.company.withdirector;

public class Director {

    public void createKawasakiMotorcycle(MotocycleBuilder kawasakiMotorcycle) {

        MotocycleBuilder vv = kawasakiMotorcycle.builder()
                .idbuild(1)
                .brandbuild("")
                .modelbuild("")
                .build();

        System.out.println();
    }

}
