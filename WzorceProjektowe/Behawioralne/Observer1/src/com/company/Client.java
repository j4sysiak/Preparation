package com.company;

import org.junit.Test;

public class Client {

    @Test
    public void test() {

        // wzorzec Obserwator używamy, jeżeli zmiany jednego obiektu mogą wymagać zmian w innych obiektach,
        // a konkretny zestaw obiektów nie jest nam znany na początku lub jego stan się zmienia

        ISubsciber iSubsciber1 = new Subsciber("Jacek Sysiak");
        ISubsciber iSubsciber2 = new Subsciber("Marek Kowalski");
        ISubsciber iSubsciber3 = new Subsciber("Jan Nowak");
        ISubsciber iSubsciberVip = new SubsciberVip("Król Maciuś");

        // ISubsciber x = new Subsciber("test");
        // x.subscibe("test");

        // publisher to taka maszynka do trzymania informacji o subskrybentach i wysyłania powiadomień do nich
        // Mając Subsciber'a tworzymy klasę Publishera notyfikacji.
        // Publisher będzię w sobie agregował subscibentów (wrzucał do kolekcji),
        // czyli posiada listę subscribentów i będzie tą listę modyfikował dodawał / usuwał z listy subscybentów do notyfikacji
        // oraz wysyłał powiadomienia
        Publisher publisherGazetaWyborcza = new Publisher();
        // dodajemy do listy
        publisherGazetaWyborcza.addUser(iSubsciber1);
        publisherGazetaWyborcza.addUser(iSubsciber2);
        publisherGazetaWyborcza.addUser(iSubsciber3);
        publisherGazetaWyborcza.addUser(iSubsciberVip);

        // powiadamamy wszystkich obserwatorów
        publisherGazetaWyborcza.notifyUser("message 1 dla naszych kochanych subskrybentów: zapłać miesięczy abonament");

        publisherGazetaWyborcza.removeUser(iSubsciber1);  // usuwam subskrybenta z listy subskrybentów (np. usuwam klienta z listy subskrybcji gazety)

        // powiadamamy wszystkich obserwatorów
        publisherGazetaWyborcza.notifyUser("message 2 dla naszych kochanych subskrybentów: nowa gazeta do już jest pobrania");
    }
}
