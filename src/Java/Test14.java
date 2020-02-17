interface Operation{

    String myName(String name);
}

public class Test14 {

    public static void main(String[] args){

        Operation oper = (name)-> {return name;} ;
        System.out.print(oper.myName("Raj"));
    }

}
