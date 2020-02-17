
public class Test15 {

    public static void main(String[] args){
        Test15 test = new Test15();
        Employee employee = new Employee();
        employee.setId("1234");
        employee.setName("Raju");
        ObjectTest objectTest = (Employee emp)->{return emp;};
        Employee employee1 = objectTest.empDetails(employee);
        System.out.println(employee1.getId());

        Runnable runnable = ()->{System.out.println("Runnable");};
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
class Employee {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
