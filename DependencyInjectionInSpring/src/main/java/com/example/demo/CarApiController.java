package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarApiController {

    //Spring w momencie uruchomienia przeszukuje klasy o odpowiednich adnotacjach
    //w klasie Car nie widzi żadnej adnotacji
    //w klasie CarApiController widzi @RestController - więc ta klasa trafia do Spring Contextu jako Bean
    //w klasie CarService widzi adnotację @Service - więc ta klasa trafia do Spring Contextu jako Bean
    //w klasie CarApiController widzi adnotację na polu prywatnym @Autowired - szuka w Context Springa klasę, która jest przez niego zarządzana
    // i widzi ją tzn. CarSerwice - bierze ją i wstrzykuje do klasy CarApiController

    // rodzaje wstrzykiwania: do pola, konstruktora i settera

    //wstrzykiwanie do pola
    //@Autowired
    private CarService carService;

    //lub wstrzykiwanie poprzez settera
    //@Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    //lub wstrzykiwanie do konstruktora - zalecana metoda wstrzykiwania
    @Autowired
    public CarApiController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/hello")
    public String seyHello() {
        return "Hello";
    }

    @GetMapping("/get-cars")
    public List<Car> getCarList() {
        return carService.getCarList();
    }
}
