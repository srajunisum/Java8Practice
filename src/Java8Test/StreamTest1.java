package Java8Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest1 {

    public static void main(String[] args) {

        List<Employee> empList1 = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("sidda raju");
        emp1.setId("1");
        emp1.setAddress("hyderabd");
        empList1.add(emp1);

        Employee emp2 = new Employee();
        emp2.setName("sidda raju");
        emp2.setId("2");
        emp2.setAddress("nzb");
        empList1.add(emp2);


        Employee emp3 = new Employee();
        emp3.setName("sidda raju");
        emp3.setId("3");
        emp3.setAddress("nzb");
        empList1.add(emp3);

        List<Employee> empList2 = new ArrayList<>();

        Employee empl1 = new Employee();
        empl1.setName("sidda raju");
        empl1.setId("1");
        empl1.setAddress("nalgonda");
        empList2.add(empl1);

        Employee empl2 = new Employee();
        empl2.setName("sidda raju");
        empl2.setId("2");
        empl2.setAddress("patancheru");
        empList2.add(empl2);

        Employee empl3 = new Employee();
        empl3.setName("sidda raju");
        empl3.setId("3");
        empList2.add(empl3);

        empList1.stream().forEach(i->empList2.stream()
                .filter(i1->i1.getId().equals(i.getId()))
                .filter(i1->Optional.ofNullable(i1.getAddress()).isPresent())
                .findFirst()
                .ifPresent(i1->i1.setAddress(i.getAddress())));

        empList2.stream().forEach(System.out::println);




    }
}
