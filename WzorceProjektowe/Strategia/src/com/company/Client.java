package com.company;

import com.company.model.Coordinate;

public class Client {

    public static void main(String[] args) {

        var start = new Coordinate();
        var stop = new Coordinate();

        // Obrazowo Google map - trzy warianty: samochód, pieszo, rower

        // strategia pozwala na używanie różnych wariantów jednego algorytmu
        // w obrębie danego obiektu w trakcie działania programu
        // oddziela szczegóły implementacyjne od warstwy biznesowej

        var bikeStrategy= new BikeStrategy();
        var mapCreator1 = new MapCreator(bikeStrategy);
        mapCreator1.createRoute(start, stop);

        var carStrategy = new CarStrategy();
        var mapCreator2 = new MapCreator(carStrategy);
        mapCreator2.createRoute(start, stop);

        var walkStrategy = new WalkStrategy();
        var mapCreator3 = new MapCreator(walkStrategy);
        mapCreator3.createRoute(start, stop);
}
}
