package com.company.Optional;

import com.company.User;

public class Client {

    public static void main(String[] args) {
/*
        Wszystkie zależności z wyskopoziomowych modułów ustalających politykę dla niskopoziomowych (nadrzędnych) modułów - są odwrócone.
        To właśnie dlatego tajniki implementacyjne wysokopoziomowych modułów są niezależne od sposobów implementacji dla niskopoziomowych modułów.
        Moduły wysokiego poziomu nie powinny zależeć od modułów niskiego poziomu.
        Oba powinny zależeć od abstrakcji np. interfejsów.
        Abstrakcje nie powinny zależeć od szczegółów.
        Szczegóły też powinny zależeć od abstrakcji.
        Zasada Odwócenia Zależności - żeby klasy nie wiedziały o swoich tajnikach implementacyjnych
        ale nie chodzi o hermetyzację
        Obiekty powinny zależeć od abstrakcji a nie od typów.
*/

        AuthenticationManager.builder().build().authenticate(
                User.builder().name("Jacek KKj").email("test@wp.pl").password("test@wp.pl").phoneNumber("123456").build(), "test@wp.pl" , "test@wp.pl"
        );

    }
}
