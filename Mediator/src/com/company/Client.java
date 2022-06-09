package com.company;

public class Client {

    public static void main(String[] args) {

//        Behawioralny wzorzec projektowy, pozwalający zredukować liczbę zależności pomiędzy różnymi obiektami.
//        Ogranicza bezpośrednią komunikację pomiędzy obiektami i wymusza komunikację miedzy nimi za pomocą obiektu zwanego mediatorem.
//        Dobrym przykłedem może być wieża kontroli lotów


        Button button = new Button();
        Checkbox checkbox = new Checkbox();
        Input input = new Input();

        new RegisterClientView(checkbox, button, input);

        button.click();
        button.render();

        checkbox.select();
        checkbox.saveValue();

        input.select();
        input.saveValue();
    }
}
