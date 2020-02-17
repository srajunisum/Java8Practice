import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args){

        Compare compare = (a,b)->{return a>b;};
        System.out.println(compare.compare(0,1));
        List<String> names = new ArrayList<>();
        names.add("Hai");
        names.add("Hello");
        names.add("How r u");

        //with stream
        names.stream().forEach((String)-> {System.out.println(String);});
       // names.forEach(System.out::println);
        Object o = new Object();

       // without stream
        for (String name:names) {
            System.out.println("name = " + name);

        }
    }

}

interface Compare{
    public boolean compare(int a,int b);
}