import javafx.print.Collation;

import java.util.*;
import java.util.stream.Collectors;

public class FindDup {

    public static void main(String[] args) {


        ArrayList list = new ArrayList(Arrays.asList(1,2,2,3,4,5,6,7,4,7));


       /*
       remove duplicates

       list.stream().distinct().forEach(i->{
            System.out.println(i);
        });*/

       //list.stream().filter(i -> Collections.frequency(list, i) >1).collect(Collectors.toSet()).

        List<Object> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(31);
        List<Object> list12 = new ArrayList<>();
        list12.add(5);
        list12.add(1);
        list12.add(2);
        list12.add(6);
        list12.add(4);
        list12.add(3);

        list12.stream().filter(list1::contains).collect(Collectors.toList());
        System.out.println("list12.contains(list1) = " + list1.contains(list12));

//        System.out.println("list12--------------- = " + list12.containsAll(list1));

        List<Object> intersect = list1.stream()
                .filter(list12::contains)
                .collect(Collectors.toList());

        System.out.println("intersect = " + intersect );

        list1.containsAll(list12);
        List<Integer> numbers = Arrays.asList(new Integer[]{2,1,3,4});

       /* Set<Object> allItems = new HashSet<>();
        list.stream().forEach(i->allItems.add(i));
        allItems.forEach(i->{
            System.out.println(i);
        });*/

       numbers.stream().filter(i-> Collections.frequency(numbers,i)>1)
                .collect(Collectors.toSet()).forEach(System.out::println);

        list1.stream().filter(i->Collections.frequency(list1,i)>1)
                .collect(Collectors.toSet()).forEach(System.out::println);

    }
}
