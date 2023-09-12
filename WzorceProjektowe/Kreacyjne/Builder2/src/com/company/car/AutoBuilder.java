package com.company.car;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AutoBuilder {
    @Builder.Default
    int idbuild = 0;

    @Builder.Default
    String brandbuild = "";

    @Builder.Default
    String modelbuild = "";

    public Auto create() {
        return  Auto.create(this);
    }



//    public AutoBuilder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public AutoBuilder setBrand(String brand) {
//        this.brand = brand;
//        return this;
//    }
//
//    public AutoBuilder setModel(String model) {
//        this.model = model;
//        return this;
//    }
}
