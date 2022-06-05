package com.company;

import com.company.model.CompanyBankAccount;

import java.math.BigDecimal;

public class Client {

    // private static BankAccount bankAccount;

    public static void main(String[] args) {

        /*
        Enkapsulacja, czyli heretyzacja to  ukrywanie wewnętrznej implementacji.
        Żaden zewnętrzny obiekt nie może zmienić stanu obiektów.
        Tylko prywatne metody wewnętrzne są uprawnione do zmiany tego stanu (np. set())
        */

        //BankAccount bankAccount = BankAccount.create(BigDecimal.valueOf(0));

        // PersonalBankAccount bankAccount = new PersonalBankAccount(BigDecimal.valueOf(1) /*, "llll"*/);
        // bankAccount.requestPersolanLoan();

        CompanyBankAccount bankAccount = new CompanyBankAccount(BigDecimal.valueOf(1999) /*, "llll"*/);
        bankAccount.takeLoan(BigDecimal.valueOf(300000));

        bankAccount.setBalance(BigDecimal.valueOf(1000));
        System.out.println(bankAccount.getBalance());

        System.out.println(bankAccount.makeDeposit(BigDecimal.valueOf(1)));
        System.out.println(bankAccount.makeWithdrawal(BigDecimal.valueOf(100)));
    }
}
