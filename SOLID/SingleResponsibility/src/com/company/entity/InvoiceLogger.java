package com.company.entity;

import com.company.entity.Invoice;
import com.company.model.LineItem;
import lombok.Builder;

import java.util.Collection;

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
