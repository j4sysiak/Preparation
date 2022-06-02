package com.company;

public class MapCreator {

    private IRouteStrategy iRouteStrategy;  // wartość tego wstrzykujemy przez konstruktor do MapCreator

    //Depemdency injection throut constructor
    public MapCreator(IRouteStrategy routeStrategy) {
        this.iRouteStrategy = routeStrategy;
    }

    public void createRoute(Coordinate start, Coordinate stop) {
        iRouteStrategy.CreateRoute(start, stop);
    }
}
