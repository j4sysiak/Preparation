package com.company;

import com.company.car.Car;
import com.company.car.CarBuilder;
import com.company.computer.Computer;
import org.junit.Test;

public class Client {

    @Test
    public void testComputer( ) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder()
                .setHDD("500GB")
                .setRAM("256MB")
                .build();
        System.out.println(comp);
    }

    @Test
    public void testCar( ) {
        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.setId(1)
                .setBrand("TOYOTA")
                .setModel("Yaris")
                .build();
        System.out.println(car);
    }
}
