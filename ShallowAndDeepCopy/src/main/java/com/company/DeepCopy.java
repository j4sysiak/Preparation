package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DeepCopy {

    @Test
    public void whenModifyingOriginalObject_thenCopyShouldNotChange() {
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        User deepCopy = new User(pm);

        address.setCountry("Great Britain");

        assertNotEquals(
                pm.getAddress().getCountry(),
                deepCopy.getAddress().getCountry());

        Assert.assertNotEquals(deepCopy, pm);
    }

    @Test
    public void whenModifyingOriginalObject_thenCloneCopyShouldNotChange() {
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        User deepCopy = (User) pm.clone();

        address.setCountry("Great Britain");

        assertNotEquals(deepCopy.getAddress().getCountry(), pm.getAddress().getCountry());
        Assert.assertNotEquals(deepCopy, pm);
    }
}
