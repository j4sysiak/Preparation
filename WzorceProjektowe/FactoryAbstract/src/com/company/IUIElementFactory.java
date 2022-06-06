package com.company;

public interface IUIElementFactory {

    /*
    Bazowy interface
    Abstrakcyjna fabryka, której zadanie będzie utworzenie elementów bazowych typów (MacButton, WindowsButton, MacTexbox, WindowsTexbox)
    Zdefiniowanie interfejsu dla dwóch metod: tworzenie przycisku: createButton() i tworzenie textboxu: createTextbox()
    Utworzenie bazowych elementów bez określania konieczności konkretnych klas:
    - dla tworzenia przycisku: MacButton czy WindowsButton
    - dla tworzenia Textboxa: MacTexbox czy WindowsTexbox
    ta abstrakcyjnan fabryka nie wie nic o systemie Windows, czy systemie Mac
    */

    IButton createButton();
    ITextbox createTextbox();
}
