package Put_exam;

public class Exception4 {
    public static void divide(int a,int b) throws ArithmeticException
    {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        try {
            divide(5,0);    
        } catch (ArithmeticException e) {
            System.out.println("using throws keyword");
        }
        
    }
}
