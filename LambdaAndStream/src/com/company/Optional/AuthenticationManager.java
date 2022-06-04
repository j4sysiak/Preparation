package com.company.Optional;

import com.company.EmailNotification;
import com.company.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Setter
@Getter
@Builder
public class AuthenticationManager {

    public void authenticate(User user, String email, String password) {
        Optional<String> maybeString = Optional.ofNullable(User.create("test@wp.pl").getPassword());
        if(maybeString
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

    }

    private Boolean getRunIfExist2(Boolean aBoolean) {
        return aBoolean;
    }

    private Boolean getRunIfExist(String userPass, String email, String password) {
        return  userPass.equals(email) && userPass.equals(password);
    }

    private Boolean runIfEmpty() {
        return false; //"empty";
    }
}
