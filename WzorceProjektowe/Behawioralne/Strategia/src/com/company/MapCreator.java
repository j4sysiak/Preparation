package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class MapCreator {

    private IRouteStrategy iRouteStrategy;  // wartość tego wstrzykujemy przez konstruktor do MapCreator

    //Dependency Injection przez constructor
    public MapCreator(IRouteStrategy routeStrategy) {
        this.iRouteStrategy = routeStrategy;
    }

    public void creatingRoute(Coordinate start, Coordinate stop) {
        iRouteStrategy.createRoute(start, stop);
    }
}
