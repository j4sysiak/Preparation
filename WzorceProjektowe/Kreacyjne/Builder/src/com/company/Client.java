package com.company;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.time.LocalDateTime.now;

public class Client {

    @Test
    public void test() {
        /*
        Można tworzyć etapami złożone obiekty.
        Rozdziela sposób tworzenia obiektów od ich reprezentacji.
        Przykład z budowaniem złożonego obiektu "faktura" (klasa Invoice).
        Nie tworzymy takiego obiektu jednym konstruktorem, tylko budujemy poszczególne elementy i dokładamy do
        obiektu "faktura" (klasa Invoice).
        Do obiektu (klasy Invoice) "faktura" wprowadzamy klasę InvoiceBuilder, której celem będzie utworzenie konkretnej faktury
        poprzez udostępnienie takich metod jak:
        - setVendor()
        - setVendee()
        - setNotes()
        - setLineItems()
        Każda z tych metod, przyjmuje konkretne elementy (obiekty), które ustawiają te parametry na fakturze.
        Wszystkie metody set, w pewien sposób modyfikują fakturę, którą chcemy otrzymać.
        Końcowym momentem do wygenerowania tej faktury jest metoda build(), zwróci konkretną fakturę, którą klient chce uzyskać.
        */

        // pierwszy sposób - mega prymitywny
        /*InvoiceBuilder ale lepiej var*/ var invoiceBuilder = new InvoiceBuilder(); // tworzymy tutaj na początku pusty obiekt faktury: invoice w konstruktorze InvoiceBuilder()
        // dokładamy poszczególne elementy do faktury:
        invoiceBuilder.setDate(now());
        invoiceBuilder.setInvoiceNumber("A13132-2022");
        invoiceBuilder.setVendor("Ford Motors Company Co. Limited");
        invoiceBuilder.setVendee("Jacek");
        invoiceBuilder.setNote("flsjdfjlsjdlfjlsjdfjsdjfsdlflsj");
        invoiceBuilder.setLineItems(List.of("Line item1", "Line item2"));

        // i mamy naszą piękną fakturę
        Invoice invoice1 = invoiceBuilder.build();  // i odbieramy naszą fakturę
        System.out.println(invoice1);


        // tak zwane płynne wywołanie (łańcuchowe)
        // drugi sposób - to w sumie to samo co powyżej ale szybciej i ładniej
        Invoice invoice2 = invoiceBuilder
                .setDate(now())
                .setInvoiceNumber("A13132-2022")
                .setVendor("Ford Motors Company Co. Limited")
                .setVendee("Jacek")
                .setNote("flsjdfjlsjdlfjlsjdfjsdjfsdlflsj")
                .setLineItems(List.of("Line item1", "Line item2"))
                .build();  // i odbieramy naszą fakturę
        System.out.println(invoice2);

        // UWAGA - nie uzywamy tutaj invoiceBuildera - to tylko bezposrednie tworzenie klasy Invoice (taki przyklad tylko)
        // trzeci sposób - używa anotacji @Builder Lomboka w bezpośrednio klasie Invoice
//        Invoice invoice3 = Invoice.builder()
//                        .date(now())
//                        .number("A13132-2022")
//                        .vendor("Ford Motors Company Co. Limited")
//                        .vendee("Jacek")
//                        .note("flsjdfjlsjdlfjlsjdfjsdjfsdlflsj")
//                        .lineItems(List.of("Line item1", "Line item2"))
//                        .build();
//         System.out.println(invoice3);
    }
}
