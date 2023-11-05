package com.company.withdirector;

public class MotorcycleBuilder {

    private Motocycle motocycle;

    public MotorcycleBuilder setBrand(String brand) {
      this.motocycle.setBrand(brand);
      return this;
    }

    public MotorcycleBuilder setdModel(String model) {
        this.motocycle.setModel(model);
        return this;
    }

    public Motocycle build() {
        return motocycle;
    }
}
