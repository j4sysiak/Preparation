package com.company;

public abstract class Generator {

    //to jest metoda szablonowa - wykonywana będzie dla każdego z trzech algorytmów (pdf, cvs, excel)w poszczególnych klasach
    public void generateReport() {
        getData();
        preparedData();
        generateFile();
        sendFile();
    }

    //każda metoda wysyłki ma inny sposób przygotowania danych
    protected abstract void preparedData();

    //każda metoda wysyłki ma inny sposób generowania pliku
    protected abstract void generateFile();

    //dla wszystkich metod wysyłki taka sama
    protected void getData() {
        System.out.println("Base: Get Data ...");
    }

    //dla wszystkich metod wysyłki taka sama
    protected void sendFile() {
        System.out.println("Base: Sending generated report");
    }
}
