package com.company.withdirector;

import lombok.ToString;
import org.junit.Test;

@ToString
public class ClientTest {

    @Test
    public void testDirector() {
        Director director = new Director();
        MotorcycleBuilder motocycleBuilder = new MotorcycleBuilder();

        // createHonda
        director.createHondaMotorcycle(motocycleBuilder);
        Motocycle motocycleHonda = motocycleBuilder.build();
        System.out.println(motocycleHonda);

        // createYamaha
        director.createYamahaMotorcycle(motocycleBuilder);
        Motocycle motocycleYama = motocycleBuilder.build();
    }
}
