package src.polimorphism;

// use of instanceof Operator in Java

class SuperClass {
}

class SubClass extends SuperClass {
}

interface Interface {
}

class SuperClassImplementingInteface implements Interface {
}

class SubClass2 extends SuperClassImplementingInteface {
}

class SomeOtherClass {
}

public class TestPolimorphism2 {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();

        System.out.println(subClass instanceof SubClass);  // true
        System.out.println(subClass instanceof SuperClass);  // true
        System.out.println(subClass instanceof Object);  // true

        Object subClassObj = new SubClass();
        // OR this is the same:  var subClassObj = new SubClass();

        System.out.println(subClassObj instanceof SubClass);  // true
        System.out.println(subClassObj instanceof SuperClass);  // true
        System.out.println(subClassObj instanceof Object);  // true


        SubClass2 subClass2 = new SubClass2();

        System.out.println(subClass2 instanceof Interface);  // true
        System.out.println(subClass2 instanceof SuperClassImplementingInteface);  // true
        System.out.println(subClass2 instanceof SubClass2);  // true
        System.out.println(subClass2 instanceof Object);  // true



//        SomeOtherClass someOtherClass = new SomeOtherClass();


    }
}
