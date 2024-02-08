import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        // firstPipeline();
        //  lazyRetrieveDataPipeline();
        // beneficialOfUsingSreamsLazyOPerationPipeline();

        // collectionStreams();
        //   mapStreams();
        // streamOfExample();
        streamFromFileLines();
    }

    private static void streamFromFileLines() {
        String fileName = "src/example.txt"; // Assuming example.txt exists in the current directory
        try (Stream<String> linesStream = Files.lines(Paths.get(fileName))) {
            linesStream.forEach(System.out::println); // Print each line to the console
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
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




















































