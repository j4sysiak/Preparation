package com.company;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {

        /*
        Enkapsulacja, czyli heretyzacja to  ukrywanie wewnętrznej implementacji.
        Żaden zewnętrzny obiekt nie może zmienić stanu obiektów.
        Tylko prywatne metody wewnętrzne są uprawnione do zmiany tego stanu (np. set())
        */

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankAccount(BigDecimal.valueOf(1000));
        System.out.println(bankAccount.getBankAccount());
    }
}
