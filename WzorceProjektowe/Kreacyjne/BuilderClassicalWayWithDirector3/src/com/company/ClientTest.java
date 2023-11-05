package com.company;

import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

@Setter
@Getter
public class ClientTest {

    @Test
    public void test1() {
        // bedziemy tworzy MonthlyInvoiceBuilder
        Director im = Director.builder()
                .iInvoiceBuilder(new MonthlyInvoiceBuilder())
                .build();

        // budowniczy
        im.getIInvoiceBuilder().setVendor("Sanex");
        im.getIInvoiceBuilder().setNote("dupa-dupa-dupa");
        var invoice = im.getIInvoiceBuilder().build();  // zwraca obiekt w ostatnim kroku
        System.out.println(invoice);
    }

    @Test
    public void test2() {
        // EmptyInvoiceBuilder
        var iem = Director.builder()
                .iInvoiceBuilder(new EmptyInvoiceBuilder())
                .build();

        // budowniczy
        iem.getIInvoiceBuilder().setVendor("Sanex");
        iem.getIInvoiceBuilder().setNote("dupa-dupa-dupa");
        var em_invoice = iem.getIInvoiceBuilder().build();  // zwraca obiekt w ostatnim kroku
        System.out.println(em_invoice);
    }


    @Test
    public void test3() {
        // WithOutVATInvoiceBuilder
        var im = Director.builder()
                .iInvoiceBuilder(new WithOutVATInvoiceBuilder())
                .build();

        // budowniczy
        im.getIInvoiceBuilder().setVendor("Sanex");
        im.getIInvoiceBuilder().setNote("dupa-dupa-dupa");
        var invoice = im.getIInvoiceBuilder().build();  // zwraca obiekt w ostatnim kroku
        System.out.println(invoice);
    }



    @Test
    public void test4() {
        // MonthlyInvoiceBuilder
        var im = Director.builder()
                .iInvoiceBuilder(new MonthlyInvoiceBuilder())
                .build();

        // budowniczy
        im.getIInvoiceBuilder().setVendor("Sanex");
        im.getIInvoiceBuilder().setNote("dupa-dupa-dupa");
        var invoice = im.getIInvoiceBuilder().build();  // zwraca obiekt w ostatnim kroku
        System.out.println(invoice);
    }
}
