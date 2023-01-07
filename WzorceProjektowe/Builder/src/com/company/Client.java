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
        Każda z tych metod, przyjmuje konkretne elementy (obiekty), które ustawiają te parametry na fakturze.
        Wszystkie metody set, w pewien sposób modyfikują fakturę, którą chcemy otrzymać.
        Końcowym momentem do wygenerowania tej faktury jest metoda build().
        Build() zwróci konkretną fakturę, którą klient chce uzyskać.

        Możemy też wyabstrachować interfejsy IInvoiceBuilderVAT, IInvoiceBuilderNoneVAT, które będą implementować nasz builder.
        Interfejsy będą zawierały deklarację wszystkich metod set() + build() do implementaccji faktury danego typu.
        Np. faktura VAT, None_VAT, etc.

        Potem wprowadzamy koncept Dyrektora (klasa Director), który będzie zarządzał tworzeniem konkretnych faktur.
        Zawierałby on metody np. createMonthlyInvoice(), createBlankInvoice(), etc. Metody te zwracałyby obiekt Invoice.

        Nasza klasa Client może używać bezpośrednio klasy tworzącej fakturę InvoiceBuilder lub z klasy Director i posłużyć się
        konkretną metodą do tworzenia konkretnego typu faktury.
        */

        // pierwszy sposób - mega prymitywny
        /*InvoiceBuilder ale lepiej var*/ var invoiceBuilder = new InvoiceBuilder();
        invoiceBuilder.setDate(now());
        invoiceBuilder.setInvoiceNumber("A13132-2022");
        invoiceBuilder.setVendor("Ford Motors Company Co. Limited");
        invoiceBuilder.setVendee("Jacek");
        invoiceBuilder.setNote("flsjdfjlsjdlfjlsjdfjsdjfsdlflsj");
        invoiceBuilder.setLineItems(List.of("Line item1", "Line item2"));
        Invoice invoice1 = invoiceBuilder.myCustomBuild();
        System.out.println(invoice1);

        // drugi sposób
        Invoice invoice2 = invoiceBuilder
                .setDate(now())
                .setInvoiceNumber("A13132-2022")
                .setVendor("Ford Motors Company Co. Limited")
                .setVendee("Jacek")
                .setNote("flsjdfjlsjdlfjlsjdfjsdjfsdlflsj")
                .setLineItems(List.of("Line item1", "Line item2"))
                .create();
        System.out.println(invoice2);

        // UWAGA - nie uzywmy tutaj invoiceBuilder - to tylko bezposrednie tworzenie klasy Invoice (taki rzyklad tylko)
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
