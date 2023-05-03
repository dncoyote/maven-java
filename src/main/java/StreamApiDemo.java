import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] arg) {
        List<Integer> num = Arrays.asList(4, 5, 7, 8, 9);

        // saves list into a stream
        Stream<Integer> data = num.stream();
        data.forEach(n -> System.out.println(n));

        //filter odd numbers only
        num.stream()
            .filter(n -> n%2==1)
            .sorted()
            .map(n->n*2)
            .forEach(n-> System.out.println(n));
        // stream can only be used once
        // data.forEach(n -> System.out.println(n));

        Predicate<Integer> predicate = n -> n % 2 == 1;

        num.stream()
                .filter(predicate)
                .sorted()
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
    }
}
