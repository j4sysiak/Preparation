package com.company;

public class EmailSender {

    private void connectToSmtpServer() {
        System.out.println("ConnectToSmtpServer ...");
    }

    private void insertCredentials () {
        System.out.println("insertCredentials ...");
    }

    public void sendEmail() {
        connectToSmtpServer();
        insertCredentials();
        System.out.println("sendEmail ...");
        disconnect();
    }

    private void disconnect() {
        System.out.println("disconnect ...");
    }

}
