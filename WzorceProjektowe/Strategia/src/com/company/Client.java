package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {

        var start = new Coordinate();
        var stop = new Coordinate();

        // Obrazowo Google map - trzy strategie wyboru drogi do jednego celu: samochód, pieszo, rower
        // Zaproponowano wzorzec strategii w kontekście klasy MapCreator
        // W zależlości od wyboru użytkownika, klasa ta dostanie konkretną implementację dla samochód, pieszo, rower
        // Dla klasy MapStrategy nie ma znaczenia jaką strategię dostanie
        // strategia zostaje wstrzyknięta poprzez konstruktor do MapStrategy
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
