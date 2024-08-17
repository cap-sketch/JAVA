package unit3;
interface cal{
    int  sum(int a,int b);
}
public class lambda_expression2 {
    public static void main(String[] args) {
        cal c=(a,b)-> a+b;
        System.out.println(c.sum(5,6));

    }
}
