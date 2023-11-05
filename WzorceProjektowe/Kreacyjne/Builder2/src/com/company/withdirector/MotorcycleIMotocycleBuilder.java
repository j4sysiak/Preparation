package com.company.withdirector;

public class MotorcycleIMotocycleBuilder implements IMotocycleBuilder {

    private String brand;
    private String model;

    @Override
    public IMotocycleBuilder buildBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public IMotocycleBuilder buildModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Motocycle getMotocycle() {
        return null;
    }
}
