package Put_exam;
//throw keyword
public class Exception3 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            if(b==0)
            {
                throw new ArithmeticException("b is zero");
            }
            else
            {
                System.out.println("the result is"+a/b);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
