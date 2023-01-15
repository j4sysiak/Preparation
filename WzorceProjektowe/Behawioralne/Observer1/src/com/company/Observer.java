package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Observer implements IObserver {

    public String observerName;

    public Observer(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String context) {
        System.out.println("observer notified: " + observerName + ": " + context);
    }
}
