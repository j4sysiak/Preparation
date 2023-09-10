package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Adres {
    private String ulica;
    private int numerDomu;

    public Adres(String ulica, int numerDomu) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
    }
}