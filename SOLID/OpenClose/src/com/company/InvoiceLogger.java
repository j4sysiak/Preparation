package com.company;

import com.company.entity.Invoice;
import lombok.Builder;

@Builder
public class InvoiceLogger {

    private Invoice invoice;

    public InvoiceLogger(Invoice invoice) {
        this.invoice = invoice;
    }

    public static InvoiceLogger create(Invoice invoice) {
        return InvoiceLogger.builder()
                .invoice(invoice)
                .build();
    }

    public void display() {
        System.out.println("Total: " + invoice.total);
    }
}
