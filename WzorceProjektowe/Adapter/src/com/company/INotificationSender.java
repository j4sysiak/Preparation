package com.company;

public interface INotificationSender {

    void sendNotification(int userId, Notification notification);

   // void sendSms(String to, String text);
}
