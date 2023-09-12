package com.company.withdirector;

import lombok.ToString;
import org.junit.Test;

@ToString
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

    @Test
    public void testDirector() {
        Director director = new Director();
        Builder builder = new Builder();

        // createHonda
        director.createHondaMotorcycle(motocycleBuilder );
        Motocycle motocycleHonda = motocycleBuilder.create();
        System.out.println(motocycleHonda);

        // createYamaha
        director.createYamahaMotorcycle(motocycleBuilder);
        Motocycle motocycleYama = motocycleBuilder.create();
        System.out.println(motocycleYama);
    }
}
