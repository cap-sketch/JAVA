package unit3;
@FunctionalInterface         //type annotation
interface Calculator{
    int sum(int a,int b);
}
public class lambda_expression {
    public static void main(String[] args) {
        //lambda expression to implement the calculate method of interface
        Calculator c=(a,b) -> a+b;

        //using lambda expression
        System.out.println("addition result: "+ c.sum(5,6));
    }
    
}
