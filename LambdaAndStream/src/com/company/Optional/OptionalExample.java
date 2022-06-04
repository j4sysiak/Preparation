package com.company.Optional;

import com.company.Optional.commons.EmailNotification;
import com.company.Optional.commons.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Setter
@Getter
@Builder
public class OptionalExample {

    @BeforeEach
    public void setUp() {
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
