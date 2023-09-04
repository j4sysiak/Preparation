package com.company;

import com.company.mac.MacFactory;
import com.company.windows.WindowsFactory;
import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {

    /*
    Celem jest dostarczenie interfejsu do tworzenia różnych obiektów jednego typu (elementy dla panelu Windowsa i elementy dla panelu Mac"a)
    dla tej samej rodziny klas bez specyfikowania ich konkretnych klas - ale nie chcemy, żeby ściśle był powiązany
    z jakimś konkretnym typem.
    Przy czym, umożliwia jednemu obiektowi tworzenie różnych, powiązanych ze sobą, reprezentacji pod-obiektów
    określając ich typy podczas działania programu
    */

        /*tutaj decydujemy dla jakiego systemu budujemy aplikację: dla Mac, czy Windows - wybraliśmy Windows*/
        Application applicationForWindows = new Application(new WindowsFactory());  // w konstruktorze Application, przekazujemy konkretną implementację dla Windowsa
        applicationForWindows.createPanel();

        /*tutaj decydujemy dla jakiego systemu budujem aplikację: dla Mac, czy Windows - wybraliśmy Mac*/
        Application applicationForMac = new Application(new MacFactory()); // w konstruktorze Applikation, przekazujemy konkretną implementację dla Mac'a
        applicationForMac.createPanel();
    }
}
