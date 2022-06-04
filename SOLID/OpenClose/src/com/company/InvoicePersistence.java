package com.company;

import com.company.entity.Invoice;
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

    // clue OpenClose
    //Metoda save ma ten sam kod niezależnie od tego w jakim formacie chcemy wydrukować fakturę (pdf, word)
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
