package Put_exam;
//try catch block
public class Exception1 {
    public static void main(String[] args) {
        try{
            int a=5/0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println("you cannot divide");
        }
        System.out.println("the rest code is here...");

    }
}
