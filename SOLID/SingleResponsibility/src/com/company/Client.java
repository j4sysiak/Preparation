package com.company;

import com.company.entity.Invoice;
import com.company.entity.InvoiceLogger;
import com.company.entity.InvoicePersistence;
import com.company.model.LineItem;

import java.util.Arrays;
import java.util.Collection;

public class Client {

    public static void main(String[] args) {
        LineItem lineItem1 = LineItem.builder().name("aaa").price(11.99f).count(1f).taxRate(22).build();
        LineItem lineItem2 = LineItem.builder().name("aaa").price(11.99f).count(1f).taxRate(22).build();
        LineItem lineItem3 = LineItem.builder().name("aaa").price(11.99f).count(1f).taxRate(22).build();
        Collection<LineItem> lineItems = Arrays.asList(lineItem1, lineItem2, lineItem3);

        Invoice invoice = Invoice.create(lineItems, "www", "sss");

        InvoiceLogger.create(invoice).display();
        InvoicePersistence.create(invoice).saveToPdf();
    }
}