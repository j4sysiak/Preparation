package com.company;

import java.util.List;
import static java.time.LocalDateTime.now;

public class Director {

    public void createMonthlyInvoice(InvoiceBuilder monthlyInvoice) {
        monthlyInvoice.setDate(now())
                .setInvoiceNumber("A13132-2022")
                .setVendor("Ford Motors Company Co. Limited")
                .setVendee("Jacek")
                .setNote("flsjdfjlsjdlfjlsjdfjsdjfsdlflsj")
                .setLineItems(List.of("Line item1", "Line item2"));
    }

    public void createBlankInvoice(InvoiceBuilder blankInvoice) {
        blankInvoice.setDate(now())
                .setInvoiceNumber("000000-0000A")
                .setVendor("B L A N K")
                .setVendee("blank Blank")
                .setNote("BLANK")
                .setLineItems(List.of("BLANK"));
    }
}
