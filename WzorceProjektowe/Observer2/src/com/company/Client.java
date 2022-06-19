package com.company;

public class Client implements IObserver {

    //Client wykorzystuje polimorfizm - jest jednocześnie klientem i Observerem

    @Override
    public void update() {
        //new Subject(); //uruchamiamy wątek jakiegoś zadania i czekamy kiedy się zakończy
        System.out.println("Zakończono wątek!");
    }
}
