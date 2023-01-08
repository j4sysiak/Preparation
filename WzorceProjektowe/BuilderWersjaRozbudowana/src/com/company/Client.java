package com.company;


import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;


@Setter
@Getter
public class Client {

    @Test
    public void test() {
        InvoiceBuilder builder = new InvoiceBuilder();
        InvoiceManager invoiceManager = new InvoiceManager(builder);

        Invoice monthlyInvoice = invoiceManager.createMonthlyInvoice();
        Invoice blankInvoice = invoiceManager.createBlankInvoice();
    }
}
