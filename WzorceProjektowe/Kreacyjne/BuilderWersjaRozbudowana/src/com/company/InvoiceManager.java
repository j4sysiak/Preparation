package com.company;

public class InvoiceManager {

    private InvoiceBuilder invoiceBuilder;

    public InvoiceManager(InvoiceBuilder invoiceBuilder) {
        this.invoiceBuilder = invoiceBuilder;
    }

    public Invoice createVATInvoice() {
        this.invoiceBuilder.setVendor("Prefabet");
        this.invoiceBuilder.setNote("dupadupadupadupa");
        var invoice = this.invoiceBuilder.build();
        return invoice;
    }

    public Invoice createMonthlyInvoice() {
        this.invoiceBuilder.setVendor("Brukbet");
        this.invoiceBuilder.setNote("dupa");
        var invoice = this.invoiceBuilder.build();
        return invoice;
    }

    public Invoice createBlankInvoice() {
        return new Invoice();
    }
}
