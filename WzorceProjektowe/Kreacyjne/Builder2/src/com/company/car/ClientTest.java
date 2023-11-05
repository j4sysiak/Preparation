package com.company.car;

import com.company.withdirector.IMotocycleBuilder;
import com.company.withdirector.Motocycle;
import lombok.ToString;
import org.junit.Test;

@ToString
public class ClientTest {

    @Test
    public void testCar1() {
        AutoBuilder autoBuilder =  AutoBuilder.builder()
                .idbuild(1)
                .brandbuild("Audi")
                .modelbuild("B80")
                .build();
        Auto auto = autoBuilder.create();
        System.out.println(auto);
    }
}
