package com.company;

public class Client3 implements IObserver {

    @Override
    public void update() {
        System.out.println("Zakończono wątek! " + getClass().getName());
    }
}
