package lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Q2_1738 {
    public static void main(String[] args) {

        /* 5
        Here are several parts to this: (QID 2.1738)
a. Using 1, 2 and 3 create a List of Integers.
    i. Stream the list and calculate the sum, using the sum() method from IntStream.
    ii. Stream the list again and calculate the maximum value, using the max() method from IntStream.
b. Given the Person class (in the zip file), declare a List typed for Person with the following Person’s:
    i. “Alan”, “Burke”, 22
    ii. “Zoe”, “Peters”, 20
    iii. “Peter”, “Castle”, 29
Using the max(Comparator) from Stream, calculate the oldest person in the list.
c. Using 10, 47, 33 and 23 create a List of Integers. Stream the list and using the following versions of reduce(), calculate the maximum value:
    i. Optional<T> reduce(BinaryOperator<T> accumulator)
    ii. T reduce(T identity, BinaryOperator<T> accumulator)
        */

        // 1a. sum() is not in Stream it is in IntStream
        List<Integer> li2 = Arrays.asList(1,2,3);
        Integer sum = li2.stream()
                // IntStream mapToInt(ToIntFunction)
                // ToIntFunction is a functional interface:
                //      int applyAsInt(T value)
                .mapToInt(i->i) // unboxing
                .sum();
        System.out.println("sum == "+sum);
        // 1b. max() in IntStream
        int max = li2.stream().mapToInt(i -> i.intValue()).max().getAsInt();
        System.out.println("max == "+max);

        // 2. max(Comparator) in Stream
        List<Person> people = Arrays.asList(
                        new Person("Alan", "Burke",22),
                        new Person("Zoe", "Peters",20),
                        new Person("Peter", "Castle",29));
        Person oldestPerson = people.stream()
                // Optional<Person> max(Comparator)
                // Comparator Comparator.comparing(Function that returns a Comparable)
                // comparing() takes the functional interface Function:
                //      R apply(T t)
                //      p.getAge() returns an Integer (is a Comparable)
                .max(Comparator.comparing(p->p.getAge()))
                .get();
        System.out.println(oldestPerson);
                
        List<Integer> li = Arrays.asList(22,13,34);
        Optional<Integer> oi = li.stream()
                .max(Comparator.comparing(i->i));// Integer is a Comparable as Integer implements Comparable

        // 3. reduce
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        int max2 = ls.stream()
                // Optional<Integer> reduce(BinaryOperator<Integer> acc)
                // BinaryOperator<T> extends functional interface BiFunction<T,U,R>
                //    BiFunction's functional method is R apply(T t, U u)
//                .reduce((a, b)->a>b?a:b)
                .reduce((a, b)->Integer.max(a, b))
                .get();
        System.out.println(max2);

        int max3 = ls.stream()
                // Integer reduce(Integer identity, BinaryOperator<Integer> acc)
                // The identity element is both the initial value of the reduction 
                // and the default result if there are no elements in the stream. 
                .reduce(Integer.MIN_VALUE, (a, b)->Integer.max(a, b));
        System.out.println(max3);

    }
    
}
