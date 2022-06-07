package com.company;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Address {

    private String street;
    private String city;
    private String country;

    public Address(Address address) {
        this(address.getStreet(), address.getCity(), address.getCountry());
    }


}
