public class MathOperation {
    public static void main(String[] arg){

        MathOperation operation = new MathOperation();
    MathOper add = (a,b)->(a+b);
    MathOper sub = (a,b)->(a-b);
    MathOper div = (a,b) ->(a/b);
    MathOper mul = (a,b) -> (a*b);
    System.out.println(operation.operate(1,2,add));
    System.out.println(operation.operate(4,3,sub));
    System.out.println(operation.operate(4,2,div));
    System.out.println(operation.operate(2,3,mul));
    }

   private int operate(int a,int b,MathOper mathOper){
        return mathOper.operation(a,b);
    }
}
interface MathOper{
    int operation(int a,int b);
}
