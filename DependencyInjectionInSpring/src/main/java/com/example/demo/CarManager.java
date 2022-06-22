package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//obiekt takiej klasy to Singleton - tylko jedna instancja może być w obrębie całego procesu
//to jest Beat Springa zarządzany przez Context Springa
@Service
public class CarManager {

    private List<Car> carList;


    public CarManager() {
        this.carList = new ArrayList();
        carList.add(new Car("Polo", "VW"));
        carList.add(new Car("Starlet", "Toyota"));
    }
}
