import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
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
        // reduceWithOptionalStream();    // samethimes stream could be empty ( return null )
        // reduceBiFunctionAndBinaryOperatorStream();
        // mutableCollection();  // collect() - for mutable object (tłum. zmienny) mutuable object:  StringBuilder and ArrayList  collect()
        // preDefinedCollectors();
        // collectingIntoMap();
        collectorsGroupingBy();
    }

    private static void collectorsGroupingBy() {
        // groupingBy() tells collector to group all elements into Map
        // groupingBy() takes Function Interface which determines the key in the Map
        // Each value is a List of all entries that match the key. The List is a default, which can be changed

        /*
            public static <T, K> Collector<T, ?, Map<K, List<T>>>
                  groupingBy(Function<? super T, ? extends K> classifier) {
                                                                           return groupingBy(classifier, toList());
                                                                           }


              public interface Function<T, R> {   R apply(T t);   }


        */

        // Example.1
        Stream<String> names = Stream.of("Joe", "Tom", "Tom", "Alan", "Peter");
        Map<Integer, List<String>> map =
                names.collect(
                // passing in a Function that determines the key in Map
                        Collectors.groupingBy(s -> s.length())   // OR String::length
        );
        System.out.println(map);

        // Example.2   we want Set instead of List as the value in the map (Set will remove duplication of "Tom")

        /*
            public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
                                          Collector<? super T, A, D> downstream) {
                                                                                  return groupingBy(classifier, HashMap::new, downstream);
                                                                                    }
        */

        Stream<String> names2 = Stream.of("Joe", "Tom", "Tom", "Alan", "Peter");
        Map<Integer, Set<String>> map2 =
                names2.collect(
                        Collectors.groupingBy(
                                String::length,  // key function   Function<? super T, ? extends K> classifier
                                Collectors.toSet() // what to do with the values
                        )
                );
        System.out.println(map2);

        // Example.3
        // We want to TreeMap but leave the values as a List.
        // We must then use Optional map Suppier while passing down the toList() collector.

        Stream<String> names3 = Stream.of("Joe", "Tom", "Tom", "Alan", "Peter");
        TreeMap<Integer, List<String>> map3 =
                names3.collect(
                        Collectors.groupingBy(
                                String::length,
                                TreeMap::new,   //map type Supplier
                                Collectors.toList()  // downstream collector
                        )
                );
        System.out.println(map3);
        System.out.println(map3.getClass());
    }

    private static void collectingIntoMap() {
        // We will required two function
        // 1. tell collector how to create the key
        // 2. tell collector how to create the value

        //Example - we want to map: dessert name -> number of chars in deseret name
        // Output:  {biscuit=8, cake=4, appletarrt=10}

        Function<String, String> keyMapper1 = new Function<>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };
        //lambda
        Function<String, String> keyMapper2 = s -> s;
        String  key = keyMapper2.apply("cake");

        Function<String, Integer> keyValueMapper = new Function<>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        //lambda
        Function<String, Integer> keyValueMapper2 = s -> s.length();
        Integer keyValue = keyValueMapper2.apply("cake");


        // Example.1
        Map<String, Integer> map = Stream.of("cake", "biscuit", "tart")
                .collect(Collectors.toMap(
                        s -> s,           //key:       input String, return String
                        s -> s.length()   //keyValue:  input String, return Integer
                ));
        System.out.println(map);



        BinaryOperator<String> merge = new BinaryOperator<String>() {
            @Override
            public String apply(String s1, String s2) {
                return s1 + ", " + s2;
            }
        };
        // lambda
        BinaryOperator<String> merge2 = (s1, s2) -> s1 + ", " + s2;
        String mergedStrings = merge2.apply("kaka1", "kaka12");



        // Example.2
        /*
        Returns a Collector that accumulates elements into a Map whose keys and values are the result
        of applying the provided mapping functions to the input elements.
If the mapped keys contain duplicates (according to Object.equals(Object)), the value mapping function
is applied to each equal element, and the results are merged using the provided merging function.
Params:
keyMapper     – a mapping function to produce keys
valueMapper   – a mapping function to produce values
mergeFunction – a merge function, used to resolve collisions between values associated with the same key,
                as supplied to Map.merge(Object, Object, BiFunction)
        */

        Map<Integer, String> map2 = Stream.of("cake", "biscuit", "tart", "tart", "tart", "tart", "tart")
                .collect(
                        Collectors.toMap(
                                s -> s.length(), //key is the lenght
                                s -> s,  //value is the String
                                (s1, s2) -> s1 + ", " + s2)  //Merge function - what to do if we have duplicate keys
                                                             // - append the values
                );
        System.out.println(map2);



        // Example.3
        // The maps returned are HashMaps. If we want to have a TreeMap (values will be sorted automaticly)
        TreeMap<String, Integer> treeMap = Stream.of("cake", "biscuit", "tart")
                .collect(
                        Collectors.toMap(
                                s -> s,   //key is the String
                                s -> s.length(),  //value is the length of the String
                                (len1, len2) -> len1 + len2,  //want to do if we have duplicate keys -- add the value
                                () -> new TreeMap<>()   //TreeMp::new  not works!!!  TreeMap is not part of Collector and Map
                                                        // nie imlementują interfejsu Collection<E>
                        )
                );

        /*
            Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
                             Function<? super T, ? extends U> valueMapper,
                             BinaryOperator<U> mergeFunction,
                             Supplier<M> mapFactory) {
        */

    }

    private static void preDefinedCollectors() {
      // Access these collectors via static methods on the Collector  interface
      // It is important to pass the Collector to collect() method. Collector do not do anything
        // It helps collect elements

        String s = Stream.of("cake", "biscuit", "alle tart")
                .collect(Collectors.joining(", "));
        System.out.println(s);


        //  averagingInt(ToIntFunction<? super T> mapper)    functional method is:
        //    int applyAsInt(T value);
        ToIntFunction<String> toIntFunc = new ToIntFunction<>() {
            @Override
            public int applyAsInt(String s) {
                return s.length();
            }
        };
        // lambda
        ToIntFunction<String> lambda = f -> f.length();

        Double avg = Stream.of("cake", "biscuit", "alle tart")
                .collect(Collectors.averagingInt(f -> f.length()));
        System.out.println(avg);
    }

    private static void mutableCollection() {
        // mutuable object:  StringBuilder and ArrayList
        // we use the same mutable (zmienny)object while accumulating
        // this make more efficient then regular reductions
        // Useful method when let us get data out of streams and put into Map, List, Set

        //  StringBuilder collect (Supplier<StringBuilder> supplier,
        //                       BiConsumer<StringBuilder, String> accumulator,
        //                       BiConsumer<StringBuilder, StringBuilder> combiner)
        // help us control over how collecting should work.
        // Accumulator adds an element to the collection - next String to StringBuilder
        // Combiner takes two collections and merge them. It is usefull in pararell processing.

        Supplier<StringBuilder> supplier = new Supplier<>() {
            @Override
            public StringBuilder get() {
                return new StringBuilder();
            }
        };
        // lambda(s)
        Supplier<StringBuilder> supplier2a = () -> new StringBuilder();
            //lub
        Supplier<StringBuilder> supplier2b = StringBuilder::new;

        BiConsumer<StringBuilder, String> consumer = new BiConsumer<StringBuilder, String>() {
                @Override
                public void accept(StringBuilder sb, String s) {
                    sb.append(s);
                }
        };
        // lambda
        BiConsumer<StringBuilder, String> consumer1 = (sb, s) -> sb.append(s);

        BiConsumer<StringBuilder, StringBuilder> consumer2 = new BiConsumer<StringBuilder, StringBuilder>() {
                @Override
                public void accept(StringBuilder sb1, StringBuilder sb2) {
                    sb1.append(sb2);
                }
        };
        //lambda
        BiConsumer<StringBuilder, StringBuilder> consumer3 = (sb1, sb2) -> sb1.append(sb2);

        //Example
        StringBuilder word = Stream.of("ad", "jud", "i", "cate")
                    .collect(StringBuilder::new,
                            (sb, s) -> sb.append(s),
                            (sb1, sb2) -> sb1.append(sb2)
                    );
        System.out.println(word);

    }

    private static void reduceBiFunctionAndBinaryOperatorStream() {
        /*
        <U> U reduce (U identity,
                      BiFunction accumulator,
                      BinaryOperator combiner)
         We use it when dealing with differennt types,
         allow to create intermediate reductions  (pośrednie redukcje) and finaly combine themm at end
         Useful when working with parallel streams. Streams can be decomposed and reassembled by separate
         treads.
         "car" and "bus" is taken as first thread  - it gives 6
         "train" and "aeroplane" is taken as second thread  - it gives 14
         then it goes to combiner and gives 6+14=20
         */
        Stream<String> stream = Stream.of("car", "bus", "train", "train", "aeroplane");
        int lenghtOfAllLetters = stream
                .reduce(0,
                        (n, str) -> n + str.length(),   //accumulator give two treads: one 6 letters  second 14 letters
                        (n1, n2) -> n1 + n2);   // na samym końcu uruchamia się,zlicza wartości pośrednie
                                                // z wątków pośrednich zliczających iloci znaków
                                                // combiner give 20
        System.out.println(lenghtOfAllLetters);

        BiFunction<Integer, String, Integer> accumulator = new BiFunction<Integer, String, Integer>() {
            @Override
            public Integer apply(Integer n, String s) {
                return n + s.length();
            }
        };
        // lambda
        BiFunction<Integer, String, Integer> lambda = (n, s) -> n + s.length();

        BinaryOperator<Integer> combiner = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n1, Integer n2) {
                return n1 + n2;
            }
        };
        BinaryOperator<Integer> combLambda = (n1, n2) -> n1 + n2;
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
                .filter(i -> i > 1115)  // nie będzie żadnych elementów po tym filtrze, jednak reduce() i tak bieze te elementy
                .reduce(1, (a, b) -> a);  //
        System.out.println(val);

        // step1:  1  wzięta z identity
        // step2:  1
        // step3:  1
        // step4:  1
        //final: 1

        Stream<Integer> sval = Stream.of(1, 1, 1)
                .filter(i -> i > 5);  // nie będzie żadnych elementów
        sval.forEach(System.out::println);
        // Integer i = sval.reduce(1, (a, b) -> a);  //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or clos
        // System.out.println(i);

        Collection<Integer> cval = Stream.of(1, 1, 1)
                .filter(i -> i > 5)
                .collect(Collectors.toList());
        System.out.println(cval);

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




















































