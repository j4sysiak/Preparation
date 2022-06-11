package com.company;

/*
Behawioralny wzorzec projektowy pozwalający na zmianę zachowania obiektu poprzez zmianę jego wewnętrznego stanu.
Uzależnia sposób działania obiektu od stanu w jakim się aktualnie znajduje.
Mając cztery stany bankomatu i cztery funkcjonalności to może w jednej klasie być trudno utrzymać wszystkie te stany - dużo ifów.
Lepiej będzie wprowadzić do procesu stany - 4 klasy dla konkretnych stanów - 4 implementacje.
- brak gotówki
- nie ma karty
- ma kartę ale bez PIN
- jest karta pin OK
Rozdzielamy implementację od stanu bankomatu
Wprowadzamy kontekst, który będzie w stanie trzymać aktualny stan bankomatu oraz będzie w stanie zmienić go w zależności od wykonanej akcji.
*/

public class Client {

    public static void main(String[] args) {


    }
}
