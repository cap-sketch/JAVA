package java_class;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        
        // int a=5 syntax error(semicolon)
        int a=5;
        System.out.println(a);
        //System.out.println(a+b); syntax error(b not defined)
        int b=6;
        //logical error
        int sum=a*b;
        //exceptions=runtime error
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        try {
        System.out.println("Integre part: "+ 1000/k);
        } catch (Exception e) {
            System.out.println("you cannot divide");
        }
        
    }
}
