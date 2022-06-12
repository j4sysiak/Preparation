package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {


//        Mediator - behawioralny wzorzec projektowy, pozwalający zredukować liczbę zależności pomiędzy różnymi obiektami.
//        Ogranicza bezpośrednią komunikację pomiędzy obiektami input-button-checkbox i wymusza komunikację miedzy nimi za pomocą obiektu zwanego mediatorem.
//        Dobrym przykłedem może być wieża kontroli lotów


        Button button = new Button();
        Checkbox checkbox = new Checkbox();
        Input input = new Input();

        new RegisterClientView(checkbox, button, input);

        button.click();
        //button.render(); // metoda nie podpięta do mediatora

        checkbox.select();
        //checkbox.saveValue();  // metoda nie podpięta do mediatora

        input.select();
        //input.saveValue();  // metoda nie podpięta do mediatora
    }
}
