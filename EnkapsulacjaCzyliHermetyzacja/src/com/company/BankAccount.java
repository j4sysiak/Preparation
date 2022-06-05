package com.company;

import java.math.BigDecimal;
import java.util.Optional;

public class BankAccount {

    private BigDecimal bankAccount;

    public BigDecimal getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigDecimal amount) {
        BigDecimal c =  Optional.ofNullable(amount)  // 1. sprawdzam, czy null
                .map(a -> runIfAmountNotNull(a))            //2. jeżeli nie null
                .orElseGet(() -> runIfEmpty());      //3. jeżeli null

        System.out.println(c);
    }

    private BigDecimal runIfEmpty() {
        return BigDecimal.ZERO;
    }

    private BigDecimal runIfAmountNotNull(BigDecimal amount) {
        return Optional.of(amount.compareTo(BigDecimal.ZERO) >= 0)// 4. sprawdzam, czy true
                .filter(Boolean::booleanValue)  // 4. będę sprawdzał Booleana
                .map(bool -> ifTrue(amount))  // 5. Jeżeli true
                .orElseGet(() -> ifNotTrue());   // 6. jeżeli false
    }

    private BigDecimal ifNotTrue() {
        return BigDecimal.ZERO;
    }

    private BigDecimal ifTrue(BigDecimal amount) {
        return amount;
    }
}
