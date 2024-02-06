package com.company.lab;

import java.util.ArrayList;
import java.util.List;

public class BasicLambdasRart2 {

    public static void main(String[] args) {
        // C:\Users\Jacek\Documents\JAVA\SpringBoot\Preparation\FunctionalInterface\Lambdas+Lab.pdf
        // https://www.udemy.com/course/java8_lambdasandstreams/learn/practice/1439110/introduction#overview

        BasicLambdasRart2 basicLambdasRart2 = new BasicLambdasRart2();

        // 5.
        // In main(), invoke the getPeople() – store the result in a variable named listPeople.
        List<Person> listPeople = getPeople();

        //6
        /*
        In main(), invoke the sortAge() method passing down listPeople; in sortAge() do the following:
        a) Using the Iterable sort() method (note: List extends Iterable), and the Comparator.comparing()
        method, sort the Person objects in ascending age order. Note that the argument to
        Comparator.comparing() requires a Function (In, Out) that returns a Comparable (a class that implements Comparable).
        From that, the comparing() method generates a Comparator that it passes to the sort() method.
         Note that as of Java 8, the List interface supports the sort() method directly so there is no
        need to use the Collections.sort(): i.e. instead of Collections.sort(list, comparatorRef); we now have list.sort(comparatorRef);
        b) Output the sorted list using the Iterable forEach() method passing in a lambda expression.
        */
        basicLambdasRart2.sortAge(listPeople);


    }

    private void sortAge(List<Person> listPeople) {
    }

    private static List<Person> getPeople() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Mike", 33, 1.8));
        result.add(new Person("Mary", 25, 1.4));
        result.add(new Person("Alan", 34, 1.7));
        result.add(new Person("Zoe", 30, 1.5));
        return result;
    }
}
















































