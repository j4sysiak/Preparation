package com.company.withdirector;

import lombok.*;

@Builder
@Getter
@Setter
public class Motocycle {

    @Builder.Default
    private int id = 0;

    @Builder.Default
    private String brand = "";

    @Builder.Default
    private String model = "";

    public static Motocycle create(com.company.withdirector.MotocycleBuilder motocycleBuilder) {
        return  Motocycle.builder()
                .id(motocycleBuilder.idbuild)
                .brand(motocycleBuilder.brandbuild)
                .model(motocycleBuilder.modelbuild)
                .build();
    }
}
