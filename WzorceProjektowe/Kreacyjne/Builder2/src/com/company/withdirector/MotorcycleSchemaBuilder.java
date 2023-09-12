package com.company.withdirector;

public class MotorcycleSchemaBuilder implements Builder {

    private int id;
    private String brand;
    private String model;

    @Override
    public Builder id(int id) {
        this.id = id;
    }

    @Override
    public Builder brand(String brand) {
        return null;
    }

    @Override
    public Builder model(String model) {
        return null;
    }
}
