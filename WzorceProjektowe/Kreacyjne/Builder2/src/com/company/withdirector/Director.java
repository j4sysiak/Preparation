package com.company.withdirector;

public class Director {

    public void createHondaMotorcycle(Builder builder) {
        builder.brand("Honda")
                .model("650W");
    }

    public void createYamahaMotorcycle(Builder builder) {
        builder.brand("Yamaha")
                .model("1200CC Power");
    }
}
