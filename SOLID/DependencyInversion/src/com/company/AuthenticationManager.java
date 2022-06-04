package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Setter
@Getter
@Builder
/*Moduł wysokopoziomowy*/
public class AuthenticationManager {

    public void authenticate(User user, String email, String password) {
        Optional<String> maybeString = Optional.ofNullable(User.create("test@wp.pl").getPassword());
        if (maybeString
                .map(pass -> getRunIfExist(pass, email, password))
                .orElseGet(() -> runIfEmpty())) {
            EmailNotification.builder().build().sendNotification(user);
        }

    }

    private Boolean getRunIfExist(String userPass, String email, String password) {
        return userPass.equals(email) && userPass.equals(password);
    }

    private Boolean runIfEmpty() {
        return false; //"empty";
    }
}
