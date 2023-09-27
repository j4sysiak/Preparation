package com.company;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class InvoiceManager {

    private IInvoiceBuilder iInvoiceBuilder;

    InvoiceManager(IInvoiceBuilder iInvoiceBuilder) {
        this.iInvoiceBuilder = iInvoiceBuilder;
    }

    public Invoice showInvoice() {
        return this.iInvoiceBuilder.build();
    }
}
