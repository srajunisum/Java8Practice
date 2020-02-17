import java.util.Arrays;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of empty string
        System.out.println("strings = " + strings.parallelStream().filter(string -> string.isEmpty()).count());
        strings.parallelStream().filter(string -> string.isEmpty()).count();
    }
}
