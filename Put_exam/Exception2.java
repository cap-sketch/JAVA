package Put_exam;
// multiple try catch block
public class Exception2 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{
            arr[5]=50/0;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
          System.out.println("it is arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array exception");
        }
        finally{
            System.out.println("contains important code");
            System.out.println("like closing network,cleaning data,etc.");
        }
    }
    
}
