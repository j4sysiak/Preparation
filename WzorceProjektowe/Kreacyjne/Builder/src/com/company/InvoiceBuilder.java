package com.company;


//import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class InvoiceBuilder {

    private Invoice invoice;

    InvoiceBuilder(){
        // najpierw tworzymy instancję klasy Invoice InvoiceBuilder - przez wstrzyknięcie w konstruktorze.
        this.invoice = new Invoice();
    }

    // najwazniejsza metoda:  która zwróci naszą fakturę
    public Invoice create() {
        return this.getInvoice();  // to jest getter na polu Invoice
    }

    public InvoiceBuilder setInvoiceNumber(String number) {
        this.invoice.number = number;
        return this;
    }

    public InvoiceBuilder setDate(LocalDateTime date) {
        this.invoice.date = date;
        return this;
    }

    public InvoiceBuilder setVendor(String vendor) {
        this.invoice.vendor = vendor;
        return this;
    }

    public InvoiceBuilder setVendee(String vendee) {
        this.invoice.vendee = vendee;
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


}
