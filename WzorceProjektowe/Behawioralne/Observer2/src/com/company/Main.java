package com.company;

import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String [] args) {
        // uruchamiamy wątek jakiegoś zadania i czekamy kiedy się zakończy wątek z pracy (działania) jakiejś maszynerii Subject
        new Subject(new Client());
        new Subject(new Client2());

        //hurtowe powiadamianie obserwatorów (czyli klientów) kiedy skończy się wątek z pracy (działania) jakiejś maszynerii Subject
        var subject2 = new Subject2();
        subject2.addObserver(new Client());
        subject2.addObserver(new Client2());
        subject2.addObserver(new Client3());
        subject2.addObserver(new Client4());
        subject2.startWork();
    }

}
