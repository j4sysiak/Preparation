package com.company;

import java.math.BigDecimal;
import java.util.Optional;

public class BankAccount {

    private BigDecimal bankAccount;

    public BigDecimal getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigDecimal amount) {

        BigDecimal c =  Optional.ofNullable(amount)
                .map(a -> runIfExists(a))
                .orElseGet(() -> runIfEmpty());

        System.out.println(c);
    }

    private BigDecimal runIfEmpty() {
        return BigDecimal.ZERO;
    }

    private BigDecimal runIfExists(BigDecimal amount) {
        return Optional.of(amount.compareTo(BigDecimal.ZERO) >= 0)
                .map(s -> ifTrue(amount))
                .orElseGet(() -> ifNotTrue());

    }

    private BigDecimal ifNotTrue() {
        return BigDecimal.ZERO;
    }

    private BigDecimal ifTrue(BigDecimal amount) {
        return amount;
    }
}
