package com.company.entity;

import com.company.IInvoiceSaver;
import lombok.Builder;

@Builder
public class InvoicePersistence {

    private Invoice invoice;
    private IInvoiceSaver invoiceSaver;

    public static InvoicePersistence create(Invoice invoice, IInvoiceSaver invoiceSaver) {
        return InvoicePersistence.builder()
                .invoice(invoice)
                .invoiceSaver(invoiceSaver)
                .build();
    }

    public void save() {
        invoiceSaver.save(invoice);
    }

//    public void saveToPdf() {
//        System.out.println("saveToPdf ... ");
//    }
//
//    public void saveToWord() {
//        System.out.println("saveToWord ... ");
//    }
}
