package com.company;

public class Application {

    /*
      Będzie bazować na interfejsie IUIElementFactory  (abstrakcyjna Faktoria)
      Dostarczymy tutaj konkretną implementację jako abstrakcję fabryki poprzez konstruktor (Dependency Injection).
      Przekazują interfejs (fabrykę) poprzez konstruktor, klasa Application nie będzie w stanie rozróżnić,
      czy tworzymy coś dla Maca, czy Windowsa.

      Zadaniem tej klasy, będzie utworzenie interfejsu użytkownika, w celu utworzenia konkretnych elementów
      niezależnie od systemu.
    */

    private IPanelElementFactory iPanelElementFactory;

    // wstrzykujemy przez konstruktor element, na którym bazujemy: abstrakcyjna Faktoria
    public Application(IPanelElementFactory iPanelElementFactory) {
        this.iPanelElementFactory = iPanelElementFactory;
    }

    /*tworzenie UI aplikacji niezależnie od systemu: Mac i Windows*/

    public void renderPanel() {
        IButton createAbstractButton = iPanelElementFactory.createButton();  /*tutaj bazujemy jeszcze na abstrakcji bo nie wiemy co przyjdzie tworzyć, element dla Windowsa, czy może Mac'a*/
        createAbstractButton.render();

        ITextbox createAbstractTextbox = iPanelElementFactory.createTextbox();  /*tutaj bazujemy jeszcze na abstrakcji bo nie wiemy co przyjdzie tworzyć, element dla Windowsa, czy może Mac'a*/
        createAbstractTextbox.render();
    }
}
