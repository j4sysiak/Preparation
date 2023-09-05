package com.company;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;


@Setter
@Getter
public class Client {

    @Test
    public void test() {
        // MonthlyInvoiceBuilder
        var im = InvoiceManager.builder()
                .iInvoiceBuilder(new MonthlyInvoiceBuilder())
                .build();

        // budowniczy
        im.getIInvoiceBuilder().setVendor("Sanex");
        im.getIInvoiceBuilder().setNote("dupa-dupa-dupa");
        var invoice = im.getIInvoiceBuilder().build();  // zwraca obiekt w ostatnim kroku
        System.out.println(invoice);





        // EmptyInvoiceBuilder
        var iem = InvoiceManager.builder()
                .iInvoiceBuilder(new EmptyInvoiceBuilder())
                .build();

        // budowniczy
        iem.getIInvoiceBuilder().setVendor("Sanex");
        iem.getIInvoiceBuilder().setNote("dupa-dupa-dupa");
        var em_invoice = iem.getIInvoiceBuilder().build();  // zwraca obiekt w ostatnim kroku
        System.out.println(em_invoice);
    }
}
