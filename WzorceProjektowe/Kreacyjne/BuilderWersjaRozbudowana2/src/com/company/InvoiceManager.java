package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class InvoiceManager {

    private IInvoiceBuilder iInvoiceBuilder;

    InvoiceManager(IInvoiceBuilder iInvoiceBuilder) {
        this.iInvoiceBuilder = iInvoiceBuilder;
    }

    public Invoice showInvoice() {
        return iInvoiceBuilder
                .build();
    }
}
