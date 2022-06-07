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

        var strategy1= new BikeStrategy();
        var mapCalculator = new MapCreator(strategy1);
        mapCalculator.createRoute(start, stop);

        var strategy2 = new CarStrategy();
        var mapCalculator2 = new MapCreator(strategy2);
        mapCalculator2.createRoute(start, stop);

        var strategy3 = new WalkStrategy();
        var mapCalculator3 = new MapCreator(strategy3);
        mapCalculator3.createRoute(start, stop);
}
}
