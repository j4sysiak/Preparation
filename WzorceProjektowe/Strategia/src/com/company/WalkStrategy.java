package com.company;

import com.company.model.Coordinate;

public class WalkStrategy implements IRouteStrategy {
    @Override
    public void CreateRoute(Coordinate start, Coordinate stop) {
        System.out.println("WalkStrategy ...");
    }
}
