package com.company;

import com.company.entity.Invoice;
import lombok.Builder;

@Builder
public class InvoiceLogger {

    private Invoice invoice;
    private IInvoiceDisplayer invoiceDisplayer;

    // clue OpenClose
    // kalsa InvoiceLogger jest otwarta na rozszerzenie, ponieważ wystarczy, że dostarczymy jej
    // inną implementację invoiceDisplayer
    // jednocześnie jest zamknięta na modyfikację, ponieważ z perspektywy tej klasy
    // nie jest wymagane, aby zmieniła ona swoją implementację
    // po to, żeby obsłużyć jakiś inny typ wyświetlania kwoty na fakturze

    public static InvoiceLogger create(Invoice invoice, IInvoiceDisplayer iInvoiceDisplayer) {
        return InvoiceLogger.builder()
                .invoice(invoice)
                .invoiceDisplayer(iInvoiceDisplayer)
                .build();
    }

    // clue OpenClose
    //Metoda display ma ten sam kod niezależnie od tego jaki total chcemy wyświetlić (brutto czy netto)
    public void display() {
        invoiceDisplayer.display(invoice);
    }

//    public void displayTotal() {
//        System.out.println("Total: " + invoice.total);
//    }
//
//    public void displayTotalNetto() {
//        System.out.println("Total: " + invoice.total);
//    }
//
//    public void displayTotalBrutto() {
//        System.out.println("Total: " + invoice.total);
//    }
}
