package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subject2 {

    private List<IObserver> listOfObservers;

    public Subject2() {
        this.listOfObservers = new ArrayList();
    }

    public void subscribe(IObserver iObserver) {
        this.listOfObservers.add(iObserver);
    }

    public void startWork() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // o zakończonej pracy powiadamiamy wszystkich observerów po kolei
                listOfObservers.stream()
                        .forEach(observer -> observer.update());
            }

        });
        thread.start();
    }
}










































