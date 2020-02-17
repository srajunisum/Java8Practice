package Java8Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationTest {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1,2,3,4,5,6));

        int c[] = {23,43,5,6};
        int a[] =  new int[20];
        a = new int[]{1, 2, 3, 4};
        String b[] = new String[30];
        b= new String[]{"a","b","c","d","e"};
        IntStream stream = Arrays.stream(a);
        Stream<String> stream1 = Arrays.stream(b);
        System.out.println("Array Stream count = " + stream1.count());


        Employee employee = new Employee();
        employee.setName("sidda raju");
        Stream<Employee> employeeStream = Stream.of(employee);
        System.out.println("employeeStream count = "+employeeStream.count());

        Stream<Object> emptyStream = Stream.empty();
        System.out.println("emptyStream = " + emptyStream.count());

        Stream.Builder<int[]> builder = Stream.builder();
        Stream<int[]> buiderStream= builder.add(c).add(a).build();
        System.out.println("buiderStream = " + buiderStream.count());
        /*buiderStream.forEach(i->{
            System.out.println("i = " + i.length);
        });*/

        Stream<Integer> iterateStream = Stream.iterate(10, (Integer i) -> i * 2).limit(2);
        iterateStream.forEach(System.out::println);

        Stream<StreamCreationTest> generateStream = Stream.generate(StreamCreationTest::new);
        generateStream.limit(3).forEach(System.out::println);

    }
}
