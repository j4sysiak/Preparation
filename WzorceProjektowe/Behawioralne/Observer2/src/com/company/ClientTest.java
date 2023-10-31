package com.company;

public class ClientTest {

    @org.junit.Test
    public void test() {
        // uruchamiamy wątek jakiegoś zadania i czekamy kiedy się zakończy wątek z pracy (działania) jakiejś maszynerii Subject
        // powiadomianie po kolei każdego klienta po zakończeniu wątku
        // var cli = new Client1();
        IObserver cli1 = new Client1();
        Subject subject1 = new Subject(cli1);
        subject1.startWork();

        new Subject(new Client2()).startWork();
        new Subject(new Client3()).startWork();


        // hurtowe powiadamianie obserwatorów (czyli klientów) kiedy skończy się wątek z pracy (działania) jakiejś maszynerii Subject
        // powiadomianie hurtowo wszystkich klientów po zakończeniu wątku
        Subject2 subject2 = new Subject2();
        subject2.subscribe(new Client1());   // dodajemy do listy
        subject2.subscribe(new Client2());   // dodajemy do listy
        subject2.subscribe(new Client3());   // dodajemy do listy
        subject2.startWork();
    }
}
