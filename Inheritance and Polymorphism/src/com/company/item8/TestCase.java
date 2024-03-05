package com.company.item8;

public class TestCase {
    public static void main(String[] args) {
        System.out.println(new MNOP().x + " : " + new MNOP().y);  // 2 : 1

        ABCD abcd = new MNOP();

        abcd.getClass();  // MNOP  jako referencja

        int y = abcd.stat; //200 wezmie z typu ABCD  (base)
        int x = abcd.x;    //100 wezmie z typu ABCD  (base)

        int y2 = ABCD.stat;  //200 wezmie z typu ABCD  (base)
        //int x2 = ABCD.x;  non static

         abcd.staticMethod();
         abcd.noneStaticMethod();

        System.out.println();
    }
}
