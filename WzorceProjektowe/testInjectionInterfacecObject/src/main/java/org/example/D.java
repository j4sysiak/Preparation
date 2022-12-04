package org.example;

public class D implements IC {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message-->" + message);
    }
}
