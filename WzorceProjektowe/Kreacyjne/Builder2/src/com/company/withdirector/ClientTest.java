package com.company.withdirector;

import lombok.ToString;
import org.junit.Test;

@ToString
public class ClientTest {

    @Test
    public void test() {
        Director director = new Director();
        MotorcycleBuilder motocycleBuilder = new MotorcycleBuilder();

        Motocycle honda = director.createHondaMotorcycle(motocycleBuilder);
        Motocycle yamaha = director.createYamahaMotorcycle(motocycleBuilder);
    }
}
