package assign;
import java.util.Scanner;

public class average {
    public static void sum(int a,int b,int c)
    {
        int d=(a+b+c)/3;
        System.out.println("the average is "+d);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sum(a,b,c);
    }
}
