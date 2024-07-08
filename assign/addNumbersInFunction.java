package assign;
import java.util.Scanner;

public class addNumbersInFunction {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter any two numbers: ");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=sum(a,b);
        System.out.println("sum of "+a+" and "+b+" is "+c);
    }
}
