package com.company;

import java.math.BigDecimal;
import java.util.Optional;

public class BankAccount {

    private BigDecimal bankAccount;

    public BigDecimal getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigDecimal amount) {

        Boolean b = Optional.ofNullable(amount)
                .map(a -> runIfExists(a))
                .orElseGet(() -> runIfEmpty());

        System.out.println(b);
    }

    private Boolean runIfEmpty() {
        return false;
    }

    private Boolean runIfExists(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) >= 0) {
            this.bankAccount = amount;
        }
        return true;
    }
}
