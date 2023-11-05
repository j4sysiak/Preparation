package com.company.withdirector;

public class Director {

    public void createHondaMotorcycle() {
        return imotocycleBuilder
                .buildBrand("Honda")
                .b("650W");
    }

    public void createYamahaMotorcycle() {
        imotocycleBuilder.buildModel("Yamaha")
                .model("1200CC Power");
    }
}
