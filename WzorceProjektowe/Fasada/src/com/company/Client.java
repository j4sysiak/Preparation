package com.company;

public class Client {

    public static void main(String[] args) {
        /*
        Fasada - strukturalny wzorzec projektowy służący do stworzenia prostego interfejsu dla zestawu klas.
        Będziemy implementować jedną klasę, która jest powiązana z innymi klasami złożonego systemu.
        Zadaniem fasady jest wywołać metody powiązanych z nią klas.
        Czyli, fasada ułatwia wykonywanie złożonych funkcjonalności, korzystając z różnych obiektów  i w tym ukrywa szczegóły implementacji.

        W naszym przypadku fasada ukryje szczegóły implementacji skanowania i generowania raportu
        Fasada udostępni interfejs, przez który klient będzie mógł skanować i wykonywać raporty
        Jeżeli będziemy chcieli coś zmienić w skanowaniu, to przy pomocy fasady nie bedziemy ingerować w kliencie
        */

        var scanFasade = new ScanFasade();
        scanFasade.scan("http://jdhasdhaskh");  //publiczny interface fasady

    }
}
