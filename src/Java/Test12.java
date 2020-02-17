interface operation{
    int operation(int a,int b);
}

public class Test12 {


    public static void main(String[] args){
        Test12 test12 = new Test12();

        operation operation = (a,b)->(a+b);

        System.out.print(operation.operation(1,2));
    }
}
