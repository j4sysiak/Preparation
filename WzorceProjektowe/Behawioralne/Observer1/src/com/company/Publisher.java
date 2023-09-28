package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<ISubsciber> listOfISubscibers = new ArrayList();

    public void subscribe(ISubsciber iSubsciber) {
        listOfISubscibers.add(iSubsciber);
    }

    public void unSubscribe(ISubsciber iSubsciber) {
        listOfISubscibers.remove(iSubsciber);
    }

    public void notify(String messageToSubscribers) {
        for (ISubsciber s : listOfISubscibers) {
            s.update(messageToSubscribers);
        }
    }

}
