package com.company;

public class InvoiceManager {

    private InvoiceBuilder invoiceBuilder;

    public InvoiceManager(InvoiceBuilder invoiceBuilder) {
        this.invoiceBuilder = invoiceBuilder;
    }

    public Invoice createMonthlyInvoice() {
        invoiceBuilder.setVendor("Brukbet");
        invoiceBuilder.setNote("dupa");
        var invoice = invoiceBuilder.build();
        return invoice;
    }

    public Invoice createBlankInvoice() {
        return new Invoice();
    }
}
