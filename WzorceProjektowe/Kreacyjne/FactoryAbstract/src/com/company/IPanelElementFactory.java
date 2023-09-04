package com.company;

public interface IPanelElementFactory {

    //  Abstrakcyjna fabryka

    /*
    Bazowy interface
    Abstrakcyjna fabryka, której zadanie będzie utworzenie elementów bazowych typów (MacButton, WindowsButton, MacTexbox, WindowsTexbox)
    Zdefiniowanie interfejsu dla dwóch metod: tworzenie przycisku: createButton() i tworzenie textboxu: createTextbox()
    Utworzenie bazowych elementów bez określania konieczności konkretnych klas:
    - dla tworzenia przycisku: MacButton czy WindowsButton
    - dla tworzenia Textboxa: MacTexbox czy WindowsTexbox
    ta abstrakcyjnan fabryka nie wie nic o systemie Windows, czy systemie Mac
    */

    IButton createButton();  // może dla Win a może dla Mac to zależey jak zbudowaliśmy Application tj. co wstrzyknęliśmy do konstruktora: new MacFactory() czy new WindowsFactory()

    ITextbox createTextbox();
}