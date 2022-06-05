package com.company;

import com.company.model.BankAccount;
import com.company.model.CompanyBankAccount;
import com.company.model.PersonalBankAccount;

import java.math.BigDecimal;

public class Client {

    // private static BankAccount bankAccount;

    public static void main(String[] args) {

        /*
        Polimorfizm - podczas działania programu przy wywołaniu np. metody makeWithdrawal z klasy bazowej BankAccount
        to w zależności od typu, czy wywołamy metodę z CompanyBankAccount, czy z PersonalBankAccount
        to konkretna implementacja zostanie wywołana (nadpisujemy metodę w klasach niższych @Override)

        np. dla wywołania metody makeWithdrawal z typu PersonalBankAccount będzie się inaczej zachowywała, niż dla wywołania z CompanyBankAccount
        */

//        var bankAccount = BankAccount.create(BigDecimal.valueOf(0));

        var bankAccount = new PersonalBankAccount(BigDecimal.valueOf(1) /*, "llll"*/);
        bankAccount.requestPersolanLoan();

//        var bankAccount = new CompanyBankAccount(BigDecimal.valueOf(1999) /*, "llll"*/);
//        bankAccount.takeLoan(BigDecimal.valueOf(300000));

        bankAccount.setBalance(BigDecimal.valueOf(1000));
        System.out.println(bankAccount.getBalance());

        System.out.println(bankAccount.makeDeposit(BigDecimal.valueOf(1)));
        System.out.println(bankAccount.makeWithdrawal(BigDecimal.valueOf(100000)));
    }
}
