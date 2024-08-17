public class Exceptions {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            int div=a/b;
            System.out.println(div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("you cannot divide bro..");
        }
    }
}
