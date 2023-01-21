package com.company;

import org.testng.annotations.Test;

public class Client {

    @Test
    public static void test() {
        // uruchamiamy wątek jakiegoś zadania i czekamy kiedy się zakończy wątek z pracy (działania) jakiejś maszynerii Subject
        new Subject(new Observer1());
        new Subject(new Observer2());
        new Subject(new Observer3());

        //hurtowe powiadamianie obserwatorów (czyli klientów) kiedy skończy się wątek z pracy (działania) jakiejś maszynerii Subject
        var subject2 = new Subject2();
        subject2.addObserver((IObserver) new Client());
        subject2.addObserver(new Observer1());
        subject2.addObserver(new Observer2());
        subject2.addObserver(new Observer3());
        subject2.startWork();
    }

}
