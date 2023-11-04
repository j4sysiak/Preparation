package com.company;

import org.junit.jupiter.api.Test;

public class ClientForDirector {

//    Możemy też wyabstrachować interfejsy IInvoiceBuilderVAT, IInvoiceBuilderNoneVAT, które będą implementować nasz builder.
//    Interfejsy będą zawierały deklarację wszystkich metod set() + build() do implementaccji faktury danego typu.
//    Np. faktura VAT, None_VAT, etc.
//
//    Potem wprowadzamy koncept Dyrektora (klasa Director), który będzie zarządzał tworzeniem konkretnych faktur.
//    Zawierałby on metody np. createVATInvoice(), createMonthlyInvoice(), createBlankInvoice(), etc. Metody te zwracałyby obiekt Invoice.
//
//    Nasza klasa ClientTest może używać bezpośrednio klasy tworzącej fakturę InvoiceBuilder lub z klasy Director i posłużyć się
//    konkretną metodą do tworzenia konkretnego typu faktury.

    @Test
    public void test() {
        Director director = new Director();
        InvoiceBuilder invoiceBuilder = new InvoiceBuilder();

        // chcemy miec createVATInvoice
        director.createVATInvoice(invoiceBuilder);
        Invoice myVATInvoice = invoiceBuilder.getInvoice();

        // chcemy miec createMonthlyInvoice
        director.createMonthlyInvoice(invoiceBuilder);
        Invoice myMonthlyInvoice = invoiceBuilder.getInvoice();

        // chcemy miec createBlankInvoice
        director.createBlankInvoice(invoiceBuilder);
        Invoice myBlankInvoice = invoiceBuilder.getInvoice();
    }
}
