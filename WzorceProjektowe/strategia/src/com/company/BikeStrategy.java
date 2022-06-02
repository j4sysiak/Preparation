package com.company;

public class BikeStrategy implements IRouteStrategy {
    @Override
    public void CreateRoute(Coordinate start, Coordinate stop) {
        System.out.println("BikeStrategy ...");
    }
}
