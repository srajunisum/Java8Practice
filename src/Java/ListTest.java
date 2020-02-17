import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stream<Integer> stream = list.stream().filter(n -> n <= 2);

        stream.forEach(n -> System.out.print(n));

        EmployeeTest employeeTest = new EmployeeTest();
        employeeTest.setAddress("hyd");

        employeeTest.setName("raj");
        EmployeeTest employeeTest1 = new EmployeeTest();
        employeeTest1.setId("1");
        employeeTest1.setAddress("rr");
        employeeTest1.setName("raju");
        EmployeeTest employeeTest2 = new EmployeeTest();
        employeeTest2.setAddress("rrb");
        employeeTest2.setName("kumar");
        EmployeeTest employeeTest3 = new EmployeeTest();
        employeeTest3.setAddress("rrb");
        employeeTest3.setName("kumar");
        EmployeeTest employeeTest4 = new EmployeeTest();
        employeeTest4.setAddress("hyd");

        employeeTest4.setName("raj");
        EmployeeTest employeeTest5 = new EmployeeTest();
        employeeTest5.setAddress("hyd");

        employeeTest5.setName("raj");
        EmployeeTest employeeTest6 = new EmployeeTest();
        employeeTest6.setAddress("hyd");

        employeeTest6.setName("raj");
        EmployeeTest employeeTest7 = new EmployeeTest();
        employeeTest7.setAddress("hyd");
        employeeTest7.setName("raj");
        List<EmployeeTest> employeeTests = new ArrayList<>();
        employeeTests.add(employeeTest);
        employeeTests.add(employeeTest1);
        employeeTests.add(employeeTest2);
        employeeTests.add(employeeTest3);
        employeeTests.add(employeeTest4);
        employeeTests.add(employeeTest5);
        employeeTests.add(employeeTest6);
        employeeTests.add(employeeTest7);


        System.out.println("employeeTests = " + employeeTests);
        List<EmployeeTest> collect = employeeTests.stream().filter(i -> i.getId() == null).collect(Collectors.toList());
        System.out.println(collect);
        LocalDateTime localDateTime = withParse(employeeTests);
//        System.out.println("localDateTime = " + localDateTime);
    }


    public static LocalDateTime withParse(List<EmployeeTest> list) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);
            List<EmployeeTest> collect = list.stream().filter(i -> i.getId() == null).collect(Collectors.toList());
        LocalDateTime dateTime2 = LocalDateTime.now();
        System.out.println("dateTime2 = " + dateTime2);
        return dateTime;
    }
}
