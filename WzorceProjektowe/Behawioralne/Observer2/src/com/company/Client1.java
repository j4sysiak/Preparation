package com.company;

public class Client1 implements IObserver {

    @Override
    public void notifyMe() {
        System.out.println("Zakończono wątek! " + getClass().getName());
    }
}
