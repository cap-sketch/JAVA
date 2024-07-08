package java_class;

import java.util.Scanner;

public class Specific_exception {
    public static void main(String[] args) {
      int marks[]=new int[3];
      marks[0]=7;
      marks[1]=56;
      marks[2]=6;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array index");
      int d=sc.nextInt();
     
      System.out.println("enter the number to divide");
      int number=sc.nextInt();

      try {
        System.out.println("the value at array index : "+ marks[d]);
        System.out.println("the vlaue of divided number is: "+marks[d]/number);
      } catch (ArithmeticException e) {
        System.out.println("some exception 1 have occured");
        System.out.println(e);
      }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("some exception 2 have occured");
            System.out.println(e);
      }
      catch(Exception e)
      {
        System.out.println("some other exception occured");
      }
    }
}
