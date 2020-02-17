package Java8Test;

public class MethodRefTest {

    MethodRefTest(){
        System.out.println("Constructor ref" );
    }
    public static void main(String[] args) {

        MethodRef instanceMethodRef = new InstanceMethod()::instanceMethod;
         instanceMethodRef.testMethod();
        MethodRef staticMethodRef = StaticMethod::staticMethod;
        staticMethodRef.testMethod();
        ConstructorRef constructorRef = MethodRefTest::new;
        constructorRef.constructTest();

    }
}

class InstanceMethod {
    public void instanceMethod(){
        System.out.println("Instance Method");
    }
}

class StaticMethod {
    public static void staticMethod(){
        System.out.println("Static Method");

    }
}

interface MethodRef {

    void testMethod();
}

interface ConstructorRef {
    MethodRefTest constructTest();
}
