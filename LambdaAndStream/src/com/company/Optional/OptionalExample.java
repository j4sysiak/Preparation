package com.company.Optional;

import com.company.Optional.commons.EmailNotification;
import com.company.Optional.commons.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Setter
@Getter
@Builder
public class OptionalExample {

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testOptional3() {
        assertTrue(priceIsInRange1(Modem.create(BigDecimal.valueOf(12))));
        assertFalse(priceIsInRange1(Modem.create(BigDecimal.valueOf(9.9))));
        assertFalse(priceIsInRange1(null));

        assertTrue(priceIsInRange2(Modem2.create(12)));
        assertFalse(priceIsInRange2(Modem2.create(9.9)));
        assertFalse(priceIsInRange2(null));
    }

    public boolean priceIsInRange2(Modem2 modem) {
        return Optional.ofNullable(modem)
                .map(Modem2::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <= 15)
                .isPresent();
    }

    public boolean priceIsInRange1(Modem modem){
        boolean isInRange = false;
        if (modem != null && modem.getPrice() != null
                && (BigDecimal.valueOf(10).compareTo(modem.getPrice()) <= 0)
                && (BigDecimal.valueOf(15).compareTo(modem.getPrice()) >= 0)) {
            isInRange = true;
        }
        return isInRange;
    }

    @Test
    public void testOptional2() {
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
        System.out.println(is2016);
    }

    @Test
    public void testOptional() {
        String email = "test@wp.pl";
        String password = "test@wp.pl";
        User user = User.builder().name("Jacek KKj").email("test@wp.pl")
                .password("test@wp.pl").phoneNumber("123456").build();

        Optional<String> maybeString = Optional.ofNullable(User.create("test@wp.pl").getPassword());
        if (maybeString
                .map(pass -> getRunIfExist(pass, email, password))
                .orElseGet(() -> runIfEmpty())) {
            EmailNotification.builder().build().sendNotification(user);
        }

//        Optional<Boolean> maybeBoolean = Optional.ofNullable(maybeString
//                .map(pass -> getRunIfExist(pass, email, password))
//                .orElseGet(() -> runIfEmpty()));

        Boolean k1 = Optional.of(maybeString
                        .map(pass -> getRunIfExist(pass, email, password))
                        .orElseGet(this::runIfEmpty))
                .map(this::getRunIfExist2)
                .orElseGet(this::runIfEmpty);

        System.out.println("k1: " + k1);
    }

    private Boolean getRunIfExist2(Boolean aBoolean) {
        return aBoolean;
    }

    private Boolean getRunIfExist(String userPass, String email, String password) {
        return userPass.equals(email) && userPass.equals(password);
    }

    private Boolean runIfEmpty() {
        return false;
    }
}
