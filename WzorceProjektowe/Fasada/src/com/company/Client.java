package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {
/*
    Strukturalny Wzorzec Projektowy, którego celem jest stworzenie prostego interfejsu dla zestawu klas.
    Będziemy implementować jedną klasę, która jest powiązana z innymi klasami złożonego systemu.
    Zadaniem fasady jest wywołać metody powiązanych z nią klas.
    Fasada ułatwia wykonywanie złożonych funkcjonalności, korzystając z różnych obiektów i przy tym ukrywa szczegóły implementacji.

    Problem do rozwiązania:
    Skanujemy kod żródłowy pod względem quality, security i dependency i na koniec robimy raport.
    klient zarządza sam czterema obiektami.
    Wprowadzamy fasadę, która ukryje szczegóły implementacyjn eposzczególnych skanowań i generowania raportu.
    Fasada udostępni jedynie interface, przez który klient będzie mógł wykonywać różne zadania.
    Jeżeli zajdzie konieczność zmiana implementacji jakiegokolwiek typu skanowania, to korzystając z fasady
    nie będzie konieczności zmiany implementacji klienta (klasa Client)
*/
        var scanFasade = new ScanFasade();
        scanFasade.scan("http://jdhasdhaskh");  //publiczny interface fasady
    }
}
