package com.company;

public class Client {

    public static void main(String[] args) {

        // wzorzec Obserwator używamy, jeżeli zmiany jednego obiektu mogą wymmagać zmian w innych obiektach
        // a konkretny zestaw obiektów nie jest nam znany na początku lub jego stan się zmienia

        var subscriber1 = new Subscriber("subscriber1");
        var subscriber2 = new Subscriber("subscriber2");
        var subscriber3 = new Subscriber("subscriber3");

        var publish = new Publisher();
        publish.subscribe(subscriber1);
        publish.subscribe(subscriber2);
        publish.subscribe(subscriber3);

        publish.notify("wiadomość 1");

        publish.unSubscribe(subscriber3);

        publish.notify("wiadomość 2");
    }
}
