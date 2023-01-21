package com.company;

public class Main {

    public static void main(String [] args) {
        // uruchamiamy wątek jakiegoś zadania i czekamy kiedy się zakończy wątek z pracy (działania) jakiejś maszynerii Subject

        System.out.println("sssssssssss");
        Client1 cli = new Client1();

        Subject sub = new Subject(cli);

        // new Subject(new Client2());
        //  new Subject(new Client3());

        /*
        // hurtowe powiadamianie obserwatorów (czyli klientów) kiedy skończy się wątek z pracy (działania) jakiejś maszynerii Subject
        var subject2 = new Subject2();
        subject2.addObserverToList(new Client1());
        subject2.addObserverToList(new Client2());
        subject2.addObserverToList(new Client3());
        subject2.startWork();
        */
    }
}
