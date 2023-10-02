package pl.jaceksysiak;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Blog {

    private List<MailObserver> mailObservers;

    public Blog() {
        this.mailObservers = new ArrayList<>();
    }

    public void addToSubscribents(MailObserver observers) {
        this.mailObservers.add(observers);
    }

    public void startWork2() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(11);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.mailObservers.forEach(s -> s.sendNewsletter("content: " + UUID.randomUUID()));
//            for (MailObserver observer : mailObservers) {
//                this.observer.newsletter("content: " + UUID.randomUUID());
//            }
        });
        thread.start();
    }

    public void startWork() {
        Thread thread = new Thread(() -> {
            while (Thread.currentThread().isAlive()) {
                int randomDelay = new Random().nextInt(1000);
                try {
                    Thread.sleep(randomDelay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.mailObservers.forEach(s -> s.sendNewsletter("time: " + randomDelay + ", content: " + UUID.randomUUID()));
//                for (MailObserver observer : mailObservers) {
//                    this.observer.newsletter("time: " + randomDelay + ", content: " + UUID.randomUUID());
//                }
            }
        });
        thread.start();
    }
}
