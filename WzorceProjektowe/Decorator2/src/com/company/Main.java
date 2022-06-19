package com.company;

public class Main {

    public static void main(String[] args) {

        //wybieramy bazowy model
        var v1 = new Volvo40();
        //  i dorzucamy/dekorujemy ABS'em (dodajemy ABS)
        var absCarDecorator = new AbsCarDecorator(v1);

        System.out.println("Cena volvo40 typu (a ABS): " + absCarDecorator.price());

        //  i dorzucamy/dekorujemy radio
        var v2 = new RadioCarDecorator(absCarDecorator);
        System.out.println("Cena volvo40 typu (ABS + Radio): " + v2.price());

        //  i dorzucamy/dekorujemy klime
        var v3 = new ClimaCarDecorator(v2);
        System.out.println("Cena volvo40 typu (ABS + Radio + Klima): " + v3.price());
    }
}
