package com.company.withdirector;

import lombok.ToString;
import org.junit.Test;

@ToString
public class ClientTest {

    @Test
    public void testDirector() {
        Director director = new Director();
        IMotocycleBuilder imotocycleBuilder = new IMotocycleBuilder();

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
