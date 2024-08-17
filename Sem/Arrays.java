package Sem;
import java.util.*;
public class Arrays {

    static void printer(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements: ");
        //accessing array
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        printer(arr);

    }
}
