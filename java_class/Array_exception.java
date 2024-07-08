package java_class;

import java.util.Scanner;

/*write a program that allow you to keep acccesing an
  array until a valid index is given by the user.
 */
public class Array_exception {
    public static void main(String[] args) {
        int arr[]=new int[10];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;

        Scanner sc=new Scanner(System.in);
        boolean flag=true;

        while(flag)
        {
            System.out.println("enter a valid index: ");
            int number=sc.nextInt();
            try {
                int c=arr[number];
                System.out.println("the array is :");
                for(int i=0;i<number;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                flag=false;
                System.out.println("thanks for using.");
            } catch (ArrayIndexOutOfBoundsException e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
        
    }
    
}
