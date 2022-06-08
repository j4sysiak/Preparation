package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subscriber implements ISubscriber {

    public String subscriberName;

    public Subscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String context) {
        System.out.println("Subscriber notified: " + subscriberName + ": " + context);
    }
}
