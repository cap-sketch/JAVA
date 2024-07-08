package java_class;

import java.util.Scanner;

public class percentage {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        int per=sum/5;
        System.out.println("the percentage is :"+per);
    }
}
