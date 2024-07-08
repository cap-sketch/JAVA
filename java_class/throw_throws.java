package java_class;

import java.util.InputMismatchException;

public class throw_throws {
    public static double area(int r)
    {
        if(r<0)
        {
            throw new InputMismatchException("i am area exception");
        }
        double result=Math.PI *r*r;
        return result;
    }
    //throws give a message ya sanket ki ye exception throw ho skti hai
    //so better be prepared with try catch block.
    public static int divide(int a,int b) throws ArithmeticException
    {
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
        
        int c;
        try {
           c=divide(6,0);  
           System.out.println(c);  
        } catch (Exception e) {
            System.out.println("exception");
        }
        double r=area(50);
        System.out.println(r);
    }
}
