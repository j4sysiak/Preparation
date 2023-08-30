package com.company;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;


@Setter
@Getter
public class Client {

    @Test
    public void test() {
        InvoiceManager im = InvoiceManager.builder()
                .iInvoiceBuilder(new MonthlyInvoiceBuilder())
                .build();

        // budowniczy
        im.getIInvoiceBuilder().setVendor("ss");
        im.getIInvoiceBuilder().setNote("ss");
        Invoice invoice = im.getIInvoiceBuilder().build();  // zwraca obiekt w ostatnim kroku
        System.out.println(invoice);
    }
}