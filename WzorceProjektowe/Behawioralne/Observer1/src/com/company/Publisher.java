package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    // Mając Subsciber'a tworzymy klasę Publishera notyfikacji.
    // Publisher będzię w sobie agregował subscibentów, czyli posiada listę subscribentów i będzie tą listę modyfikował
    // dodawał / usuwał z listy subscybentów do notyfikacji

    private List<ISubsciber> listOfISubscibers = new ArrayList();

    public void subscribe(ISubsciber iSubsciber) {
        listOfISubscibers.add(iSubsciber);
    }

    public void unSubscribe(ISubsciber iSubsciber) {
        listOfISubscibers.remove(iSubsciber);
    }

    public void notify(String messageToSubscribers) {
        listOfISubscibers.forEach(s -> s.update(messageToSubscribers));
    }

}
