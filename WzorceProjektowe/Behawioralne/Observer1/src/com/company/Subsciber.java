package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subsciber implements ISubsciber {

    public String observerName;

    public Subsciber(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String context) {
        System.out.println("observer notified: " + observerName + ": " + context);
    }
}
