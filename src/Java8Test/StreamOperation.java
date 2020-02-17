package Java8Test;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.*;

public class StreamOperation {
    public static void main(String[] args) {

        Stream<Integer> allMatchStream = Stream.of(1, 2, 3, 45);
        boolean allMatch = allMatchStream.allMatch(i -> i == 2);
        System.out.println("allMatch = " + allMatch);

        Stream<Integer> anyMatchStream = Stream.of(1, 2, 3, 45);
        boolean anyMatch = anyMatchStream.anyMatch(i -> i==2);
        System.out.println("anyMatch = " + anyMatch);

        Stream<Integer> stream1 = Stream.of(1,2,4,4);
         stream1.limit(6).filter(i -> i > 1).distinct().sorted().forEach(System.out::println);

        System.out.println(" = ===== Map ====== =");
        Stream<Integer> stream2 = Stream.of(3,4,5);
        stream2.map(i->i*2).forEach(System.out::println);

        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.map(i-> {
            String concat = i.concat("d");
            return concat;
        }).forEach(System.out::println);


        Stream<String> stringStream1 = Stream.of("a", "b", "c","a","g");
        //System.out.println("stringStream1 = " + stringStream1.collect(Collectors.toList()));
        System.out.println("stringStream1 = " + stringStream1.collect(Collectors.toSet()));

        Stream<Integer> stream3 = Stream.of(3,4,5);
        IntStream intStream = stream3.mapToInt(i -> {
            return i;
        });
        // intStream.forEach(System.out::println);

        Stream<Integer> stream4 = Stream.of(3,4,5);
        LongStream longStream = stream4.mapToLong(i -> {
            return i;
        });
        //longStream.forEach(System.out::println);

        Stream<Integer> stream5 = Stream.of(3,4,5);
        DoubleStream doubleStream = stream5.mapToDouble(i -> {
            return i;
        });
        doubleStream.map(i->i-1).forEach(System.out::println);


    }
}
