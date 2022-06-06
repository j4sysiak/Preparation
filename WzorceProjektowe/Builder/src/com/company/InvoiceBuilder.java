package com.company;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

@Setter
@Getter
public class InvoiceBuilder {
    private Invoice invoice = new Invoice();

    public void setInvoiceNumber(String number) {
        invoice.number = number;
    }

    public void setDate(LocalDateTime date) {
        invoice.date = date;
    }

    public void setVendor(String vendor) {
        invoice.vendor = vendor;
    }

    public void setVendee(String vendee) {
        invoice.vendee = vendee;
    }

    public void setNote(String note) {
        invoice.note = note;
    }

    public void setLineItems(Collection<String> lineItems) {
        invoice.lineItems = lineItems;
    }


}
