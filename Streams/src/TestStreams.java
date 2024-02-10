import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        // firstPipeline();
        // lazyRetrieveDataPipeline();
        // beneficialOfUsingSreamsLazyOPerationPipeline();
        // collectionStreams();
        // mapStreams();
        // streamOfExample();
        // streamFromFileLines();
        // infiniteStream();
        // optionalStream();    //Optional<T> it replace null - If stream is empty then Optional will be empty (we do not deal with null at all)
        // terminalStream();
        // reduceWithoutOptionalStream();  // allways will return some value
        reduceWithOptionalStream();    // samethimes stream could be empty ( return null )
    }

    private static void reduceWithOptionalStream() {
        // Optional<T> reduce (BinaryOperator<T> accumulator)
        // When leave out the identity parameter,  an Optional is
        // returned because there may not be any data (all elements may be filtered earlier).
        // We have 3 possibilities:
        // 1. empty stream => empty Optional returned
        // 2. one element in stream => that element is returned
        // 3. multiple elements in strem=> accumulator is applied

        BinaryOperator<Integer> op = (a,b)-> a + b;

        Stream<Integer> empty = Stream.empty();
        empty.reduce(op).ifPresent(System.out::println);  // null => empty

        Stream<Integer> oneElement = Stream.of(6);
        oneElement.reduce(op).ifPresent(System.out::println);  //6

        Stream<Integer> multipleElements = Stream.of(3, 4, 5);
        multipleElements.reduce(op).ifPresent(System.out::println);  // 12

        Integer val = Stream.of(1, 1, 1)
                .filter(i -> i > 5)  // nie będzie żadnych elementów
                .reduce(1, (a, b) -> a);
        System.out.println(val);

        // step1:  1  wzięta z initiala
        // step2:  1
        // step3:  1
        // step4:  1
        //final: 1

        Stream<Integer> sval = Stream.of(1, 1, 1)
                .filter(i -> i > 5);  // nie będzie żadnych elementów
        sval.forEach(System.out::println);
        //Integer i = sval.reduce(1, (a, b) -> a);  //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or clos
        //System.out.println(i);
    }

    private static void reduceWithoutOptionalStream() {
        // The reduce() method combine stream into a single object.
        // Reducing it process all elements
        // starts with initial value and keep merging it with the next value and etc
        // T reduce(T identity, BinaryOperator<T> accumulator)
        //
        //             BinaryOperator<T> functionl method:  T apply(T, T);

        //   T identity   - is the initial value of the reduction and alse what is returned if stream is empty.
        // Acumulator combined the current result with the curr value in the stream.

        BinaryOperator<String> stringBinaryOperator = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return null;
            }
        } ;
        //as lambda
        BinaryOperator<String> aslambda = (s1, s2) -> s1+s2;

        // Example of reduction

        String combineLetters = Stream.of("s", "e", "a", "n")
               // .filter(s -> s.length() > 2)
               // .reduce("nothing", (s, c) -> s + c);
                        .reduce("", (s, c) -> s + c);

        // step1:  ""+s        initial value is empty
        // step2:  s+e         accumulating
        // step3:  se+a         accumulating
        // step4:  sea+n         accumulating
        // finish:  sean
        System.out.println(combineLetters);  // sean



        String combineLetters2 = Stream.of("s", "e", "a", "n")
          .filter(s -> s.length() > 2)   // to nam wszysko wyklucza
         .reduce("nothing", (s, c) -> s + c);    // i zostanie tylko initial
        System.out.println(combineLetters2);   // nothing

        Integer i = Stream.of(1, 2, 3)
                .reduce(1, (a,b) -> a * b);
         // step1: 1*1 =1
         // step2: 1*2 =2
         // step3: 2*3 =6
        System.out.println(i);   // 6

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



















































