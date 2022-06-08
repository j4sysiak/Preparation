package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Publisher {

    // Mając subsciber'a tworzymy klasę Publishera notyfikacji.
    // Publisher będzię w sobie agregowała subscibentów, czyli posiada listę subscribentó i będzie tą listę modyfikował
    // dodawał / usuwał z listy subscybentów do notyfikacji


    private List<ISubscriber> iSubscribers = new ArrayList();


    public void subscribe(ISubscriber iSubscriber) {
        iSubscribers.add(iSubscriber);
    }

    public void unSubscribe(ISubscriber iSubscriber) {
        iSubscribers.remove(iSubscriber);
    }

    public void notify(String context) {
        iSubscribers.forEach(s -> s.update(context));
    }

}
