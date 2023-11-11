package com.company;

import org.junit.Test;

/*
    Strukturalny wzorzec projektowy, którego celem jest umożliwienie współpracy dwóm klasom o niekompatybilnych interfejsach.
    Adapter przekształca interface jednej klasy na interfejs drugiej klasy.
    Czyli zadaniem adaptera jest "Opakowanie" jednego interfejsu w nowy interfejs.
*/

public class ClientTest {

    @Test
    public void test() {

        //dostanie się do wnętrznej klasy wysyłającej notyfikację w EmailSender
        INotificationSender adapter1 = new EmailSender();
        adapter1.sendNotification(1001, Notification.builder()
                .Title("TestTitle1")
                .Body("TestBody1")
                .build());

        //dostanie się do wnętrznej klasy wysyłającej notyfikację w PushSender
        INotificationSender adapter2 = new PushSender();
        adapter2.sendNotification(1002, Notification.builder()
                .Title("TestTitle2")
                .Body("TestBody2")
                .build());

        //dostanie się do zewnętrznej bibioteki wysyłającej SMS SmsSender
        INotificationSender adapter3 = new SmsSenderAdapter();
        adapter3.sendNotification(1003, Notification.builder()
                .Title("TestTitle3")
                .Body("TestBody3")
                .build());
    }
}
