package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarApiController {

    @GetMapping
    public String seyHello() {
        return "Hello";
    }
}
