package com.company.withdirector;

public class Director {

    public void createHondaMotorcycle(IMotocycleBuilder imotocycleBuilder) {
        imotocycleBuilder
                .buildBrand("Honda")
                .b("650W");
    }

    public void createYamahaMotorcycle(IMotocycleBuilder imotocycleBuilder) {
        imotocycleBuilder.buildModel("Yamaha")
                .model("1200CC Power");
    }
}
