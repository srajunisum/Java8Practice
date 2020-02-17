package Java8Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("sidda raju");

        Employee employee2 = new Employee();
        employee2.setName("sidda raju");

        Function<Integer,Integer> integerIntegerFunction = a-> {return a;};
        System.out.println("integerIntegerFunction = " + integerIntegerFunction.apply(2));

        Function<Employee,String> stringFunction = emp -> {return emp.getName(); };

        System.out.println("stringFunction = " + stringFunction.apply(employee));

        BiFunction<Employee,Employee,String> biFunction = (emp1,emp2)-> {
          return  emp2.getName()+emp1.getName();
        };
        System.out.println("biFunction = " + biFunction.apply(employee,employee2));


    }
}
