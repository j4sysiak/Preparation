package com.company;

public class Client {

    public static void main(String[] args) {

    /*
    Celem jest dostarczenie interfejsu do tworzenia różnych obiektów jednego typu
    dla tej samej rodziny klas bez specyfikowania ich konkretnych klas - ale nie chcemy, żeby ściśle był powiązany z jakimś konkretnym typem.
    Przy czym, umożliwia jednemu obiektowi tworzenie różnych, powiązanych ze sobą, reprezentacji podobiektów
    określając ich typy podczas działania programu
    */

        /*tutaj decydujemy dla jakiego systemu budujem aplikację: dla Mac, czy Windows*/
        var uiApplicationForWindows = new Application(new WindowsFactory());
        uiApplicationForWindows.renderUI();

        /*tutaj decydujemy dla jakiego systemu budujem aplikację: dla Mac, czy Windows*/
        var uiApplicationForMac = new Application(new MacFactory());
        uiApplicationForMac.renderUI();
    }
}
