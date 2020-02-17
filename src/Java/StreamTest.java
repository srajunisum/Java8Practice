import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,3,2,4,6,5,98,8,7,5,1);
        List<Integer> nums= Arrays.asList(1,3,2,4,6,5,98,8,7,5,1);
        List<String> names = new ArrayList<>();
        names.add("Hi");
        names.add("Hello");
        names.add("how");
        names.add("R");
        names.add("U");
        names.add("Raj");
        names.add("Sidda");
        names.add("Sidda");

      //  System.out.println("names = " + names.stream().allMatch(n->!n.isEmpty()));
//      names.stream().allMatch(n->!n.isEmpty());

//        names.stream().forEach(System.out::println);
    //    names.stream().forEach(n->{System.out.println(n);});

      //names.stream().limit(2).forEach(System.out::println);
       List<Integer> number = numbers.stream().map(n-> n ).sorted().distinct().collect(Collectors.toList());
       System.out.println(number);
//        System.out.println("number = " + names.stream().sorted().distinct().collect(Collectors.counting()));

//        System.out.println("number = " + names.stream().sorted().distinct().collect(Collectors.joining()));

//        numbers.stream().forEach(n->{System.out.println(n);});
//        System.out.println("number = " + numbers.stream().map(n->n).reduce(0,Integer::sum));
//        System.out.println("number = " + numbers.stream().filter(n->n>4).map(n->n).collect(Collectors.toList()));
//        System.out.println("number = " + numbers.stream().map(n->n).collect(Collectors.summarizingInt(n->n)));
      //  System.out.println("number = " + numbers.stream().mapToInt(Integer::intValue).sum());
//        System.out.println("number = " + numbers.stream().min((a,b)->a>b?1:-1).get());
//        System.out.println("number = " + numbers.stream().collect(Collectors.toSet()));
// System.out.println("number = " + numbers.stream().distinct().sorted().collect(Collectors.toList()));


    }
}
