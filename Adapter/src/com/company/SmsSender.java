package com.company;

public class SmsSender implements INotificationSender{
    @Override
    public void sendNotification(int userId, Notification notification) {
        System.out.println("Sending Push notification to: " + userId + ", Title: " + notification.Title + " Body: " + notification.Body) ;
    }
}
