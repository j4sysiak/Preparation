package com.company;

import lombok.Getter;
import org.junit.Test;

@Setter
@Getter
public class ClientTest {

    @Test
    public void test() {
        var invoiceBuilder = new InvoiceBuilder();
        var director = new Director(invoiceBuilder);

        var vatInvoice = director.createVATInvoice();

        var monthlyInvoice = director.createMonthlyInvoice();

        var blankInvoice = director.createBlankInvoice();
    }
}
