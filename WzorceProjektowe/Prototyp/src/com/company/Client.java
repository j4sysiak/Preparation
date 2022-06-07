package com.company;

public class Client {

    /*
      Prototyp:
      kreacyjny wzorzec projektowy, który umożliwia kopiowanie istniejących już obiektów
      bez tworzenia zależności pomiędzy kodem programu, a klasami obiektów.
    */

    public static void main(String[] args) throws CloneNotSupportedException {

        Circle c1 = Circle.builder()
                .radius(5)
                .x(1)
                .y(2)
                .border(Border.builder()
                        .color("Red")
                        .size("2px")
                        .build())
                .build();

        Circle deepCopy = (Circle) c1.cloning();

        if (c1 == deepCopy) {
            System.out.println("==");
        } else {
            System.out.println("jestem po deep copy zupełnie nowym obiektem z nowymi referencjami do obiektu klasy Border");
        }

        //deep copy powoduje uniezależnienie się od referencji do obiektów, które ma orginał (Border)
         if (c1.getBorder() == deepCopy.getBorder()) {
             System.out.println("==");
         } else {
             System.out.println("jestem po deep copy zupełnie nowym obiektem z nowymi referencjami do obiektu klasy Border");
         }

        System.out.println("koniec");
    }
}
