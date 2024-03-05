package com.company.item8;

public class MNOP extends ABCD{
    static int y = 1;
    int x = 2;

    static void staticMethod() {
        System.out.println("Calling from staticMethod() in MNOP");
    }

    void noneStaticMethod() {
        System.out.println("Calling from noneStaticMethod() in MNOP");
    }
}


