package com.company;

public class Main {

    public static void main(String [] args) {
        // uruchamiamy wątek jakiegoś zadania i czekamy kiedy się zakończy wątek z pracy (działania) jakiejś maszynerii Subject
        // powiadomianie po kolei każdego klienta po zakończeniu wątku
        // var cli = new Client1();
        IObserver cli1 = new Client1();
        new Subject(cli1);

        new Subject(new Client2());
        new Subject(new Client3());


        // hurtowe powiadamianie obserwatorów (czyli klientów) kiedy skończy się wątek z pracy (działania) jakiejś maszynerii Subject
        // powiadomianie hurtowo wszystkich klientów po zakończeniu wątku
        Subject2 subject2 = new Subject2();
        subject2.subscribe(new Client1());
        subject2.subscribe(new Client2());
        subject2.subscribe(new Client3());
        subject2.startWork();

    }
}
