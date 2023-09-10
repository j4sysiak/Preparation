package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Osoba implements Cloneable {
    private String imie;
    private Adres adres;

    public Osoba(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public Object ()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}