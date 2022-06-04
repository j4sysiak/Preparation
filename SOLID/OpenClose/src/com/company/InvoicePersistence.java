package com.company;

import com.company.entity.Invoice;
import lombok.Builder;

@Builder
public class InvoicePersistence {

    private Invoice invoice;
    private IInvoiceSaver invoiceSaver;

    // clue OpenClose
    // kalsa InvoicePersistence jest otwarta na rozszerzenie, ponieważ wystarczy, że dostarczymy jej
    // inną implementację invoiceSaver
    // jednocześnie jest zamknięta na modyfikację, ponieważ z perspektywy tej klasy
    // nie jest wymagane, aby zmieniła ona swoją implementację
    // po to, żeby obsłużyć jakiś inny typ wydruku faktur

    public static InvoicePersistence create(Invoice invoice, IInvoiceSaver invoiceSaver) {
        return InvoicePersistence.builder()
                .invoice(invoice)
                .invoiceSaver(invoiceSaver)
                .build();
    }

    // clue OpenClose
    //Metoda save ma ten sam kod niezależnie od tego w jakim formacie chcemy wydrukować fakturę (pdf, word)
    public void save() {
        invoiceSaver.save(invoice);
    }

//    public void saveToPdf() {
//        System.out.println("saveToPdf ... ");
//    }
//
//    public void saveToWord() {
//        System.out.println("saveToWord ... ");
//    }
}
