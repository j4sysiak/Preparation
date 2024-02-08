import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        // firstPipeline();
        //  lazyRetrieveDataPipeline();
        // beneficialOfUsingSreamsLazyOPerationPipeline();
        // collectionStreams();
        //  mapStreams();
        // streamOfExample();
        // streamFromFileLines();
        // infiniteStream();
        // optionalStream();    //Optional<T> it replace null - If stream is empty then Optional will be empty (we do not deal with null at all)
        // terminalStream();
        reduceStream();
    }

    private static void reduceStream() {

    }

    private static void terminalStream() {
        List<String> names = Arrays.asList("Alan", "Brian", "Colin");
        Predicate<String> pred = n -> n.startsWith("A");
        System.out.println(names.stream().allMatch(pred));
        System.out.println(names.stream().noneMatch(pred));

        // bo
//        Predicate<String> pred1 = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return false;
//            }
//        };
//        Predicate<String> pred2 = s -> s.startsWith("A");

        Stream<String> names2 = Stream.of("Cathy", "Pauline", "Zoe");
        names2.forEach(System.out::println);
    }

    private static void optionalStream() {

        /*
        min(Comparator<? super String> comparator)
        Comparator<? super Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        Comparator<? super String> comparator2 = (a, b) -> a.length() - b.length();

         */



        Optional<String> min = Stream.of("deer", "horse", "pig", "cat")
                .min((s1, s2) -> s1.length() - s2.length());  // min(Comparator<? super String> comparator)
        min.ifPresent(System.out::println);

        // lub
        Optional<String> min2 = Stream.of("deer", "horse", "pig", "cat")
                .min(Comparator.comparingInt(String::length));  // min(Comparator<? super String> comparator)
        min2.ifPresent(System.out::println);




        Optional<Integer> max = Stream.of(4, 6, 2, 12, 9)
                .max(Comparator.comparingInt(i -> i));
        max.ifPresent(System.out::println);
        // lub
        Optional<Integer> max2 = Stream.of(4, 6, 2, 12, 9)
                .max(Comparator.comparingInt(i -> i));
        max2.ifPresent(System.out::println);


        Optional<String> any = Stream.of("John", "Paul")
                .findAny();
        any.ifPresent(System.out::println);  //John usually :)

        Optional<String> first = Stream.of("John", "Paul")
                .findFirst();
        first.ifPresent(System.out::println);  //John
    }



    private static void infiniteStream() {
        // infinite stream of random unordered numbers
        // between 0 ... 9
        // Stream<T> generate(Supplier<T> s)
        // Supplier :    has method  T get();

        Stream<Integer> infStream = Stream.generate(
                () -> (int) (Math.random() * 10)
        )
                .limit(10);
        //  infinite call  - to stop Ctrl+Z
         infStream.forEach(System.out::println);

        /*
        UnaryOperator<Integer> integerUnaryOperator1 = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n) {    //R apply(T t);
                return n+1;
            }
        };
        //lub lambda
        UnaryOperator<Integer> integerUnaryOperator = n -> n+1;

         */

        Stream<Integer> infStream2 = Stream.iterate(2, n -> n+1)         //   pierwsze raz(2, 3)   drugi (3, 4)  trzeci (4, 5)  etc
                .limit(10);

        infStream2.forEach(System.out::println);
    }

    private static void streamFromFileLines() {
        String fileName = "src/example.txt"; // Assuming example.txt exists in the current directory

        List<String> items = new ArrayList<>();


        try (Stream<String> linesStream = Files.lines(Paths.get(fileName))) {
            linesStream.forEach( line -> {
                        String[] itemsArray = line.split("/");
                        items.add(itemsArray[0]);
                    });
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
        items.forEach(System.out::println);
    }


    private static void streamOfExample() {
        Stream<Integer> streamI = Stream.of(1, 2, 3);
        System.out.println(streamI.count());

        Stream<String> streamS = Stream.of("sss", "rrr", "oooo");
        System.out.println(streamS.count());

        Stream<Dog> streamO = Stream.of(new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog());
        System.out.println(streamO.count());
    }

    private static void mapStreams() {
        //Map
        // Mapy nie imlementują wprawdzie interfejsu Collection<E>, ale są także częścią Java Collections API.
        // Mapy<K, V> i Collection<E> łączymy za pomocą metod Map  entrySet() to return a Set view of the Ma:  Set<Map.Entry<K, V>> entrySet();  bo public interface Set<E> extends Collection<E> {
        // Set<E> is Collection
        Map<String, Integer> namesToAges = new HashMap<>();
        namesToAges.put("Mike", 22);
        namesToAges.put("David", 11);
        namesToAges.put("Tom", 44);

        Long ile = namesToAges
                .entrySet()    // first convert MAp to Set<E> whis implement stream() method because it inherited from Collectoion<E> interface  (Set<E> extende Collection<E>)
                .stream()    // stream() is default method in Collection<E>
                .count();
        System.out.println(ile);
    }

    private static void collectionStreams() {
        //Collection
        List<String> names = Arrays.asList("April", "Ben", "Charlie", "David", "Benildus", "Christian");
        // using stream() method, which is defalt method in Collection Interface
        // and therefore is inherited by all classes that implement Collection.
        Stream<String> straemOfNames = names.stream();
        System.out.println(straemOfNames.count());
    }

    private static void beneficialOfUsingSreamsLazyOPerationPipeline() {
        Stream.of("Alex", "David", "April", "Edward")
                .map(s -> {
                    System.out.println("map: " + s);  // intermediate operation (pośrednia operacja)
                    return s.toUpperCase();
                })
                .anyMatch(s -> {  // ends when first true is returned (Alex)
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });


        List<String> names = Arrays.asList("April", "Ben", "Charlie", "David", "Benildus", "Christian");
        names.stream()
                .peek(System.out::println)
                .filter(s -> {
                    System.out.println("filter1: " + s);
                    return s.startsWith("B") || s.startsWith("C");
                })
                .filter(s -> {
                    System.out.println("filter2: " + s);
                    return s.length() > 3;
                })
                .limit(1)  // intermediate operation (pośrednia operacja)  Stream<T> limit(long)
                .forEach(System.out::println);  // terminate operation

    }

    private static void lazyRetrieveDataPipeline() {
        Stream.of("Alex", "David", "April", "Edward")
                .filter(s -> {
                            System.out.println("filter: " + s);
                            return true;
                        }
                )
                .forEach(s -> System.out.println("forEach: " + s));   // forEach is terminal operation
    }

    private static void firstPipeline() {
        List<Double> temps = Arrays.asList(99.9, 100.2, 89.88, 102.91);

        Long howManyTempsGreaterThen100Degr =
                temps
                        .stream()
                        // .peek(System.out::println)
                        .filter(t -> t > 100)
                        .peek(System.out::println)
                        .count();
        System.out.println("wynik: " + howManyTempsGreaterThen100Degr);
    }
}




















































