package com.company;

public class Client2 implements IObserver {

    @Override
    public void notifyMe() {
        System.out.println("Zakończono wątek! " + getClass().getName());
    }
}
