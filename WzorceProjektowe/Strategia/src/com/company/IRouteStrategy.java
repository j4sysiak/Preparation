package com.company;

import com.company.model.Coordinate;

public interface IRouteStrategy {

    void createRoute(Coordinate start, Coordinate stop);
}
