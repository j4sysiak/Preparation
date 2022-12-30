package com.company;

public class Client {

    public static void main(String[] args) {

        /*jedyna publiczna metoda*/
        /*sendEmail wywoła pozostałe privat metody: te metody są już dla nas tylko abstrakcyjne */
        EmailSender.create().sendEmail();
    }
}
