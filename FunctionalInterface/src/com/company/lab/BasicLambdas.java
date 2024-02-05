package com.company.lab;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class BasicLambdas {

    public static void main(String[] args) {
    // C:\Users\Jacek\Documents\JAVA\SpringBoot\Preparation\FunctionalInterface\Lambdas+Lab.pdf
    // https://www.udemy.com/course/java8_lambdasandstreams/learn/practice/1439110/introduction#overview

        BasicLambdas basicLambdas = new BasicLambdas();

        /* 1.
        In main() invoke the consumer() method; in consumer() do the following:
        a) Using a lambda expression, implement the Printable interface (typed for String).
           The relevant method just prints out the String argument it receives.
                Invoke the relevant method, passing in "Printable lambda".
        b) Using both a lambda expression and a method reference, implement 1a using a Consumer.
        */
        basicLambdas.consumer();


       /*
        2. In main() invoke the supplier() method; in supplier() do the following:
        a) Using a lambda expression, implement the Retrievable interface (typed for Integer).
        The relevant (odpowiednia) method just returns 77. Invoke the relevant method.
        b) Using a lambda expression, implement 2a using a Supplier.
        */
        basicLambdas.supplier();

    }

    private void consumer() {
        // Printable<T> is a functional interface - has one abstract method
        // void print(T t)  is similar to java.util.function.Consumer
        //a.
        Printable<String> lambda = s -> System.out.println(s);
        lambda.print("Printable lambda");

        //b.
        // Consumer is a functional interface  - has one abstract method
        //   void accept(T t)  is similar to java.util.function.Consumer
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Consumer lambda");

        Consumer<String> consumerMR = System.out::println;
        consumerMR.accept("Consumer method reference");
    }

    private void supplier() {
        // Retrievable<T> is a functional interface - has one abstract method
        //   T retrieve()  is similar to java.util.function.Supplier
        //a.
        Retrievable<Integer> lambda = () -> 77;
        System.out.println("Retrievable generated: " + lambda.retrieve());

        //b.
        // Supplier is a functional interface  - has one abstract method
        //   T get()
        Supplier<Integer> supplier = () -> 77;
        System.out.println("Supplier generated: " + supplier.get());

    }
}





































