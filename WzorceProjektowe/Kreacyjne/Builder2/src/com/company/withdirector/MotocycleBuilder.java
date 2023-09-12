package com.company.withdirector;

import lombok.Builder;

@Builder
public class MotocycleBuilder {

    @Builder.Default
    int idbuild = 0;

    @Builder.Default
    String brandbuild = "";

    @Builder.Default
    String modelbuild = "";

    public Motocycle create() {
        return  Motocycle.create(this);
    }



//    public MotocycleBuilder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public MotocycleBuilder setBrand(String brand) {
//        this.brand = brand;
//        return this;
//    }
//
//    public MotocycleBuilder setModel(String model) {
//        this.model = model;
//        return this;
//    }
}
