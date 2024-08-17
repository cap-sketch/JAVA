public class multi_catch {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int arr[]=new int[5];
        try{
            arr[5]=a/b;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array is short");
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide");
        }
        finally{
            System.out.println("the  code ended bro ...");
        }
    }
}
