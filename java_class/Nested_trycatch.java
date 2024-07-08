package java_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested_trycatch {
    public static void main(String[] args) {
      int marks[]=new int[3];
      marks[0]=7;
      marks[1]=56;
      marks[2]=6;

      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of index: ");
      int ind=sc.nextInt();

        try {
            System.out.println("welcome to video no 1");
            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this index not exist");
                System.out.println("exception in level 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("exception in level 1");
        }
    }
}
