package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        //--------------------------- example 1
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4));
        intList.stream().forEach(v -> System.out.println(v));
        intList.stream()
                .filter(i -> i>3)
                .forEach(v -> System.out.println(v));


        //--------------------------- example 2
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "haskhsf", 22, Address.GERMANY));
        employees.add(new Employee(1, "sdfadf", 11, Address.POLAND));
        employees.add(new Employee(1, "bcvnbv", 44, Address.BANGLADESH));

        employees.stream()
                .filter(i -> i.getAddress() == Address.BANGLADESH)
                .map(e -> e.getName().toUpperCase())
                .sorted()
                .forEach( n -> System.out.println("Empl. name: " + n));

    }
}



















































