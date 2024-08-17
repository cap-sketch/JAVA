public class throws_keyword {
    static int div(int a,int b) throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
        div(a,b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception is caught");
        }
    }
}
