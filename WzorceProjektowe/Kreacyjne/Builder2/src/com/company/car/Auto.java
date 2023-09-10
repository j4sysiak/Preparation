package com.company.car;

import lombok.Builder;

@Builder
public class Auto {
    @Builder.Default
    private int id = 0;

    @Builder.Default
    private String brand = "";

    @Builder.Default
    private String model = "";

    public static Auto create(CarBuilder carBuilder) {
      return  Auto.builder()
                .id(carBuilder.getIdbuild())
                .brand(carBuilder.getBrandbuild())
                .model(carBuilder.getModelbuild())
                .build();
    }
}