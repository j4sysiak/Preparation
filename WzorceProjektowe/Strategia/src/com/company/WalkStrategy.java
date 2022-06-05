package com.company;

public class WalkStrategy implements IRouteStrategy {
    @Override
    public void CreateRoute(Coordinate start, Coordinate stop) {
        System.out.println("WalkStrategy ...");
    }
}
