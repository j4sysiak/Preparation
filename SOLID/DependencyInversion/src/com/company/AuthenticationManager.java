package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AuthenticationManager {

    public void authenticate(User user, String email, String password) {
        if (user.password == email && user.password == password) {
            EmailNotification.builder().build().sendNotification(user);
        }
    }
}
