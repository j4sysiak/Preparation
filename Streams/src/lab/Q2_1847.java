package lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2_1847 {
    public static void main(String[] args) {

        /*
        Given the Book class (in the zip file), declare a List typed for Book with the following Book’s:
            a. title=”Gone with the wind”, price=5.0
            b. title=”Gone with the wind”, price=10.0
            c. title=”Atlas shrugged”, price=15.0

        In a pipeline which has no return type: (QID 2.1847)
        - stream the books
        - using the collect() method, generate a Map that maps the book title to its price
        - using forEach(), output the title and price of each entry in the map
        What happened and why? Fix this by using the Collectors.toMap(Function, Function, inaryOperator) method.
        */

        List<Book> books = Arrays.asList(         
                new Book("Gone with the wind", 10.0),         
                new Book("Gone with the wind", 20.0),         
                new Book("Atlas Shrugged", 15.0) ); 
        
        books.stream()
//                .collect(Collectors.toMap((b->b.getTitle()), b->b.getPrice())) //  IllegalStateException                  
                .collect(Collectors.toMap((b->b.getTitle()), b->b.getPrice(), (v1,v2) -> v1*v2))                         
                .forEach((a, b)->System.out.println(a+" "+b)); 
    }
}
