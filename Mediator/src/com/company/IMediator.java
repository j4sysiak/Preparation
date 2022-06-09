package com.company;

public interface IMediator {

    void notify(Component sender, String event);
    // sprawdzamy przesłany event
    // button - "click"
    // checkbox - checkboxSelected
    // input - insertText
    // o tym zdarzeniu powiadomimy inne komponenty metoda notify() - odnosi się do poszczególnych naszych klas input-checkbox-button
    // wywołuje mwybrane metody w tych klasach, jeżeli wystąpiło dane zdarzenie.
    // Klasa Component implementuje metodę notify.
}
