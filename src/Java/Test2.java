
interface InterfaceTest1{
    String message(String name);
}

public class Test2 {

    public static void main(String[] args){
        InterfaceTest1 test1 = (nam) -> { return nam;};
        System.out.print(test1.message("raj"));
    }
}
