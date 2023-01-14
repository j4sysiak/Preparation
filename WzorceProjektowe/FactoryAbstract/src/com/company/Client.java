package com.company;

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {

    /*
    Celem jest dostarczenie interfejsu do tworzenia różnych obiektów jednego typu
    dla tej samej rodziny klas bez specyfikowania ich konkretnych klas - ale nie chcemy, żeby ściśle był powiązany
    z jakimś konkretnym typem.
    Przy czym, umożliwia jednemu obiektowi tworzenie różnych, powiązanych ze sobą, reprezentacji pod-obiektów
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
