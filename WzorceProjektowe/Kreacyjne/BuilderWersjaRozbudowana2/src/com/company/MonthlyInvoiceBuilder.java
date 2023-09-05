package com.company;

//import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MonthlyInvoiceBuilder implements IInvoiceBuilder   {

    private Invoice invoice;

    MonthlyInvoiceBuilder() {
        // najpierw tworzymy instancję klasy Invoice - przez wstrzyknięcie w konstruktorze.
        this.invoice = new Invoice();
    }

    public void setVendor(String vendor) {
        invoice.vendor = vendor;

        // Invoice inv = Invoice.builder().vendor("ss").note("ss").build();
    }

    public void setNote(String note) {
        invoice.note = note;
    }

    // to jest metoda, która zwróci naszą fakturę
    public Invoice build() {
        return this.getInvoice();
    }
}
