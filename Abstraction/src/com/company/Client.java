package com.company;

public class Client {

    public static void main(String[] args) {

        /*jedyna publiczna metoda*/
        /*sendEmail wywoła pozostałe metody privat : te metody są już dla nas tylko abstrakcyjne */
        EmailSender.create().sendEmail("jacek@wp.pl", "myMessage", "bla bla bla");
    }
}
