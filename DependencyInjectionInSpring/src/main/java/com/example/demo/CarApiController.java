package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarApiController {

    //Spring w momencie uruchomienia przeszukuje klasy o odpowiednich adnotacjach
    //w klasie Car nie widzi żadnej adnotacji
    //w klasie CarApiController widzi @RestController - więc ta klasa trafia do Spring Contextu jako Bean
    //w klasie CarService widzi adnotację @Service - więc ta klasa trafia do Spring Contextu jako Bean
    //w klasie CarApiController widzi adnotację na polu prywatnym @Autowired - szuka w Context Springa klasę, która jest przez niego zarządzana
    // i widzi ją tzn. CarSerwice - bierze ją i wstrzykuje do klasy CarApiController

    @Autowired
    private CarService carService;


    @GetMapping("/hello")
    public String seyHello() {
        return "Hello";
    }
}
