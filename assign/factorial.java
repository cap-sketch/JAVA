package assign;
import java.util.Scanner;

public class factorial {
    public static int fact(int n)
    {
        if(n==1)
        return 1;
        else
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
       Scanner ob=new Scanner(System.in);
       System.out.println("enter a number: ");
       int n=ob.nextInt();
       int x=fact(n);
       System.out.println("factorial is "+x);
    }
}
