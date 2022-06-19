package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void main() {


        // wzorzec Obserwator używamy, jeżeli zmiany jednego obiektu mogą wymagać zmian w innych obiektach,
        // a konkretny zestaw obiektów nie jest nam znany na początku lub jego stan się zmienia

        var observer1 = new Observer("observer1");
        var observer2 = new Observer("observer2");
        var observer3 = new Observer("observer3");

        var publish = new Publisher();
        publish.subscribe(observer1);
        publish.subscribe(observer2);
        publish.subscribe(observer3);

        // powiadamamy wszystkich obserwatorów
        publish.notify("wiadomość 1");

        publish.unSubscribe(observer3);

        // powiadamamy wszystkich obserwatorów
        publish.notify("wiadomość 2");
    }
}
