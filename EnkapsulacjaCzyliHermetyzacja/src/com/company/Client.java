package com.company;

import java.math.BigDecimal;
import java.util.Optional;

public class Client {

    public static void main(String[] args) {

        /*
        Enkapsulacja, czyli heretyzacja to  ukrywanie wewnętrznej implementacji.
        Żaden zewnętrzny obiekt nie może zmienić stanu obiektów.
        Tylko prywatne metody wewnętrzne są uprawnione do zmiany tego stanu (np. set())
        */

        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 = yearOptional.filter(y -> y == 2017).isPresent();

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankAccount(BigDecimal.valueOf(-1000));
        System.out.println(bankAccount.getBankAccount());
    }
}
