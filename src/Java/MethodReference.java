public class MethodReference {

    public MethodReference(){
        System.out.println("constructor");
    }

    public static void method1(){
        System.out.println("static method");
    }

    public void method2(){
        System.out.println("Instance method");
    }

    public static void main(String[] args) {

        TestMethodReference reference = MethodReference::method1;
        reference.method();
        TestMethodReference reference1 = new MethodReference()::method2;
        reference1.method();
        TestMethodReference reference2 = MethodReference::new;
        reference2.method();
    }
}

interface TestMethodReference {
    public void method();
}
