package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    // Mając subsciber'a tworzymy klasę Publishera notyfikacji.
    // Publisher będzię w sobie agregował subscibentów, czyli posiada listę subscribentów i będzie tą listę modyfikował
    // dodawał / usuwał z listy subscybentów do notyfikacji


    private List<IObserver> iobservers = new ArrayList();


    public void subscribe(IObserver iobserver) {
        iobservers.add(iobserver);
    }

    public void unSubscribe(IObserver iobserver) {
        iobservers.remove(iobserver);
    }

    public void notify(String context) {
        iobservers.forEach(s -> s.update(context));
    }

}
