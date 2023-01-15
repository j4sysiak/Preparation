package com.company;

public class Client implements IObserver {

    //Client wykorzystuje polimorfizm - jest jednocześnie klientem i Observerem

    @Override
    public void update() {
        System.out.println("Zakończono wątek! " + getClass().getName());
    }
}
