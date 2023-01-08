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
        Director director = new Director(builder);

        Invoice monthlyInvoice = director.createMonthlyInvoice();
        Invoice blankInvoice = director.createBlankInvoice();
    }
}
