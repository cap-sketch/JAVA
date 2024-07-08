package assign;
import java.util.Scanner;

public class arrayNames {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String arr[]=new String[n];
        System.out.println("enter names");
        for(int i=0;i<n;i++)
        {
           arr[i]=s.next();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
