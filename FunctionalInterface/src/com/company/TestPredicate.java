package com.company;

import java.util.function.

 interface Evaluate<T> {
    boolean isNegative(T t); // similar to Predicate
}

public class  TestPredicate {

     public static void  main(String [] args) {

         Evaluate<Integer> evaluate = new Evaluate<>() {

             @Override
             public boolean isNegative(Integer i) {
                 return i < 0;
             }
         };
         evaluate.isNegative(1);

         // lambda
         Evaluate<Integer> evaluate2 = (i) -> i < 0;
         evaluate2.isNegative(1);
     }
}









































