package com.company;

public class SmsSenderAdapter implements INotificationSender {

    //tworzymy obiekt (pole w tej klasie) zewnętrznej bibioteki
    //i poprzez ten obiekt dostaniemy się do właściwej metody biblioteki zewnętrznej wysyłającej notyfikacje
    private SmsSender iSmsSender = new SmsSender();

    @Override
    public void sendNotification(int userId, Notification notification) {

        
        // musimy w odpowiedni dla nas sposób zaadoptować zewnętrzny interface SmsSender do naszego INotificationSender
        String userPhoneNr = "1111111111";  //  wybierany z klasy User na podstawie userId
        iSmsSender.sendSms(userPhoneNr, notification.Title + ":" + notification.Body);
    }
}
