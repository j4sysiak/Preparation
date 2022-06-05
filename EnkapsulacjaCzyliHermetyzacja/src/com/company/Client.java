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
        BankAccount bankAccount = BankAccount.create(BigDecimal.valueOf(0));
        bankAccount.setBalance(BigDecimal.valueOf(1000));
        System.out.println(bankAccount.getBalance());

        BigDecimal deposit = bankAccount.makeDeposit(BigDecimal.valueOf(1));
        BigDecimal withdrawal = bankAccount.makeWithdrawal(BigDecimal.valueOf(100));
    }
}
