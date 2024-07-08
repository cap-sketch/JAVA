package java_class;

import java.util.Scanner;

public class multiplication_table {
    public static void table(int n)
    {
        for(int i=0;i<=10;i++)
        System.out.println(i*n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        table(n);
    }
}
