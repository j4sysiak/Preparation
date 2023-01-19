package com.company;

import org.testng.annotations.Test;

public class Client {

    @Test
    public void main() {

        // wzorzec Obserwator używamy, jeżeli zmiany jednego obiektu mogą wymagać zmian w innych obiektach,
        // a konkretny zestaw obiektów nie jest nam znany na początku lub jego stan się zmienia

        IObserver iObserver1 = new Observer("observer1");
        var iObserver2 = new Observer("observer2");
        var iObserver3 = new Observer("observer3");

        IObserver x = new Observer("test");
        x.update("test");

        var publish = new Publisher();
        publish.subscribe(iObserver1);
        publish.subscribe(iObserver2);
        publish.subscribe(iObserver3);

        // powiadamamy wszystkich obserwatorów
        publish.notify("wiadomość 1");

        publish.unSubscribe(iObserver3);

        // powiadamamy wszystkich obserwatorów
        publish.notify("wiadomość 2");
    }
}
