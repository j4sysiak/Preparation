package com.company;

public class Application {

    /*
      Będzie bazować na interfejsie IPanelElementFactory  (abstrakcyjna Faktoria)
      Dostarczymy tutaj konkretną implementację poprzez wstrzyknięcie  abstrakcyjnej fabryki (Dependency Injection).
      Przekazując interfejs (abstrakcyjna Faktoria) poprzez konstruktor, klasa Application nie będzie w stanie rozróżnić, czy tworzymy coś dla Maca, czy Windowsa.

      Zadaniem tej klasy, będzie utworzenie abstrakcyjnego panelu użytkownika i potem utworzenia konkretnych elementów niezależnie od systemu.
    */

    private IPanelElementFactory iPanelElementFactory;

    // wstrzykujemy przez konstruktor element, na którym bazujemy: abstrakcyjna Faktoria
    public Application(IPanelElementFactory iPanelElementFactory) {
        this.iPanelElementFactory = iPanelElementFactory;
    }

    /*tworzenie  Astrakcyjnego Panelu (abstrakcyjna Faktoria)  niezależnie od systemu: Mac czy Windows*/

    public void createPanel() {
        //obsługa Buttonu - ale jesccze nie wiem jakiego systemu
        IButton createAbstractButton = iPanelElementFactory.createButton();  /*tutaj bazujemy jeszcze na abstrakcji bo nie wiemy co przyjdzie tworzyć, element dla Windowsa, czy może Mac'a*/
        createAbstractButton.createButton();
        createAbstractButton.handleClickButton();

        //obsługa Textbox - ale jesccze nie wiem jakiego systemu
        ITextbox createAbstractTextbox = iPanelElementFactory.createTextbox();  /*tutaj bazujemy jeszcze na abstrakcji bo nie wiemy co przyjdzie tworzyć, element dla Windowsa, czy może Mac'a*/
        createAbstractTextbox.createTextbox();
        createAbstractTextbox.handleTextboxInput();
    }
}
