package com.company;

import org.junit.Test;

public class Client {
    /*
      Prototyp:
      kreacyjny wzorzec projektowy, który umożliwia kopiowanie istniejących już obiektów  (shallow and deep cloning)
      (deep copy - nie kopiujemy referencji tylko tworzymy nowe obiekty powiązane)
      bez tworzenia zależności pomiędzy kodem programu, a klasami obiektów.
    */

    @Test
    public void test() throws CloneNotSupportedException {

        Circle c1 = Circle.builder()
                .radius(5)
                .x(1)
                .y(2)
                .border(Border.builder()
                        .color("Red")
                        .size("2px")
                        .build())
                .build();

        c1.render();  // to pestka

        // to ważne - cloning zwraca obiekt bazowy Shape, więc trzeba rzutować
        Circle deepCopyOfC1 = (Circle) c1.cloning();

        if (c1 == deepCopyOfC1) {
            System.out.println("==");
        } else {
            System.out.println("jestem po deep copy zupełnie nowym obiektem z nowymi referencjami do obiektu klasy Border");
        }

        //deep copy powoduje uniezależnienie się od referencji do obiektów, które ma orginał (Border) - no bo ma nowe obiekty na podstawie starych wartości.
         if (c1.getBorder() == deepCopyOfC1.getBorder()) {
             System.out.println("==");
         } else {
             System.out.println("jestem po deep copy zupełnie nowym obiektem z nowymi referencjami do obiektu klasy Border");
         }

        System.out.println("koniec");
    }
}
