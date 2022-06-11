package com.company;

// zewnętrzna klasa do której będziemy budować adapter
public class SmsSender {
    public void senSms(String to, String text) {
        System.out.println("Sending SMS to: " + to);
    }
}
