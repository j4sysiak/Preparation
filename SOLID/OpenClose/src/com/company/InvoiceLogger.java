package com.company;

import com.company.entity.Invoice;
import lombok.Builder;

@Builder
public class InvoiceLogger {

    private Invoice invoice;
    private IInvoiceDisplayer iInvoiceDisplayer;

    public static InvoiceLogger create(Invoice invoice, IInvoiceDisplayer iInvoiceDisplayer) {
        return InvoiceLogger.builder()
                .invoice(invoice)
                .iInvoiceDisplayer(iInvoiceDisplayer)
                .build();
    }

    public void display() {
        iInvoiceDisplayer.display(invoice);
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
