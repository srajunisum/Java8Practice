import javafx.print.Collation;
import sun.text.resources.CollationData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ForEach {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7);
        System.out.println("integers = " + integers.stream().collect(Collectors.toSet()));

        integers.stream().forEach(i-> System.out.println("i = " + i));
    }
}
