package Java8Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId("1");


    List<Integer> integersList = Arrays.asList(1,2,3,3,4,4,5,56);
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {

                return o.equals(32);
            }
        };
        System.out.println("predicate = " + predicate.test(32));

        Predicate<Integer> predicate2 = a -> a<1;
        System.out.println("predicate2 = " + predicate2.test(2));

        Predicate<Integer> integerPredicate = i-> i==1;
        System.out.println(integerPredicate.test(1));

        Predicate<Employee> employeePredicate = (emp) -> {
          return emp.getId().equals("1");
        };
        System.out.println("employeePredicate = " + employeePredicate.test(employee));

        BiPredicate<Integer,Integer> biPredicate = (a,b)->a<b;
        System.out.println("biPredicate.test = " + biPredicate.test(3,2));

        TriPredicate<Integer,Integer,Integer>  triPredicate  = (a,b,c) -> a+b>c;
        System.out.println("triPredicate = " + triPredicate.test(1,2,3));
    }
}
interface TriPredicate<T,U,X> {
     boolean test(T t, U u, X x);
}
