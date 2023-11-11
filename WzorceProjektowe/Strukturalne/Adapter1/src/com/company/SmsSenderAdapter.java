package com.company;

import external.library.SmsSender;

public class SmsSenderAdapter implements INotificationSender {

    // clue:
    //tworzymy obiekt (pole w tej klasie) zewnętrznej bibioteki: external.library.SmsSender
    //i poprzez ten obiekt dostaniemy się do właściwej metody biblioteki zewnętrznej wysyłającej notyfikacje
    private SmsSender smsSender = new SmsSender();

    @Override
    public void sendNotification(int userId, Notification notification) {

        // musimy w odpowiedni dla nas sposób zaadoptować zewnętrzny interface SmsSender do naszego INotificationSender
        String userPhoneNr = "1111111111";  //  wybierany z klasy User na podstawie userId
        smsSender.sendSms(userPhoneNr, notification.Title + ":" + notification.Body);
    }
}
