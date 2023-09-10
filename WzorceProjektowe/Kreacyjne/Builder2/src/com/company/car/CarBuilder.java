package com.company.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarBuilder{
    private int id;
    private String brand;
    private String model;

    public CarBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model);
    }

}
