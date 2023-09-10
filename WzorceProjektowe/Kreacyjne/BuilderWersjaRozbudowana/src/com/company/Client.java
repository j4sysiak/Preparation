package com.company;

import lombok.Getter;
import org.junit.Test;

@Setter
@Getter
public class Client {

    @Test
    public void test() {
        var invoiceBuilder = new InvoiceBuilder();
        var invoiceManager = new InvoiceManager(invoiceBuilder);

        var monthlyInvoice = invoiceManager.createMonthlyInvoice();
        System.out.println(monthlyInvoice);

        var blankInvoice = invoiceManager.createBlankInvoice();
        System.out.println(blankInvoice);
    }
}
