package com.company;


@FunctionalInterface
interface Welcome {
    void welcomeMessage();

    //moze byc
    default void methodOne(){
        System.out.println("Hello One");
    }

    //moze byc
    default void methodTwo(){
        System.out.println("Hello Two");
    }

    //nie moze byc - może być tylko jedna metoda , więc albo methodOne() alba ta - wybór należy do Ciebie kolego
    //void absMethod();
}

@FunctionalInterface
interface WelcomeWithOneParam {
    void welcomeMessage(String message);
}

@FunctionalInterface
interface WelcomeWithOneParamAndReturnValue {
    String welcomeMessage(String message);
}

@FunctionalInterface
interface WelcomeWithTwoParam {
    void welcomeMessage(String message1, String message2);
}


//Kazdy interface funkcyjny musi mieć:
//        Some key point -
//        1. >= It's a Java 8 Feature
//        2. Exactly ONE Abstract method in an Interface
//        3. Single Abstract Method Interface (SAM)
//        4. @FunctionalInterface java annotation is used



public class DemoFI {

    public static void main(String[] args) {
        Welcome welcome = () -> System.out.println("Welcome Interface is implemented");
        welcome.welcomeMessage();


        WelcomeWithOneParam welcomeWithOneParam = (message)
                -> System.out.println("Welcome Interface is implemented " + message);
        welcomeWithOneParam.welcomeMessage("KAKA");


        WelcomeWithTwoParam welcomeWithTwoParam = (message1, message2)
                -> System.out.println("Welcome Interface is implemented " + message1 + ":" + message2);
        welcomeWithTwoParam.welcomeMessage("KAKA1", "KAKA2");


        WelcomeWithOneParamAndReturnValue welcomeWithOneParamAndReturnValue =  (m) ->  "some string " + m;
        System.out.println(welcomeWithOneParamAndReturnValue.welcomeMessage("KAKA"));

        //iteration using Lambda


    }

}

































