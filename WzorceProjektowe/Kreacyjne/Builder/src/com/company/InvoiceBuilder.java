package com.company;


//import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

@Setter
@Getter
//@Builder
public class InvoiceBuilder {

    private Invoice invoice;

    InvoiceBuilder(){
        // najpierw tworzymy instancję klasy Invoice InvoiceBuilder - przez wstrzyknięcie w konstruktorze.
        this.invoice = new Invoice();
    }

    public InvoiceBuilder setInvoiceNumber(String number) {
        invoice.number = number;
        return this;
    }

    public InvoiceBuilder setDate(LocalDateTime date) {
        invoice.date = date;
        return this;
    }

    public InvoiceBuilder setVendor(String vendor) {
        invoice.vendor = vendor;
        return this;
    }

    public InvoiceBuilder setVendee(String vendee) {
        invoice.vendee = vendee;
        return this;
    }

    public InvoiceBuilder setNote(String note) {
        invoice.note = note;
        return this;
    }

    public InvoiceBuilder setLineItems(Collection<String> lineItems) {
        invoice.lineItems = lineItems;
        return this;
    }

    // to jest metoda, która zwróci naszą fakturę
    public Invoice build() {
        return this.getInvoice();
    }
}