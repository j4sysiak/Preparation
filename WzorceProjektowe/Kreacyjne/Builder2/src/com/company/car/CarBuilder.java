package com.company.car;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarBuilder {
    @Builder.Default
    private int idbuild = 0;

    @Builder.Default
    private String brandbuild = "";

    @Builder.Default
    private String modelbuild = "";

    public Auto create() {
        return  Auto.create(this);
    }



//    public CarBuilder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public CarBuilder setBrand(String brand) {
//        this.brand = brand;
//        return this;
//    }
//
//    public CarBuilder setModel(String model) {
//        this.model = model;
//        return this;
//    }
}
