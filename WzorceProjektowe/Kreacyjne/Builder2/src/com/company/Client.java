package com.company;

import org.junit.Test;

public class Client {

    @Test
    public void test( ) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder()
                .setHDD("500GB")
                .setRAM("256MB")
                .build();
        System.out.println(comp);
    }
}
