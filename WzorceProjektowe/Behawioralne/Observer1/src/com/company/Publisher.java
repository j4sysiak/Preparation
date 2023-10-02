package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<ISubsciber> listOfISubscibers = new ArrayList();

    public void addUser(ISubsciber iSubsciber) {
        this.listOfISubscibers.add(iSubsciber);
    }

    public void removeUser(ISubsciber iSubsciber) {
        this.listOfISubscibers.remove(iSubsciber);
    }

    public void notifyUser(String messageToSubscribers) {
        this.listOfISubscibers.forEach(s -> s.notify(messageToSubscribers));
    }

}
