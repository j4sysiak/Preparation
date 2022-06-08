package com.company;

import com.company.model.Coordinate;

public class CarStrategy implements IRouteStrategy {
    @Override
    public void createRoute(Coordinate start, Coordinate stop) {
        System.out.println("CarStrategy ...");
    }
}
