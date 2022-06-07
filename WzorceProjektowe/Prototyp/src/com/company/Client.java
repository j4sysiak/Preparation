package com.company;

public class Client {

    /*
      Prototyp:
      kreacyjny wzorzec projektowy, który umożliwia kopiowanie istniejących już obiektów
      bez tworzenia zależności pomiędzy kodem programu, a klasami obiektów.
    */

    public static void main(String[] args) {

        Border border = Border.builder()
                .color("Red")
                .size("2px")
                .build();
    }
}
