package Java8Test;

import java.util.function.Supplier;

public class SupplierTest {


    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("sidda raju");

        Supplier<String> stringSupplier = () -> {
            return employee.getName();
        };
        System.out.println("Supplier = " + stringSupplier.get());
    }
}
