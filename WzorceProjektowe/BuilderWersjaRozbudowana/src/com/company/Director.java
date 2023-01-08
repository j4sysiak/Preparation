package com.company;

public class Director {

    private InvoiceBuilder invoiceBuilder;

    public Director(InvoiceBuilder invoiceBuilder) {
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
