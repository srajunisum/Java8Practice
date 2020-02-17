interface sayable{
    void say();
}


public class MethodRef {

    public static void saysomethind(){
    System.out.print("hi");
    }
    public static void main(String[] args){
    sayable sayable = MethodRef::saysomethind;
    sayable.say();
    }
}
