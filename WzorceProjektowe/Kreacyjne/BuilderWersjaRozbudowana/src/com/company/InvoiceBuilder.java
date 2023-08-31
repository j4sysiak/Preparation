package com.company;

//import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@Builder
public class InvoiceBuilder   {

    private Invoice invoice;

    InvoiceBuilder() {
        // najpierw tworzymy instancję klasy Invoice - przez wstrzyknięcie w konstruktorze.
        this.invoice = new Invoice();
    }

    public InvoiceBuilder setVendor(String vendor) {
        invoice.vendor = vendor;
        return this;
    }

    public InvoiceBuilder setNote(String note) {
        invoice.note = note;
        return this;
    }

    // to jest metoda, która zwróci naszą fakturę
    public Invoice build() {
        return this.getInvoice();
    }
}
