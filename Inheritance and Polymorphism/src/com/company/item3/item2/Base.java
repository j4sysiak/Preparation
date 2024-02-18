package com.company.item3.item2;

public class Base {
    public Object getValue() {
        return new Object();
    }
}
class Base2 extends Base {
    public Object getValue() {
        return "hello";
    }
}

  class TestCase {

    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.getValue());
    }
}
