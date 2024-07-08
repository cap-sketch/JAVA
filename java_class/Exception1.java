package java_class;

public class Exception1 {
    public static void divide(int a ,int b) throws ArithmeticException
    {
        try {
            System.out.println(a/b);
        } catch (Exception e) {
          System.out.println("exception handled");
        }
       
        
    }
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            if(b==0)
            throw new ArithmeticException("this is exception 1");
            System.out.println(a/b);

        }catch(ArithmeticException e)
        {
           System.out.println(" this is exception 2");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println();
            System.out.println(e.toString());
            System.out.println();
            System.out.println(e.getMessage());
        }
        divide(a, b);
    }
}
