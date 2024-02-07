import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStreams {

    public static void main(String[] args) {

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




















































