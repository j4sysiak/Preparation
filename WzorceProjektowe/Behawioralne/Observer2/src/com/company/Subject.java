package com.company;

public class Subject {

    // wątkowi zarządzanemu przez Subject przekazujemy element Observatora

    //Wstrzykujemy obiekt Observera - który jest jednocześnie Clientem
    // ten obiekt observera będzie obserwował stan wykonania wątku
    // i jeżeli np. wątek zakończy się
    // to observer poinformuje o tym
    public Subject(IObserver iObserver) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                iObserver.update();
            }
        });
        thread.start();
    }
}










































