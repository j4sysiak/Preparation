package com.company;

public class Observer2 {
    public static void main(String [] args) {

        Client1 cli = new Client1();
        Subject sub = new Subject(cli);
    }
}
