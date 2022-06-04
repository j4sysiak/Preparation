package com.company.entity;

import lombok.Builder;

@Builder
public class InvoicePersistence {

    private Invoice invoice;

    public static InvoicePersistence create(Invoice invoice) {
        return InvoicePersistence.builder()
                .invoice(invoice)
                .build();
    }

    public void saveToPdf() {
        System.out.println("saveToPdf ... ");
    }
}
