package Put_exam;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

