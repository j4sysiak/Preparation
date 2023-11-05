package com.company;

import lombok.Getter;
import org.junit.Test;

@Setter
@Getter
public class ClientTest {

    @Test
    public void test() {
        var invoiceBuilder = new InvoiceBuilder();
        var invoiceManager = new InvoiceManager(invoiceBuilder);

        var vatInvoice = invoiceManager.createVATInvoice();

        var monthlyInvoice = invoiceManager.createMonthlyInvoice();

        var blankInvoice = invoiceManager.createBlankInvoice();
    }
}
