package com.company;

// zewnętrzna klasa do której będziemy budować adapter
public class SmsSender {
     void sendSms(String to, String text) {
        System.out.println("Sending SMS to: " + to + " Body:Text " + text);
    }
}
