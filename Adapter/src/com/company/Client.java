package com.company;

import org.junit.jupiter.api.Test;

/*
Strukturalny wzorzec projektowy, którego celem jest umożliwienie współpracy dwóm klasom o niekompatybilnych interfejsach.
Adapter przekształca interface jednej klasy na interfejs drugiej klasy.
Czyli zadaniem adaptera jest "Opakowanie" jednego interfejsu w nowy.
*/

public class Client {

    @Test
    public void test() {

        var iNotificationSender = new EmailSender();
        iNotificationSender.sendNotification(1, Notification.builder().
                Title("TestTitle")
                .Body("TestBody")
                .build()
        );
    }
}
