package lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Q2_1762 {
    public static void main(String[] args) {
/*
        Given the Item class (in the zip file), declare a List typed for Item with the following Item’s:
        a. id=1 name=”Screw”
        b. id=2 name=”Nail”
        c. id=3 name=”Bolt”
        Stream the list and sort it so that it outputs “BoltNailScrew” i.e. alphabetic name order. Use Stream’s
        forEach method to output the names (use the method reference version for the required Consumer
        lambda).
 */
          List<Item> l = Arrays.asList(                 
                  new Item(1, "Screw"),                 
                  new Item(2, "Nail"),                 
                  new Item(3, "Bolt")         
          );



        // Option 1


        Comparator<Item> comparator = new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                return a.getId().compareTo(b.getId());
            }
        };
        // lambda
        Comparator<Item> comparator2 = (a, b) -> a.getId().compareTo(b.getId());


        l.stream()
                // Stream<Item> sorted(Comparator<Item>)
                .sorted((a, b) -> a.getId().compareTo(b.getId()))
                // OR .sorted(Comparator.comparing(Item::getId))
                .forEach(System.out::println);  // Sorted by id. Output: ScrewNailBolt



           // Option 2
             Function<Item, String> function = new Function<Item, String>() {
                 @Override
                 public String apply(Item a) {
                     return a.getName();
                 }
             };
             // lambda
        Function<Item, String> function2 = a -> a.getName();


          // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
          // public interface Function<T, R> {  ma metodę:  R apply(T t);
          Function<T, R>

             Comparator<Item> comparator1 = Comparator.comparing(a -> a.getName());
             l.stream()
             // Stream<Item> sorted(Comparator<Item>)
            .sorted(Comparator.comparing(a->a.getName())) // sorting by name
             .map((item)->item.getName()) // mapping to a Stream<String>
            //.map(Item::getName) // method reference version
            .forEach(System.out::print); // Sorted by name, as we wanted. Output: BoltNailScrew




        // Option 3
//            l.stream()
//            .map((i)->i.getName())    // mapping to a Stream<String> 
//            .forEach(System.out::print); // Not sorted at all. Output: ScrewNailBolt  

            l.stream()          // Option 4
            .map((i)->i.getName())  // mapping to a Stream<String>
            .sorted()               // sort by the String's natural order
            .forEach(System.out::print); // Sorted by name, as we wanted. Output: BoltNailScrew  
    }  
}


