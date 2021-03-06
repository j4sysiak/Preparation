package com.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmailSender {

    public static EmailSender create() {
        return EmailSender.builder().build();
    }

    /*jedyna publiczna metoda*/
    public void sendEmail() {
        connectToSmtpServer();
        insertCredentials();
        System.out.println("sendEmail ...");
        disconnect();
    }

    private void connectToSmtpServer() {
        System.out.println("ConnectToSmtpServer ...");
    }

    private void insertCredentials () {
        System.out.println("insertCredentials ...");
    }

    private void disconnect() {
        System.out.println("disconnect ...");
    }

}
