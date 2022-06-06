package com.company;

public class Client {

    public static void main(String[] args) {

        /*
        Można tworzyć etapami złożone obiekty.
        Rozdziela sposób tworzenia obiektów od ich reprezentacji.
        Przykła z budowaniem złożonego obiektu "faktura" (klasa Invoice).
        Nie tworzymy takiego obiektu jednym konstruktorem, tylko budujemy poszczególne elementy i dokładamy do
        obiektu "faktura" (klasa Invoice).
        Do obiektu (klasy Invoice) "faktura" wprowadzamy klasę InvoiceBuilder, której celem będzie utworzenie konkretnej faktury
        poprzez udostępnienie takich metod jak:
        - setVendor()
        - setVendee()
        - setNotes()
        - setLineItems()
        - setPaymentTepe()
        - build()
        Każda z tych metod, przyjmuje konkretne elementy (obiekty), które ustawią te parametry na fakturze.
        Wszystkie metody set, w pewien sposób modyfikują fakturę, którą chcemy otrzymać.
        Końcowym momentem do wygenerowania tej faktury jest metoda build().
        Build() zwróci konkretną fakturę, którą klient chce uzyskać.
        */
    }
}
