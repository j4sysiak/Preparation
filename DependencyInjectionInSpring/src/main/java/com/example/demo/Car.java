package com.example.demo;

import lombok.*;



// używana klasa wielokrotnie więc nie możemy używać jej jako beana  (@Component @RestControllers @Controller @Bean #Service etc.))
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String type;
    private String make;
}
