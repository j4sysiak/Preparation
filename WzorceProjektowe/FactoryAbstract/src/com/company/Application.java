package com.company;

public class Application {

    /*
      Będzie bazować na interfejse IUIElementFactory
      Dostarczymy tutaj konkretną implementację jako abstrakcję fabryki poprzez konstruktor (Dependency Injection).
      Przekazują interfejs (fabrykę) poprzez konstruktor, klasa Application nie będzie w stanie rozróżnić,
      czy tworzymy coś dla Maca, czy Windowsa.

      Zadaniem tej klasy, będzie utworzenie interfejsu użytkownika, w celu utworzenia konkretnych elementów
      niezależnie od systemu.
    */

    private IUIElementFactory iuiElementFactory;

    public Application(IUIElementFactory iuiElementFactory) {
        this.iuiElementFactory = iuiElementFactory;
    }

    /*tworzenie UI aplikacji niezależnie od systemu: Mac i Windows*/
    public void renderUI(){
        var createNewFileButton = iuiElementFactory.createButton();
        createNewFileButton.render();

        var textbox = iuiElementFactory.createTextbox();
        textbox.render();
    }
}
