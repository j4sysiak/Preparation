package com.company;

public abstract class Generator {

    //to jest metoda szablonowa - wykonywana będzie dla każdego z trzech algorytmów (pdf, cvs, excel)w poszczególnych klasach
    public void generateReport() {
        getData();
        preparedData();
        generateFile();
        sendFile();
    }

    protected abstract void preparedData();
    protected abstract void generateFile();

    protected void getData() {
        System.out.println("Base get data ...");
    }

    protected void sendFile() {
        System.out.println("Sending generated report");
    }
}
