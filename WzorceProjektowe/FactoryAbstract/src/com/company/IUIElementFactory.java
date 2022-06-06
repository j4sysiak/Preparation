package com.company;

public interface IUIElementFactory {

    /*
    Bazowy interface
    Abstrakcyjna fabryka, której zadanie będzie utworzenie elementów bazowych typów (MacButton, WindowsButton, MacTexbox, WindowsTexbox)
    Zdefiniowanie interfejsu dla dwóch metod: tworzenie przycisku: createButton() i tworzenie textboxu: createTextbox()
    */
    IButton createButton();
    ITextbox createTextbox();
}
