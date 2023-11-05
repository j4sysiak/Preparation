package com.company;

import lombok.Getter;

@Getter
public class InvoiceBuilder {

    private Invoice invoice;

    InvoiceBuilder() {
        // najpierw tworzymy instancję klasy Invoice - przez wstrzyknięcie w konstruktorze.
        this.invoice = new Invoice();
    }

    public InvoiceBuilder setVendor(String vendor) {
        this.invoice.vendor = vendor;
        return this;
    }

    public InvoiceBuilder setNote(String note) {
        this.invoice.note = note;
        return this;
    }

    // to jest najwazniejsza metoda, która zwróci naszą fakturę
    public Invoice build() {
        return this.getInvoice();
    }
}
