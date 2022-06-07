package com.company;

import com.company.model.Coordinate;

public class MapCreator {

    private IRouteStrategy iRouteStrategy;  // wartość tego wstrzykujemy przez konstruktor do MapCreator

    //Dependency Injection przez constructor
    public MapCreator(IRouteStrategy routeStrategy) {
        this.iRouteStrategy = routeStrategy;
    }

    public void createRoute(Coordinate start, Coordinate stop) {
        iRouteStrategy.CreateRoute(start, stop);
    }
}
