package com.company;

import com.company.IInvoiceSaver;
import com.company.entity.Invoice;

public class PdfInvoiceSaver implements IInvoiceSaver {
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saveing invoice as PDF ...");
    }
}
