package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MapCreator {

    private IRouteStrategy iRouteStrategy;  // wartość iRouteStrategy wstrzykujemy przez konstruktor do MapCreator

    //Dependency Injection przez constructor
    public MapCreator(IRouteStrategy routeStrategy) {
        this.iRouteStrategy = routeStrategy;  // wartość iRouteStrategy wstrzykujemy przez konstruktor do MapCreator
    }


    // to jest taki przekaznik (switch), w zaleznoci na jakim elemencie zdefiniujemz interfej to taka będie strategia  /- droga do celu (piechota, rower, samochód)
    public void creatingRoute(Coordinate start, Coordinate stop) {
        iRouteStrategy.createRoute(start, stop);
    }
}
