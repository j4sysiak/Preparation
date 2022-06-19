package com.company;

public class Main {

    public static void main(String[] args) {

        //wybieramy bazowy model
        var volvo40 = new Volvo40();
        //  i dorzucamy/dekorujemy ABS'em (dodajemy ABS)
        var absCarDecorator = new AbsCarDecorator(volvo40);

        System.out.println("Cena volvo40 typu (a ABS): " + absCarDecorator.price());

        //  i dorzucamy/dekorujemy radio
        var p2 = new RadioCarDecorator(absCarDecorator);
        System.out.println("Cena volvo40 typu (ABS + Radio): " + p2.price());

        //  i dorzucamy/dekorujemy klime
        var p3 = new ClimaCarDecorator(p2);
        System.out.println("Cena volvo40 typu (ABS + Radio + Klima): " + p3.price());

    }
}
