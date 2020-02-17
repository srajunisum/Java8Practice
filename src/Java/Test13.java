interface Oper {
    int sub(int a,int b);
}
public class Test13 {
    public static void main(String[] args) {
        Oper oper = (a,b)->(a-b);
        System.out.print(oper.sub(2,1));
    }
}
