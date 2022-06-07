package com.company;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class User {

    private String firstName;
    private String lastName;
    private Address address;

    public User(User user) {
        this(user.getFirstName(), user.getLastName(), new Address(user.getAddress()));
    }
}
