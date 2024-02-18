package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Q2_1858 {
    public static void main(String[] args) {

        /*
        Given the AnotherBook class (in the zip file), declare a List typed for AnotherBook namely ‘books’ ith the following AnotherBook’s:
            a. title=”Gone with the wind”, genre=”Fiction” (QID 2.1858)
            b. title=”Bourne Ultimatum”, genre=”Thriller”
            c. title=”The Client”, genre=”Thriller”
        Declare the following: List<String> genreList = new ArrayList<>();
        Stream books so that genreList refers to a List containing the genres of the books in the books List.
        */


        List<AnotherBook> books = Arrays.asList(  
                new AnotherBook("Gone with the wind", "Fiction"),        
                new AnotherBook("Bourne Ultimatum", "Thriller"),         
                new AnotherBook("The Client", "Thriller") );  
        List<String> genreList = new ArrayList<>();


















        books.stream()
//            .map(book -> book.getGenre())     // lambda
            .map(AnotherBook::getGenre)       // method reference
//                .map(                           // anonymous inner class
//                    new Function(){
//                        @Override
//                        public String apply(Object o){
//                            return ((AnotherBook)o).getGenre();
//                        }
//                    } 
//                )
//            .forEach(s->genreList.add(s));    // lambda
            .forEach(genreList::add);         // method reference (bound)
//            .forEach(ArrayList::add);         // does not compile!
//                .forEach (                      // anonymous inner class
//                    new Consumer(){
//                        @Override
//                        public void accept(Object o){
//                            genreList.add((String)o);
//                        }
//                    }
//                );
        System.out.println(genreList);
    }
    
}
