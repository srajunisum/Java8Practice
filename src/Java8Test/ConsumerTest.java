package Java8Test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.setName("sidda raju");

        Consumer<Integer> integerConsumer = (a)-> {System.out.println("first = " + a);};
//        integerConsumer.accept(2);

        Consumer<Integer> integerConsumer2 = (a)-> {System.out.println("second = " + a);

        };
//        integerConsumer.accept(3);

        Consumer<Employee> employeeConsumer = employee1 -> {
            String name = employee1.getName().toUpperCase();
            System.out.println("name = " + name);
        };
        Consumer<Employee> employeeConsumer1 = employee1 -> {
            String name = employee1.getName().toUpperCase();
            System.out.println("name = " + name);
        };
        employeeConsumer.accept(employee);

        integerConsumer2.andThen(integerConsumer).accept(8);

        BiConsumer<Integer , Integer > intBiConsumer = (a,b)->{
            System.out.println( a+b);
        };

        intBiConsumer.accept(1,2);

    }
}
