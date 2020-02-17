
interface TestAddition {
    int add(int a, int b,int c);
}

interface Hello {
    String sayHello(String hello);
}

interface TestFunInterface {
    String sayHI();

    default void printName(){
        System.out.println("Hi Raju");
    }

    static String fullName(String fname,String lname){

        return fname.concat(lname);
    }
}
public class LamdaTest {

    public static void main(String[] args){

        TestAddition addition = (a,b,c)->(a+b+c);
        System.out.println(addition.add(10,20,5));

        Hello hello = (s)->("Hello");
        System.out.println(hello.sayHello(" "));

        TestFunInterface fun = ()->("Hi");
        System.out.println(fun.sayHI());
        fun.printName();
        String s = TestFunInterface.fullName("Sidda", "Raju");
        System.out.println("fullName = " + s);
    }


}


