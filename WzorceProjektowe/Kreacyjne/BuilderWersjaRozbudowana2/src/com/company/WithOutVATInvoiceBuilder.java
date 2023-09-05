package com.company;

//import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@Builder
public class WithOutVATInvoiceBuilder implements IInvoiceBuilder   {

    private Invoice invoice;

    WithOutVATInvoiceBuilder() {
        // najpierw tworzymy instancję klasy Invoice - przez wstrzyknięcie w konstruktorze.
        this.invoice = new Invoice();
    }

    public void setVendor(String vendor) {
        invoice.vendor = vendor;
    }

    public void setNote(String note) {
        invoice.note = note;
    }

    // to jest metoda, która zwróci naszą fakturę
    public Invoice build() {
        return this.getInvoice();
    }
}
