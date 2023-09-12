package com.company.car;

import lombok.ToString;
import org.junit.Test;

@ToString
public class Client {

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
